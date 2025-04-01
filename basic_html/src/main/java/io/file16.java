package io;

import java.io.File;
import java.io.FileOutputStream;

/*
 * Stream 응용문제
 * 구구단 9단을 dan.txt로 저장되도록 합니다.
 * 9*1=9
 * 9*2=19
 * ..
 * 9*9=81
 */
public class file16 {

	public static void main(String[] args) {
		String url = "D:\\site\\basic_html\\src\\main\\java\\io\\dan.txt";
		String data = "";
		for(int k=1; k<=9; k++) {
			data += 9 + " * " + k + " = " + 9*k + "\n";
		}
		try {
			File f = new File(url);
			f.createNewFile();  //신규파일 생성
			FileOutputStream fs = new FileOutputStream(f);
			byte[] gudan = data.getBytes();  //getBytes() 문자를 byte 배열로 변환
			fs.write(gudan);
			fs.flush();
			fs.close();
		}catch (Exception e) {
			System.out.println("해당 경로 오류 발생!");
		}	
	}
}

