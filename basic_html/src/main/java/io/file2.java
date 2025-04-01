package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

//파일을 읽기 또는 쓰기
public class file2 {

	public static void main(String[] args) {
		try {
			/*
			FileReader fr = new FileReader("D:\\site\\basic_html\\src\\main\\java\\io\\agree.txt");
			Scanner sc = new Scanner(fr);
			//hasNext() : 각각의 라인별로 체크 (true, false)
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}		
			sc.close();
			fr.close();
			*/
			
			//FileWriter : 출력 라이브러리
			FileWriter fw = new FileWriter("D:\\site\\basic_html\\src\\main\\java\\io\\game.dat");
			Scanner sc = new Scanner(System.in);
			System.out.println("입력하실 내용을 적으세요: ");
			String user = sc.nextLine();
			fw.write(user); //write메소드 : 사용자가 입력한 값을 저장시킴
			fw.write("\n 추가 입력사항 발생!!");
			sc.close();
			fw.close();
			
		}catch(Exception e) {
			System.out.println("파일 경로가 올바르지 않습니다.");
		}
	}
}
