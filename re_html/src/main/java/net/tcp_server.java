package net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

//TCP => Server
//Network => 송수신 [byte] => 내용을 출력 String
public class tcp_server {
	public static void main(String[] args) {
		new tcp_open();
	}
}

class tcp_open{
	int port = 11000;
	ServerSocket ss = null; //해당 포트를 이용하여 TCP를 활성화
	Socket sc = null;  //외부 Client가 접속ㅇ르 할 수있 도록 허가 accept
	
	//메세지 수신
	/*  //방법1
	InputStream is = null;
	byte data[] = null;
	String message = null;
	*/
	//방법2
	
	InputStream is = null;
	InputStreamReader isr = null;
	BufferedReader br = null;
	
	public tcp_open() {
		try {
			this.ss = new ServerSocket(this.port);
			this.tcp_chat(); //통신을 하도록 해당 메소드로 전달
		}catch (Exception e) {
			System.out.println("SERVER PORT ERROR!!");
		}
	}
	
	private void tcp_chat() {
		try {
			System.out.println("SERVER OPEN!!");
			for(;;) {  //반복문으로 통신 접속을 유지시킴
				this.sc = this.ss.accept(); //클라이언트 접속대기
				this.is = this.sc.getInputStream();
				//byte를 String 변환시 언어셋을 변경하면 한글 깨짐 없음
				this.isr = new InputStreamReader(this.is, Charset.forName("utf-8"));
				this.br = new BufferedReader(this.isr);
				System.out.println(this.br.readLine());
			}
		}catch (Exception e) {
			System.out.println("SERVER IP Error!!");
		}
		finally {
			try {
				br.close();
				isr.close();
				is.close();
			}catch (Exception e) {
				System.out.println("Server Socket close Error!!");
			}
		}
	}
}
