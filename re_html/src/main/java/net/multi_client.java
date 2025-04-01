package net;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.File;
import java.net.Socket;
import java.util.Scanner;

//메세지 전송 + 파일 전송 (TCP - Client)
public class multi_client {
	public static void main(String[] args) {
		new chatting();
	}
}

class chatting{
	Scanner sc = new Scanner(System.in);
	String server_ip = "172.30.1.95"; //서버 접속 IP
	int server_port = 0;  //서버 포트 (10000 : 문자, 20000 : 파일
	Socket sk = null;
	String msg = null;  //문자 전솔 변수
	String url = null;  //파일 URL 경로 (자신의 PC 파일 경로)
	
	public chatting() {
		System.out.println("메뉴를 선택하세요 [1.채팅, 2.파일전송] : ");
		try {
			int part = this.sc.nextInt();
			if(part == 1) {
				this.server_port = 10000;
				this.s_chat();
			}else {
				this.server_port = 20000;
				this.s_file();
			}
		}catch(Exception e) {
			System.out.println("메뉴는 숫자로 선택하시며, 2번까지 입력 가능합니다.");
		}
	}
	
	private void s_chat() throws Exception{  //문자 채팅
		OutputStream os = null;  //서버로 전송
		/*
		 * 상단 메소드에서 이미 Scanner에 값을 입력 하였으므로
		 * 새롭게 값을 다시 받기 위해서 메모릴르 초기화
		 */
		this.sc = new Scanner(System.in);
		try {
			do{
				this.sk = new Socket(this.server_ip, this.server_port);
				System.out.println("메세지를 입력하세요 : ");
				this.msg = this.sc.nextLine();
				os = this.sk.getOutputStream();
				os.write(this.msg.getBytes());
				os.flush();
				os.close();
			}while(true);
			
		}catch (Exception e) {
			System.out.println("서버에 접근이 불가능 합니다.");
		}finally {
			os.close();
			this.sk.close();
			this.sc.close();
		}
	}
	
	private void s_file() throws Exception {  //파일 전송
		//자신의 PC에 있는 파일을 읽어드림
		InputStream is = null;
		BufferedInputStream bs = null;
		//파일을 서버로 전송
		OutputStream os = null;
		DataOutputStream dos = null; //파일명 + 파일
		this.sc = new Scanner(System.in);
		try {
			do{
				this.sk = new Socket(this.server_ip, this.server_port);
				System.out.println("파일 전송할 경로 및 파일명을 적어주세요 : ");
				this.url = this.sc.nextLine();  //경로 및 파일명
				
				File f = new File(this.url);  //파일명을 가져오기 위함
				
				//자산의 PC에 있는 파일을 임시 메모리 등록
				is = new FileInputStream(this.url);
				bs = new BufferedInputStream(is);
				byte userfile[] = new byte[bs.available()];
				bs.read(userfile);
				
				//서버로 전송
				os = this.sk.getOutputStream();
				dos = new DataOutputStream(os);
				dos.writeUTF(f.getName()); //파일명
				dos.write(userfile);   //파일
				dos.flush();
				dos.close();
				os.close();
				bs.close();
				is.close();
				
			}while(true);
		}catch (Exception e) {
			System.out.println("파일서버에 접근이 불가능 합니다.");
		}finally {
			this.sc.close();
		}		
		
	}
}
