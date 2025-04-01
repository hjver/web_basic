package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

//Reader, Writer
public class java_io4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("해당 파일 경로 전체를 입력하세요 : ");
			String msg = "JAVA가 어려워요...";
			String url = sc.nextLine();
			File f = new File(url);  //경로+파일명
			//Writer 부모클래스 이며, 다양한 여러가지 형태의 클래스를 호출할 수 있음
			//true(지속적으로 데이터 누적), 기본(false) -초기화
			Writer w = new FileWriter(f, true); //FileWriter : 저장
			w.write(msg);
			w.close();
			
			//Reader 기본 자료형 : char
			//Buffered 메모리 이며 writer 사용시에는 flush() 이용합니다.
			Reader r = new FileReader(f);  //FileReader : 불러오기
			BufferedReader br = new BufferedReader(r); 
			//read() : 읽은 문자의 ASCII 코드
			//readLine() : 읽은 문자열의 ASCII 코드fmf String 변환
			/*
			System.out.println(br.read());
			System.out.println(br.readLine());
			*/
			
			
		}
		catch(Exception e) {
			
		}finally {
			sc.close();
		}
		
	}
}
