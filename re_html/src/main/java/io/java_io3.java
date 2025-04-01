package io;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//파일 삭제
public class java_io3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 파일명을 입력하세요(속성명 포함): ");
		String filename = sc.nextLine();
		String url = "D:\\ftp\\";
		File f = new File(url);  //디렉토리를 오픈
		try {
			//List 인터페이스 배열로 해당 디렉토리 전체 파일 목록을 저장 시킴
			List<String> fm = new ArrayList<String>(Arrays.asList(f.list()));
			for(String n : fm) {
				if(n.equals(filename)) {
					String del_file = url + filename;
					File f2 = new File(del_file);
					//delete() : 디렉토리 삭제, 파일 삭제 모두 가능함
					f2.delete();
				}
			}
			System.out.println("해당 파일은 정상적으로 삭제 되었습니다.");
		}catch(Exception e) {
			System.out.println("해당 경로가 확인되지 않습니다.");
		}finally {
			sc.close();
		}
	}
}
