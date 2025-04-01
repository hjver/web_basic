package io;

import java.io.File;

//파일 생성(ASCII)
public class file4 {
	//File 라이브러리 : 해당 경로에서 생성, 삭제, 다른 경로로 이동, 파일명 변경, 속성 변경
	public static void main(String[] args) {
		try {
			//File f = new File("D:\\site\\basic_html\\src\\main\\java\\io\\mail.txt");
			
			//f.createNewFile();  //createNewFile : 파일을 신규 생성하는 메소드
			//System.out.println("정상적으로 파일이 생성 되었습니다.");
			
			//f.delete();
			//System.out.println("해당 파일을 정상적으로 삭제 하였습니다.");
			
			//해당 디렉토리에 파일 리스트를 출력하는 코드 (디렉토리명)
			File f = new File("D:\\site\\basic_html\\src\\main\\java\\io");
			File[] files = f.listFiles();  //1차 원시배열로 변환
			int w = 0;
			while(w < files.length) {
				//getName() : 파일명을 출력할 때 사용하는 메소드
				System.out.println(files[w].getName());
				//System.out.println(files[w]);
				w++;
			}
			//System.out.println(f.listFiles().toString());
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
