package net;

import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//TCP => Client
public class tcp_client {
	public static void main(String[] args) {
		new client_chat();
	}
}

class client_chat{
	private final String serverip = "127.0.01";  //서버 IP
	final int port = 11000;  //접근 가능한 서버 PORT
	Socket sk = null;  //서버의 해당 PORT 연결
	
	//방법1
	Scanner sc = new Scanner(System.in);
	//방법2
	//InputStreamReader(?)
					
	String message = null;  //클라이언트가 문자를 입력한 값을 변수로 이관
	//방법1
	OutputStream os = null; //서버로 전송하는 Stream
	//방법2 : PrintWriter(?), PrintString
	//밥법3 : OutputStreamWriter, BufferWriter(?) 추가
	
	public client_chat() {
		this.chat();
	}
	
	private void chat() {
		try {
			int connect = 0;
			for(;;) {
				//서버의 해당 소켓으로 연결을 실행함
				this.sk = new Socket(this.serverip, this.port);
				if(connect == 0) {
					System.out.println("서버 접속 완료!!");
					connect++;
				}
				System.out.println("메세지를 입력하세요 : ");
				this.message = this.sc.nextLine();
				//exit라는 메세지를 입력시 무한 반복문 정지로 네트워크를 종료
				if(this.message.equals("exit")) {
					break;
				}
				
				//서버에 소켓통신으로 해당 내용을 byte로 전송
				this.os = this.sk.getOutputStream();
				this.os.write(this.message.getBytes());
				this.os.flush();
				this.os.close();
			}
		}catch (Exception e) {
			System.out.println("서버에 접근이 불가능 합니다.");
		}finally {
			this.sc.close();
		}
	}
}