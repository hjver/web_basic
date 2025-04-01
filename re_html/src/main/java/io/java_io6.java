package io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/*
 * 동기(sync) - 순차적으로 데이터를 처리
 * 비동기(async) - 여러가지 처리 데이터를 각각 처리할 수 있는 기능
 * io : 순차적으로 처리 (동기) - 단방향
 * nio : 다중처리 방식 (비동기) - 양방향
 */
public class java_io6 {

	public static void main(String[] args) {
		String url = "D:\\ftp\\123.txt";
		try {
			//Path : nio interfaae = File
			Path ps = Paths.get(url);  //해당 디렉토리의 파일을 로드
			List<String> data = Files.readAllLines(ps);
			System.out.println(data);
			
			byte[] data2 = Files.readAllBytes(ps);
			String str = new String(data2);
			System.out.println(str);
			
			//Files : new(X) => Files.메소드
			/*
			 * Files.copy(): 복사
			 * Files.createFile(); 파일 생성
			 * Files.createDirectory(); 디렉토리 생성
			 * Files.delete(); 디렉토리, 파일 삭제
			 * Files.list(); 디렉토리안의 파일 체크
			 * Files.write(); 파일쓰기
			 * Files.readAllLines(); 파일안의 데이터를 전체 확인함
			 */
			Path mkps = Paths.get("d:\\ftp\\aaa.txt");
			//Files.createFile(mkps);
			Path dirs = Paths.get("d:\\ftp\\123");
			//Files.createDirectory(dirs);
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("파일 경로 오류!!");
		}
	}
}
