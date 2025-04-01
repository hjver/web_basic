package net;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//PORT 오픈
public class net2 {

	public static void main(String[] args) {
		try{
			//ServerSocket : 서버를 오픈하는 라이브러리 (포트번호를 셋팅)
			ServerSocket ss = new ServerSocket();
			//InetSocketAddress : 해당 아이피에 포트 번호를 오픈하는 형태
			InetSocketAddress ia = new InetSocketAddress("172.30.1.95", 7070);
			ss.bind(ia);  //bind : 해당 ServerSocket 반영 시킴
			System.out.println("연결중 입니다....");
			
			//소켓으로 접속하는 메소드 (accept)
			//close() : 해당 소켓을 종료
			Socket sc = ss.accept();
			
			//클라이언트가 해당 아이피 및 포트로 접근시 클라이언트에게 해당 메시지를 출력
			//getRemoteSocketAddress : 서버에 접속한 사용자의 IP를 확인
			InetSocketAddress ia2 = (InetSocketAddress)sc.getRemoteSocketAddress();
			System.out.println("연결확인");
			
			ss.close();
			
		} catch (Exception e) {
			//System.out.println(e);
			System.out.println("해당 서버에 문제가 발생 하였습니다.");
		}
	}

}
