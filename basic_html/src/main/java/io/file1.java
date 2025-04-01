package io;

import java.io.FileReader;

/*
 * io : Input(입력), Output(출력) => try~catch
 * Input : 키보드, 마우스, HDD, SSD, File, 스캐너
 * Output : 모니터, 프린터, QR, 바코드
 */
public class file1 {
	public static void main(String[] args) {
		try {
			/*
			 * FileReader : 문자 데이터(ASCII)를 읽는 라이브러리
			 * FileWriter : 문자 데이터(ASCII)를 저장하는 라이브러리
			 */
			FileReader fr = new FileReader("D:\\site\\basic_html\\src\\main\\java\\io\\agree.txt");
			System.out.println(fr.getEncoding());  //파일의 언어셋
			System.out.println(fr.read());  //문자 ASCII 번호
			System.out.println((char)fr.read());  //문자
			//무한루프 : 파일 전체를 읽어 들여야 함
			while(true) {
				int size = fr.read(); 
				System.out.println((char)size);
				if(size == -1) {  //해당 파일에 더 이상 읽을 내용이 없을 경우
					break;
				}
			}
			fr.close(); //읽은 파일 내용을 종료하는 메소드
		}catch (Exception e) {
			System.out.println("해당 파일을 찾을 수 없습니다.");
		}
	}
}
