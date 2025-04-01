package net;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

//파일 보관 서버 (FTP 서버)
public class file_server {
	public static void main(String[] args) {
		new ftp_server(10000);
	}
}

class ftp_server{
	int port = 0;   //오픈할 서버  포트
	Socket sk = null;  //Client가 접속할 수 있도록 서버를 유지시키는 역할
	ServerSocket ss = null;  //해당 포트를 이용하여 서버 오픈
	InputStream is =null;  //client에서 받아오는 파일
	FileOutputStream fs = null;  //Server PC 저장하는 파일, 디렉토리 및 파일 없을 경우 생성
	
	public ftp_server(int p) {  
		this.port = p;  //필드에 있는 port 변수에 값을 이관
		this.data();  //은닉화 메소드를 실행
	}
	
	private void data() {  //서버 가동 및 클라이언트에서 보낸 파일 받는 역할
		try {
			//해당 PC에서 포트를 오픈
			this.ss = new ServerSocket(this.port);
			this.sk = this.ss.accept();  //클라이언트 접속 대기
			System.out.println("********서버 가동중********");
			String url = "d:\\ftp\\";  //클라이언트에서 전송된 파일 저장소
			
			//클라이언트가 전송한 파일을 읽어들여서 체크하는 코드
			this.is = this.sk.getInputStream();
			
			//DataInputStream : 파일명 + 파일 자체
			DataInputStream ds = new DataInputStream(this.is);
			String file_name = ds.readUTF();
			
			byte data[] = new byte[2097152];  //2MB
			
			/* //ASCII 형태의 파일 경우 해당 내용을 확인하여 출력할 수 있음 (Binary(X))
			int by = this.is.read(data);
			String content = new String(data, 0, by, StandardCharsets.UTF_8);
			System.out.println(content);
			System.out.println(this.is.available());  //전송파일 용량체크
			*/
			
			this.fs = new FileOutputStream(url + file_name);
			
			int filesize = 0;
			while((filesize = ds.read(data)) != -1) {
				this.fs.write(data, 0, filesize);
				this.fs.flush();
			}
			System.out.println("정상적으로 업로드 완료 하였습니다.");
			
			this.fs.close();
			ds.close();
			this.is.close();
			this.sk.close();
			this.ss.close();
		}catch (Exception e) {
			System.out.println(e);
			System.out.println("서버 PORT 충돌로 인하여 오류 발생!!");
		}
	}
}