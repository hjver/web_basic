package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//UDP -Server
public class udp_server_multi_thread {

	public static void main(String[] args) {
		new data_server_new();
	}
}

class data_server_new{
	
	int port = 10000;
	DatagramSocket ds = null;  //UDP PORT를 오픈하는 역할
	DatagramPacket dp = null;  //UDP 내부 데이터 통신 사이즈
	InetAddress ia = null;
	InputStreamReader isr = null;
	BufferedReader br = null;
	
	public data_server_new(){
		try {
			this.ds = new DatagramSocket(this.port);
			this.udp();
		}catch (Exception e) {
			System.out.println("UDP 포트 충돌로 인하여 서버가 작동 되지 않습니다.");
		}
	}
	
	//Packet : 네트워크를 통해서 데이터를 전송할 때 사용하는 단위
	//DatagramPacket(byte배열, 배열전체크기)
	//DatagramPacket(byte배열, 배열전체크기, 전송할 IP, 상대방 IP, 상대방 port)
	//receive(받는), send(보내는)
	private void udp() {
		try {
			
			byte server_byte[] = new byte[1024];
			//UDP 패킷 크기 만큼 지속적으로 통신 대기 상태로 오픈됨
			this.dp = new DatagramPacket(server_byte, server_byte.length);
			System.out.println("상담시작!!");
			this.ds.receive(this.dp);  //클라이언트에서 전송한 메세지를 받는
			String msg = new String(this.dp.getData());
			System.out.println(msg);
			
			Thread th_receive = new receive_from_client(this.ds, this.dp);
			th_receive.start();
			
			Thread th_send = new send_to_client(this.ds, this.dp, this.ia, this.port);
			th_send.start();
			
		}catch (Exception e) {
			System.out.println("UDP 서버 오류발생!!");
		}
	}
}

class send_to_client extends Thread {
	DatagramSocket ds = null;  //UDP 접속하는 역할
	DatagramPacket dp = null;  //UDP 데이터 송수신 필요한 크기
	InetAddress ia = null; //자신의 IP 정보 및 PORT를 확인
	InputStreamReader isr = null;
	BufferedReader br = null;
	int port = 0;
	
	public send_to_client(DatagramSocket ds, DatagramPacket dp, InetAddress ia, int port) {
		this.ds = ds;
		this.dp = dp;
		this.ia = ia;
		this.port = port;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				byte server_byte[] = new byte[1024];
				
				//Client에게 전송 메세지
				System.out.println("메세지를 입력하세요 : ");
				this.ia = this.dp.getAddress(); //Client IP
				//System.out.println(this.dp.getAddress());  
				int client_port = this.dp.getPort(); //Client PORT
				//System.out.println(this.dp.getPort());
				
				this.isr = new InputStreamReader(System.in);//작성된 내용을 입력 받는 객체
				this.br = new BufferedReader(this.isr); //입력된 내용을 메모리에 등록
				byte client_msg[] = this.br.readLine().getBytes(); //문자를 byte로 변환
				
				//Client로 전송
				this.dp = new DatagramPacket(client_msg, client_msg.length, this.ia, client_port);
				this.ds.send(this.dp); //만들어진 패킷을 send로 전송
			}
		}catch (Exception e) {
			System.out.println("정상적으로 UDP 포트가 활성화 되지 않아 접속이 차단됩니다.");
		}
	}
}

class receive_from_client extends Thread {
	DatagramSocket ds = null;  //UDP 접속하는 역할
	DatagramPacket dp = null;  //UDP 데이터 송수신 필요한 크기
	
	public receive_from_client(DatagramSocket ds, DatagramPacket dp) {
		this.ds = ds;
		this.dp = dp;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				byte server_byte[] = new byte[1024];
				//UDP 패킷 크기 만큼 지속적으로 통신 대기 상태로 오픈됨
				this.dp = new DatagramPacket(server_byte, server_byte.length);
				System.out.println("상담시작!!");
				this.ds.receive(this.dp);  //클라이언트에서 전송한 메세지를 받는
				String msg = new String(this.dp.getData());
				System.out.println(msg);
				
			}
		}catch (Exception e) {
			System.out.println("정상적으로 UDP 포트가 활성화 되지 않아 접속이 차단됩니다.");
		}
	}
}

