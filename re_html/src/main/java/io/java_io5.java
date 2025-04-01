package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

/*
 * 응용문제2
 * ftp 디렉토리에 data.txt가 있습니다. 해당 파일 안에는
 * 냉장고,에어콘,김치냉장고,가습기,공기청정기 내요잉 들억 있는 상항입니다.
 * 해당 내용을 배열로 구분하여 console로 출력하시오.
 * [결과]
 * 냉장고
 * 에어콘
 * ...
 */
public class java_io5 {

	public static void main(String[] args) {
		java_io5_sample sam = new java_io5_sample();
		sam.mycode();
	}
}

class java_io5_sample{
	
	public void mycode() {
		String url = "D:\\ftp\\data.txt";
		File f = new File(url);
		try {
			Reader r = new FileReader(f);
			BufferedReader br = new BufferedReader(r);
			String data[] = br.readLine().split(",");
			for(int k=0; k<data.length; k++) {
				System.out.println(data[k]);
			}
			br.close();
			r.close();
		}catch(Exception e) {
			
		}finally {
			
		}
	}
}
