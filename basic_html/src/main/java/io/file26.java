package io;

import java.io.PrintWriter;

public class file26 {

	public static void main(String[] args) {
		String url = "D:\\site\\basic_html\\src\\main\\java\\io\\paper.txt";
		//PrintWriter (IO : Servlet, Spring, Spring-boot) - Javascript 핸들링
		try {
			PrintWriter pw = new PrintWriter(url);
			pw.write("데이터 연습 합니다!!!");
			pw.close();
		}
		catch(Exception e) {
			
		}
	}
}
