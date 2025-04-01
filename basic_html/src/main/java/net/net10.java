package net;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

//멀티 포트로 클라이언트로 접속하기
public class net10 {
	public static void main(String[] args) {
		int port = 9000;
		
		Scanner sc = new Scanner(System.in);
		String ch[] = {"1. JAVA방", "2. JS방", "3. 디자인방"};
		System.out.println("채널을 선택해 주세요 : " + Arrays.toString(ch));
		int no = port + sc.nextInt();  //9000 + 사용자가 입력한 숫자
		new client_port(no);
		sc.close();
	}
}

class client_port {
	Socket sk = null;  //소켓을 설정하는 변수
	String serverip = "172.30.1.65";  //서버 접속 IP
	int serverport = 0;  //서버 접속 port
	
	public client_port(int no) {
		this.serverport = no;
		try {
			this.sk = new Socket(this.serverip, this.serverport);
			System.out.println(this.serverport + "채널로 입장 하였습니다.");
			Scanner sc = new Scanner(System.in);
			System.out.println("채팅에서 사용할 닉네임을 입력하세요 : ");
			String mid = sc.nextLine();
			
			//Thread로 값을 이관(서버에 메세지를 통신) - 보내는 내용 Thread로 핸들링
			Thread th = new chat_client(this.sk, mid, this.serverport);
			th.start();
			
		}catch (Exception e) {
			System.out.println("해당 서버에 채널이 존재하지 않습니다.");
		}
	}
}

//송신 역할을 하는 쏙ㄷㅁㅇ
class chat_client extends Thread{
	Socket sk = null;  //서버 소켓 정보
	String mid = null;  //사용자 아이디
	Scanner sc = null;  //채팅 메세지를 입력하는 객체
	int port = 0;  //접속한 port 번호
	
	public chat_client(Socket s, String id, int p) {
		this.sk = s;
		this.mid = id;
		this.port = p;
		this.sc = new Scanner(System.in);
	}
	
	@Override
	public void run() {
		try {
			//접속한 아이디 및 PORT 서버에 전송
			PrintStream ps = new PrintStream(this.sk.getOutputStream());
			ps.println("아이디 : " + this.mid + "접속 포트 : " + this.port);
			ps.flush();
		}catch (Exception e) {
			System.out.println("서버 포트 통신오류로 채팅이 중지됩니다.");
		}
	}
}