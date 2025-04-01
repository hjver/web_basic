package net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Thread 활용한 네트워크 (Server)
public class net7 {
	public static void main(String[] args) {
		new net7().open();				
	}
	public void open() {
		ServerSocket ss = null;
		Socket sk = null;
		
		try {
			ss = new ServerSocket(9999);
			System.out.println("[채팅서버 오픈]");
			
			while(true) {  //반복문으로 해당 포트를 지속적으로 유지시킴
				sk = ss.accept();  //9999
				net7_server ns = new net7_server(sk);  //외부 클래스로 해당 소켓을 전달
				ns.start();  //Thread를 작업 활성화
				//관리자 전용 class
				new net7_admin().start();				
			}
			/*
			 * accept 사용하여 포트를 무한으로 반복시 해당 코드 아래는 도달하지 못하는 곳입니다.
			 */
			
		}catch (Exception e) {
			System.out.println("서버 포트 충돌로 인하여 서버 가동을 중지합니다.");
		}finally {
			if(ss != null) {  //해당 포트가 작동하고 있을 경우
				try{
					ss.close(); //해당 포트 정지
					System.out.println("서버를 강제 종료 합니다.");
				}catch (Exception e) {
					System.out.println("서버 포트가 완전 오류 발생으로 프로그햄 자체 종료합니다.");
					System.exit(0); //해당 java 프로세스를 강제 종료 명령어
				}
			}
		}
	}
}

//관리자 전용 메세지 전송
class net7_admin extends Thread{
	Scanner sc = new Scanner(System.in);
	String admin_msg = "";
	
	@Override
	public void run() {
		try {
			//반복문으로 지속적으로 메세지를 전송할 수 있도록 적용
			while(true) {
				this.admin_msg = this.sc.nextLine();
				//해당 즉시 메소드에 관리자 메소드를 전송
				new net7_server("관리자 메세지 : " + admin_msg);  
			}
		}catch (Exception e) {
			System.out.println("관리자쪽 포트 오류 발생!!");
		}
	}
}

class net7_server extends Thread{
	//서버에 접속한 모든 사용자 리스트
	static List<PrintWriter> list = new ArrayList<PrintWriter>();
	
	//client에서 받는 역할
	InputStream is = null;
	InputStreamReader isr = null;
	BufferedReader br = null;
	
	//client에 보내는 역할
	OutputStream os = null;
	PrintWriter pw = null;  //Stream -> Writer로 변환 (byte->String)
	
	Socket socket = null;
	String mid = "";
	Scanner sc = null;
	
	//배열에 있는 모등 사용자에게 동일한 메세지를 전달
	public void message(String msg) {
		System.out.println(msg);  //사용자별 메세지 내용을 서버에서 확인
		//System.out.println(this.list));  //배열의 내용을 확인
		for(PrintWriter pw : this.list) {
			pw.println(msg);  //각 사용자 별로 발송 메세지
			pw.flush();       //채팅 메세지 메모리를 비움
		}
	}
	
	@Override
	public void run() {  //Thread가 가동되는 메소드
		try {
			//최초 한번만 작동되는 코드
			this.mid = this.br.readLine();
			String hello = "[" + this.mid + "]님 입장 하였습니다.";	
			this.message(hello);  //배열에 등록된 모든 사용자에게 발송
			
			while(this.br != null){  //메세지를 입력하면 지속적으로 반복되는 코드
				hello = this.br.readLine().intern();
				if(hello == "나가기") {  //클라언트에서 나가기 하는 
					break;  //해당 Thread만 정지 => finally 작동
				}
				else {  //채팅 메세지를 지속적으로 배열에 적용된 모든 사용자에게 발송
					this.message(this.mid + ":" + hello);
				}
			}
			
		}catch (Exception e) {
			System.out.println("사용자가 접속 오류로 인하여 접속이 해제 되었습니다.");
		}finally {
			//퇴장한 사항의 아이디와 메세지를 전페 사용자에게 전송
			this.message(this.mid + "님 퇴장하였습니다.");
			this.list.remove(this.pw);  //배열에 해당 사용자를 삭제
			try {
				this.socket.close();  //포트를 종료 (각각의 사용자에 한해 해당 port 종료)
			}catch (Exception e) {
				System.out.println("채팅 서버 종료!!");
			}
			System.out.println(this.mid + "퇴장");
		}
	}
	
	//관리자가 입력한 메세지를 받는 역할을 하는 메소드(즉시 실행)
	public net7_server(String msg) {
		this.message(msg);  //사용자 전체 리슽에 해당 관리자 메세지를 전송
	}
	
	public net7_server(Socket s) {  //즉시 실행 메소드 (main Socket을 전달받음)
		this.socket = s;
		try {
			//접속에 대한 정보를 list 배열추가
			this.os = this.socket.getOutputStream();
			this.pw = new PrintWriter(this.os);
			this.list.add(this.pw);
			System.out.println("채팅 참여자 총 " + this.list.size() + "명 입니다.");
			
			//클라이언트 접속에 따른 메세지 및 정보값을 가져옴
			this.is = this.socket.getInputStream();
			this.isr = new InputStreamReader(this.is);
			this.br = new BufferedReader(this.isr);
			//최초 접속시 상대방 접속 IP
			System.out.println(this.socket.getInetAddress());
			//true, false(기본) => false : 사용하지 않는 port, true : 사용하는 port
			System.out.println(this.socket.getKeepAlive());
			
		}catch (Exception e) {
			System.out.println("채팅 통신 오류 발생!!");
		}
	}
}
