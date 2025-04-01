package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//OutputStream + Buffered
//Binary는 무조건 byte이므로 String으로 변환할 필요가 전혀 없음
public class java_io10 {

	public static void main(String[] args) {
		String url = "D:\\ftp\\cdn_0.jpg";  //원본 이미지
		try {
			//2M 이상일 경우 Buffered 사용
			InputStream is = new FileInputStream(url);
			byte files[] = new byte[is.available()];
			//is.read(files);
			
			BufferedInputStream bis = new BufferedInputStream(is);
			bis.read(files);
			
			String copys = "D:\\ftp\\cp.jpg";
			OutputStream os = new FileOutputStream(copys);
			//os.write(files); //Buffered 없이 copy 형태
			BufferedOutputStream bos = new BufferedOutputStream(os);
			bos.write(files);
			bos.flush();  //메모리를 비워두어야 해당 메모리를 지속적으로 사용 가능함
			bos.close();
			os.close();
			bis.close();
			is.close();
			
		} catch (Exception e) {
			System.out.println("원본 경로 밒 사본 경로 주소가 잘못 되었습니다.");
		} finally {
			
		}
	}
}
