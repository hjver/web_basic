package io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

//Stream + Buffered => byte
public class java_io9 {

	public static void main(String[] args) {
		String url = "D:\\ftp\\222.txt";
		try {
			InputStream is = new FileInputStream(url);
			BufferedInputStream bis = new BufferedInputStream(is);
			System.out.println(bis.available());  //file 용량
			byte[] data = new byte[bis.available()];  //byte 배열을 file 용량 크키로 생성
			//int by = bis.read(data); //=>int 경우(Binary) : 이미지, 동영상
			bis.read(data); //=>ASCII일 경우 read만 적용
			
			//new String(byte변수, 언어셋)
			String word = new String(data, "EUC-KR");
			String word1 = new String(data, "UTF-8");
			String word2 = new String(data);
			System.out.println(word);
			System.out.println(word1);
			System.out.println(word2);
			
			bis.close();
			is.close();
			
			new stream_reader().filedata();
		} catch (Exception e) {
			System.out.println("파일경로가 올바르지 않습니다.");
		} finally {
			
		}
	}
}

//InputStream + StreamReader + BufferedReader
class stream_reader{
	String url = "D:\\ftp\\222.txt";
	public void filedata() {
		//byte[] 사용하지 않음
		try {
			//readLine() => String, read() => byte
			InputStream is = new FileInputStream(url);  //byte
			InputStreamReader isr = new InputStreamReader(is);  //String변환
			BufferedReader br = new BufferedReader(isr);  //String
			System.out.println(br.readLine());
			//반복문으로 출력
			
			br.close();
			isr.close();
			is.close();
		} catch (Exception e) {
			System.out.println("파일경로가 올바르지 않습니다.");
		} finally {
			
		}
	}
}
