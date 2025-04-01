package net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

//UDP - Client
public class udp_client {
	public static void main(String[] args) {
		new udp_server_connect();
	}
}

class udp_server_connect{
	private final String ip = "127.0.0.1"; //서버 IP
	private int server_port = 11000;  //서버 접속 UDP 포트
	private int client_port = 12000;  //자신이 사용하는 UDP 포트
	DatagramSocket ds = null;  //UDP 서버 접근
	DatagramPacket dp = null;  //데이터 송신, 수신
	String msg = null;  //데이터를 문자로 받아서 처리
	InetAddress ia = null;  //서버 IP를 셋팅하는형태 => DatagramPacket
	Scanner sc = null;
	
	public udp_server_connect() {
		try {
			this.sc = new Scanner(System.in);
			//접근하고자 하는 서버 IP (TCP)
			this.ia = InetAddress.getByName(this.ip);
			
			//서버에 자신의 UDP PORT (UDP)
			this.ds = new DatagramSocket(this.client_port);  
			this.udp_client_chat();
		}catch (Exception e) {
			System.out.println("클라이언트 포트 충돌 발생!!");
		}
	}
	
	private void udp_client_chat() {
		try {
			for(;;) {
				System.out.println("서버에 접속하셨습니다.");
				System.out.println("메세지를 입력하세요.");
				this.msg = this.sc.nextLine();
				
				byte data[] = this.msg.getBytes();
				this.dp = new DatagramPacket(data, data.length, this.ia, this.server_port);
				this.ds.send(this.dp);
				System.out.println("서버에 문자 발송!!");
			}
		}catch (Exception e) {
			System.out.println("서버에 접근이 불가능 합니다.");
		}finally {
			try {
				this.ds.close();
			}catch (Exception e) {
				System.out.println("DataSocket이 올바르지 않습니다.");
			}
		}
	}
}
