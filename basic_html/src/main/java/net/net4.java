package net;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

//네트워크 URL 정보 현황
public class net4 {

	public static void main(String[] args) {
		String url = "https://sonyunara.com/member/join_step1.php";
		
		try {
			URL u = new URL(url);
			//URLConnection con = u.openConnection();  //해당 경로를 오픈
			System.out.println(u.getProtocol());  //http, https
			System.out.println(u.getPort());  //도메인 및 ip 이후 포트번호를
			System.out.println(u.getHost());    //접속하는 ip 또는 도메인명
			System.out.println(u.getFile());  //실행파일명(경로+파라미터값)
			System.out.println(u.getPath());  //현재 접속한 경로
			System.out.println(u.getQuery());  //파라미터값
			
			//ASCII => 소스코드를 모두 다운로드
			InputStream is = u.openStream(); //=byte
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			FileOutputStream fs = new FileOutputStream("d:\\ftp\\member.html");
			
			//byte => String
			PrintWriter pw = new PrintWriter(fs);
			String code = "";
			while((code = br.readLine()) != null) {
				pw.println(code);
				pw.flush();
			}
			pw.close();
			fs.close();
			fs.close();
			br.close();
			isr.close();
			is.close();
			
		}catch (Exception e) {
			System.out.println("해당 사이트는 보안 접속 관계로 소스코드를 복사하지 못했습니다.");
		}finally {
			
		}
	}
}
