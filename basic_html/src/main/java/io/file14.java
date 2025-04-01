package io;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

//Stream 사용법 (binary)
/*
 * InputStream(입력), OutputStream(출력) - ASCII, binary
 * InputStream => FileInputStream, AudioInputStream, ObjectInputStream...
 * OutputStream => FileOutputStream...
 * FileReader(입력), FileWriter(출력) - ASCII
 * 
 */
public class file14 {

	public static void main(String[] args) {
		try {
			String url = "D:\\site\\basic_html\\src\\main\\java\\io\\agree3.txt";
			File f = new File(url);
			//Stream => byte
			//available() => 파일 전체 용량을 확인하는 메소드
			FileInputStream fs = new FileInputStream(f);
			System.out.println(fs.available());
			byte data[] = new byte[fs.available()];  //전체 용량을 배열화
			fs.read(data);  //byte 전체를 읽어들이는 메소드
			String dataread = new String(data); // byte => String으로 변환
			System.out.println(Arrays.toString(data));
			System.out.println(dataread);  //최종 문자로 출력
			fs.close();
		}catch (Exception e) {
			System.out.println("경로 오류가 발생하였습니다.");
		}
	}

}
