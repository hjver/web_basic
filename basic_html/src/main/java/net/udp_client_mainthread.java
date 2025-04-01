package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//UDP - Client
public class udp_client_mainthread {

	public static void main(String[] args) {
		new data_client_udp();
	}
}

class data_client_udp{
	String ip = "172.30.1.65";
	int port = 10000;  //서버 PORT절대 수정 금지 (서버가 변경될 경우만 변경)
	int myport = 0;  //자신이 사용하는 port
	DatagramSocket ds = null;  //UDP 접속하는 역할
	DatagramPacket dp = null;  //UDP 데이터 송수신 필요한 크기
	InetAddress ia = null; //자신의 IP 정보 및 PORT를 확인
	InputStreamReader isr = null;
	BufferedReader br = null;
	
	public data_client_udp() {
		try {
			//다중 접속 할 수 있도록 자신의 UDP Port가 자동으로 생성
			this.myport = (int)Math.ceil(Math.random()*1000) + 9000;
			this.ia = InetAddress.getByName(this.ip);
			this.ds = new DatagramSocket(myport);  //서버에 자신의 PORT 정보를 전송
			this.udp_cn();
			
		}catch (Exception e) {
			System.out.println("서버 접속 오류 발생!!");
		}
	}
	
	private void udp_cn() {
		try {
			Thread th_send = new send_msg(this.ds, this.ia, this.port);  //****메세지 전송 쓰레드***
			th_send.start();
			
			new receive_msg(this.ds);  //***메세지 수신은 main 쓰레드 활용***
			
		}catch (Exception e) {
			System.out.println("정상적으로 UDP 포트가 활성화 되지 않아 접속이 차단됩니다.");
		}
	}	
	
}

class send_msg extends Thread {  //****메세지 전송 쓰레드***
	DatagramSocket ds = null;  //UDP 접속하는 역할
	DatagramPacket dp = null;  //UDP 데이터 송수신 필요한 크기
	InetAddress ia = null; //자신의 IP 정보 및 PORT를 확인
	InputStreamReader isr = null;
	BufferedReader br = null;
	int port = 0;
	
	public send_msg(DatagramSocket ds, InetAddress ia, int port) {
		this.ds = ds;
		this.ia = ia;
		this.port = port;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("메세지를 입력하세요 : ");
				this.isr = new InputStreamReader(System.in);  //메세지 입력파트
				this.br = new BufferedReader(this.isr); //사용자가 입력한 값을 메모리 저장
				String msg = this.br.readLine();  //메모리에 있는 값을 변수 저장
				byte by[] = msg.getBytes();  //문자를 byte로 변환
	
				this.dp = new DatagramPacket(by, by.length, this.ia, this.port);
				this.ds.send(this.dp);  //전송
				System.out.println("올바르게 서버에 전달 되었습니다.");
			}
		}catch (Exception e) {
			System.out.println("정상적으로 UDP 포트가 활성화 되지 않아 접속이 차단됩니다.");
		}
	}
}

class receive_msg {  //***메세지 수신은 main 쓰레드 활용***
	DatagramSocket ds = null;  //UDP 접속하는 역할
	DatagramPacket dp = null;  //UDP 데이터 송수신 필요한 크기
	
	public receive_msg(DatagramSocket ds) {
		this.ds = ds;
		this.run();
	}
	
	public void run() {
		try {
			while(true) {
				System.out.println("서버 메세지 기다리는 중...");
				byte server[] = new byte[1024];
				this.dp = new DatagramPacket(server, server.length);
				this.ds.receive(dp);
				String server_msg = new String(this.dp.getData()); //byte -> 문자로 변환
				System.out.println("서버 메세지 : " + server_msg);
			}
		}catch (Exception e) {
			System.out.println("정상적으로 UDP 포트가 활성화 되지 않아 접속이 차단됩니다.");
		}
	}
}
