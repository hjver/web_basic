package net;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

//메세지 수신 + 파일 수신 (TCP - Server)
public class multi_server {
	public static void main(String[] args) {
		Thread th1 = new m_server(10000);  //문자
		Thread th2 = new m_server(20000);  //파일
		th1.start();
		th2.start();
		//new m_server();
	}
}

class m_server extends Thread{
	private int port = 0;
	ServerSocket ss = null;
	Socket sk = null;
	
	InputStream is = null;
	OutputStream os = null;
	DataInputStream ds = null;
	
	public m_server(int p) {
		this.port = p;
		try {
			this.ss = new ServerSocket(this.port);
		}catch (Exception e) {
			System.out.println("Server Port Conflict!!");
		}
	}
	
	@Override
	public void run() { //THread로 각각의 포트 통신
		try {
			System.out.println("Server Open!!");
			while(true) {
				this.sk = this.ss.accept();
				this.is = this.sk.getInputStream();
				if(this.port == 10000) {  //문자만 출력
					byte msg[] = new byte[1024 * 2];  //2KB
					int bytes_read = this.is.read(msg);  //실제 읽은 바이트 수 저장
					System.out.println(new String(msg, 0, bytes_read, Charset.forName("utf-8")));  //메세지 출력
				}
				else if(this.port == 20000) {  //파일을 저장
					String url = "D:\\server\\"; //클라이언트가 전송한 파일을 저장하는 공간
					this.ds = new DataInputStream(this.is);
					String filename = this.ds.readUTF();  //파일명
					byte data[] = new byte[2097152 * 10];  //20MB
					this.os = new FileOutputStream(url + filename);
					int filesize = 0;
					while((filesize = this.is.read(data)) != -1) {
						this.os.write(data, 0, filesize);
						this.os.flush();
					}
					System.out.println("File Upload ok!!");
					this.os.close();
					this.ds.close();
					this.is.close();
				}
			}
		}catch (Exception e) {
			System.out.println("Server & Client Error");
		}finally {
			try {
				this.sk.close();
			}catch (Exception e) {
				System.out.println("Server Socket Close Error");
			}
		}
	}
}
