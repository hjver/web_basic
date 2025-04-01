package net;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

//외부 서버에 있는 이미지를 다운받는 통신 (http 만 가능)
public class net3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("웹에서 가져올 이미지 주소를 입력하세요 : ");
			String url = sc.nextLine(); //사용자가 입력한 도메인 주소
			
			URL u = new URL(url);  //URL : http 경로를 가져오는 역할
			//URLConnection : 해당 서버로 접근
			URLConnection con = u.openConnection();
			int imgsize = con.getContentLength();  //파일 크기
			String imgtype = con.getContentType(); //파일 속성
			long date = con.getDate();  //해당 파일에 접속하는 날짜
			
			System.out.println(imgsize);
			System.out.println(imgtype);
			System.out.println(date);
			
//			if(imgsize > 2097000) {
//				
//			}
			
			InputStream is = u.openStream();  //net전용 stream
			BufferedInputStream bs = new BufferedInputStream(is);
			byte b[] = new byte[bs.available() / 1024];
			
			//다운로드 받을 경로 및 파일명
			String copyurl = "d:\\ftp\\";
			OutputStream os = new FileOutputStream(copyurl + "copy.jpg");
			
			//Binary는 int, ASKII는 String
			int w = 0;
			while((w = bs.read(b)) != -1) {
				os.write(b,0,w);  //0 ~ 파일크기 만큼 지속적으로 쓰기
				//os.flush();
			}

			os.close();
			bs.close();
			is.close();
			
			System.out.println("복사완료!!!");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
