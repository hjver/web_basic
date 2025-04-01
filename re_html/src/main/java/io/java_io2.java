package io;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * 응용문제1
 * 해당 배열의 파일명이 해당 디렉토리에 모두 생성되도록 코드를 작성하시오.
 * 0.png, 1.png, 2.png, 3.png, 4.png
 * 
 * d:\ftp 디렉토리에 파일 생성됨
 */

// File : 디렉토리 경로 또는 디렉토리 경로 + 파일명
public class java_io2 {

	public static void main(String[] args) {
		sample s = new sample();
		//s.mycode();
		s.sample_code();
	}
}

class sample{
	
	//강사코드
	public void sample_code() {
		String data[] = {"0.png", "1.png", "2.png", "3.png", "4.png"};
		String dir = "D:\\ftp\\";
		/*
		File f = new File(dir);  //디렉토리만 로드
		
		try {
			for(int w=0; w<data.length; w++) {
				String mkfile = f + "\\" + data[w]; //경로 + 파일명
				File f2 = new File(mkfile);
				f2.createNewFile();
			}
		*/
		
		//File 객체를 하나만 사용하여 파일 생성 그리고 해당 디렉토리에서 파일 전체 리스트를 출력
		try {
			for(int w=0; w<data.length; w++) {
				File f = new File(dir + data[w]);
				f.createNewFile();
			}
		File check = new File(dir);
		System.out.println(Arrays.asList(check.list()));
		}catch(Exception e) {
			
		}
	}
	
	public void mycode() {
		
		final String dir = "d:\\ftp"; //디렉토리
		final int number = 5;   //파일 개수
		File f = null;
		
		try {
			int w = 0;
			while(w < number){
				f = new File(dir + "\\" + w + ".png");
				f.createNewFile();
				w++;
		}
		}catch(Exception e) {
			System.out.println("파일 생성을 하지 못했습니다.");
		}finally {
			
		}
	}
}
