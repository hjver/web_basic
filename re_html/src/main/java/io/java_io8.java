package io;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

//Stream (OutputStream - 파일저장 및 복사)
public class java_io8 {

	public static void main(String[] args) {
		String url = "D:\\ftp\\222.txt";  //해당 파일에 저장
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("입력하실 단어를 적어주세요 : ");
			String msg = sc.nextLine(); //사용자가 입력한 값 (String)
			OutputStream os = new FileOutputStream(url);  //byte
			//getBytes : String -> byte로 변환하는 역할
			os.write(msg.getBytes()); //byte로 저장
			os.close();
			
		}catch(Exception e) {
			System.out.println("파일 경로가 잘못 되었습니다.");
		}finally {
			sc.close();
		}
	}
}
