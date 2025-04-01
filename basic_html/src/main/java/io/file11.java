package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//io전용 파일 복사 방식 (Stream (X)) - ASCII 전용
//FileReader, FileWriter
public class file11 {
	public static void main(String[] args) {
		//원본파일
		String ori = "D:\\site\\basic_html\\src\\main\\java\\io\\agree2.txt";
		//사본파일
		String copyfile = "D:\\site\\basic_html\\src\\main\\java\\io\\agree3.txt";
		try {
			File f1 = new File(ori);  //원본 경로 파일
			File f2 = new File(copyfile);  //사본 경로 파일
			boolean result = f2.createNewFile();  //사본 파일을 해당 경로 생성
			//원본 파일의 내용을 읽어 들이는 코드
			FileReader fr = new FileReader(f1);
			//읽은 내용을 모두 메모리 등록
			BufferedReader br = new BufferedReader(fr);
			
			//사본 파일에 원본 파일 내용을 입력하기 위한 선언문
			FileWriter fw = new FileWriter(f2, true);
			String data = "";  //임시 메모리에 있는 내용을 해당 변수로 받기 위해 생성함
			
			//임시 메모리의 값을 맙복적으로 체크 하며 값을 사본 파일에 쓰기 적용
			while((data = br.readLine()) != null) { 
				fw.write(data + "\n");
			}
		    
		    fw.close();
		    br.close();
		    fr.close();
			
		}catch (Exception e) {
			System.out.println("파일을 가져올 수 없습니다.");
		}
	}
}
