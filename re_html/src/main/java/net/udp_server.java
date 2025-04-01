package net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.Charset;

//UDP - Server
public class udp_server {
	public static void main(String[] args) {
		new udp_open();
	}
}

class udp_open{
	private final int port = 11000;	
	DatagramSocket ds = null;  //해당 UDP 포트 오픈
	DatagramPacket dp = null;  //메세지 송수신
	String message = null;  //클라이언트 메세지 수신 값을 받는 역할
	
	public udp_open() {
		try {
			this.ds = new DatagramSocket(this.port);
		}catch (Exception e) {
			System.out.println("UDP PORT ERROR!!");
		}
		this.server_chat();
	}
	
	private void server_chat() {
		try {
			for(;;) {
				System.out.println("SERVER OPEN!!");
				//1024 byte = 1KB
				byte msg[] = new byte[1024];
				this.dp = new DatagramPacket(msg, msg.length);
				this.ds.receive(this.dp);  //소켓으로 패킷 내용을 받음
				this.message = new String(this.dp.getData(), Charset.forName("utf-8"));
 				//System.out.println(this.dp.getPort());  //Client PORT
 				//System.out.println(this.dp.getAddress()); //Client IP
				System.out.println(this.message); 
			}
		}catch (Exception e) {
			System.out.println("Client Byte Error - Packet");
		}
	}
}