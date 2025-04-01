package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

//여러개의 파일을 복사하는 방식 (Stream)
public class file18 {
	public static void main(String[] args) {
		img_copy ic = new img_copy();
	}
}

class img_copy{
	//원본이미지 경로
	String ori = "D:\\site\\basic_html\\src\\main\\java\\io\\";
	//사본이미지가 저장될 경로
	String dc = "D:\\copy\\";
	FileInputStream fs = null;
	FileOutputStream os = null;
	
	//복사할 파일명 리스트
	String filenm[] = {"pd1.jpg", "pd2.jpeg", "pd3.jpg", "pd4.jpg"};
	byte by[] = null;  //파일을 읽어서 처리하는 변수
	
	public img_copy() {  //즉시실행
		/*//해당 코드는 경로만 있는 상황이므로 Stream자체가 작동하지 않습니다.
		try {
			this.fs = new FileInputStream(ori);
			this.os = new FileOutputStream(dc);
		}catch(Exception e) {
			System.out.println("해당 경로를 확인하지 못하였습니다.");
		}
		*/
		this.imgcopy();	
	}
	
	public void imgcopy() {  //이미지를 복사하는 메소드 (다른 경로)
		try {
			int w = 0;
			while(w < this.filenm.length) {
				//경로+파일명
				this.fs = new FileInputStream(ori+this.filenm[w]);
				this.by = new byte[this.fs.available()];
				this.fs.read(this.by);  //byte 용량을 모두 읽어들임
				this.os = new FileOutputStream(dc+this.filenm[w]);
				this.os.write(this.by);  //해당 byte 용량에 맞춰서 저장
				this.os.flush();  //캐시 메모리 비우기
				w++;
			}
			System.out.println("해당 파일 전체를 모두 복사 완료 하였습니다.");
		}catch(Exception e) {
			System.out.println("해당 파일 중 경로 및 파일명이 올바르지 않습니다.");
		}finally {
			try {
				this.os.close();
				this.fs.close();
			}catch (Exception e) {
				System.out.println("파일이 올바르게 닫히지 않았습니다.");
			}
		}	
	}
}