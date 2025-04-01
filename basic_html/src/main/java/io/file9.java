package io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

//nio 전용 파일 삭제, 생성 등...
public class file9 {
	public static void main(String[] args) throws Exception {
		String url = "D:\\site\\basic_html\\src\\main\\java\\io\\app.txt";
		String msg = "데이터 추가 내용!!!";
		Path p = Paths.get(url);
		/*
		 * StandardOpenOption : 파일 형태의 삭제, 추가, 생성
		 * StandardOpenOption.APPEND : ㅣ기존 데이터 보존하며, 새로운 값을 추가
		 * StandardOpenOption.WRITE : 기존 데이터를 새로운 값을 덮어쓰기
		 * StandardOpenOption.CREATE : 해당 경로에 같은 파일명이 없을 경우 파일을 생성
		 * StandardOpenOption.CREATE_NEW : 새로운 파일을 생성하여 데이터를 추가
		 * StandardOpenOption.DELETE_ON_CLOSE : 파일 삭제
		 * 
		 * Files.copy에서 사용하는 옵션
		 * StandardCopyOption.REPLACE_EXISTING : 파일 복제
		 */
		//nio write(경로, 문자열(byte), 옵션설정)
		Files.write(p, msg.getBytes(), StandardOpenOption.APPEND);
		//Files.write(p, msg.getBytes(), StandardOpenOption.WRITE);
	}
}
