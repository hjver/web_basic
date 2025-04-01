package net;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;


//파일 업로드 Client (FTP 접속 및 파일 전송)
public class file_client {
	public static void main(String[] args) {
		new ftp_client("172.30.1.8", 10000);  //서버 IP 및 접속 PORT
	}
}

class ftp_client{
	String ip = null;  //서버 ip 정보
	int port = 0;     //서버 port 정보
	Socket sk = null;   //서버 연결
	InputStream is = null;  //자신의 PC에 있는 파일을 읽어
	OutputStream os = null;  //서버로 전송하는 역할
	Scanner sc = null;  //자신의 PC 파일 경로
	
	public ftp_client(String serverip, int p) {
		this.ip = serverip;  //필드에 ip 이관
		this.port = p;       //필드에 port 이관
		this.sc = new Scanner(System.in);
		this.files();   //은닉화 파일 전송을 하는 메소드를 호출
	}
	
	private void files() {
		try {
			this.sk = new Socket(this.ip, this.port);
			System.out.println("업로드할 이미지 경로를 입력하세요 : ");
			String url = this.sc.nextLine();  //사용자가 지정하는 경로 및 파일명
			
			File f = new File(url);  //파일명을 로드하기 위해서 (사용자 경로+파일명)
			
			//자신의 PC에 있는 파일을 읽어드림
			this.is = new FileInputStream(url);
			BufferedInputStream bs = new BufferedInputStream(this.is);
			byte img[] = new byte[bs.available()];
			bs.read(img);
			
			//서버로 전송
			/*  //파일을 byte로 전송
			this.os = this.sk.getOutputStream();
			this.os.write(img);
			this.os.flush();
			this.os.close();
			*/
			
			//파일명 포함하여 전송
			this.os = this.sk.getOutputStream();
			//DataOutputStream : byte로 전송도 가능함 
			//단, 추가로 write에 다양한 기능 탑재(파이령, 데이터 타입, 데이터 속성, 데이터 용량 등)
			DataOutputStream ds = new DataOutputStream(this.os);
			ds.writeUTF(f.getName());  //파일명
			ds.write(img);  //파일 자체
			ds.flush();
			ds.close();
			this.os.close();
			
			bs.close();
			this.is.close();
			this.sc.close();
			System.out.println("파일 전송이 완료되었습니다.");
			
		}catch (SocketException se) {  //네트워크 접속에 대한 예외처리
			System.out.println("서버에 접속하지 못햇습니다.");
		}catch (IOException e) {  //IO 및 네트워크 전체를 다루는 예외처리
			System.out.println("파일 경로 및 파일명이 잘못 되었습니다.");			
		}catch (Exception e) {  //최고 부모 역할을 하는 예외 처리
			System.out.println(e);
			System.out.println("코드문제로 인하여 버그가 발생 하였습니다..");
		}
	}
}
