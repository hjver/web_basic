package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

//Reader, Writer => ASCII
//파일을 읽기, 쓰기(추가) 작동형태 (try~catch) 예외처리
//TXT 파일일 경우 저장시 언어셋을 유의하여 체크 후 파일읽 또는 쓰기를 진행하시길 바랍니다.
public class file3 {
	public static void main(String[] args) {
		file3_box fb = new file3_box();
		fb.file_read();
	}
}

class file3_box{
	String url = "D:\\site\\basic_html\\src\\main\\java\\io\\agree.txt";
	FileReader fr = null;
	FileWriter fw = null;
	Scanner sc = null;
	
	public void file_read() {  //파일 읽기
		try {
			this.fr = new FileReader(this.url);
			this.sc = new Scanner(this.fr);
			do {
				System.out.println(this.sc.nextLine());
			}while(this.sc.hasNext());		
			this.sc.close();
			this.fr.close();
			
			this.file_writer();  //글쓰기 메서드로 이동
		}
		catch (Exception e) {
			System.out.println("해당 경로의 파일이 잘못 되었습니다.");
		}
	}
	
	public void file_writer() {  //파일 쓰기
		try {
			System.out.println("추가 내용을 입력하세요 : ");
			//Scanner : System.in, this.fr 다를 경우 close를 별도로 구성 가능합니다.
			this.sc = new Scanner(System.in);
			String msg = this.sc.nextLine();
			//true: 기존 데이터를 보존하면서 저장시키는 방식
			//false: 기존 데이터 삭제 후 신규 데이터 저장 방식
			this.fw = new FileWriter(this.url, true);
			this.fw.write("\n" + msg);
			System.out.println("파일이 저장되었습니다.");
			this.fw.close();
			this.sc.close();		
		}
		catch (Exception e) {
			System.out.println(e);
			System.out.println("해당 경로의 파일이 잘못 되었습니다.");
		}
	}
}