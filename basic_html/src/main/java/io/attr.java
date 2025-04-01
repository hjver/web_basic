package io;

import java.io.File;

//속성 이름을 별도로 구성하는 코드 방식
public class attr {

	public static void main(String[] args) {
		String url = "D:\\site\\basic_html\\src\\main\\java\\io\\img.jpg";
		File f = new File(url);
		System.out.println(f.getName());  //파일명
		String filename = f.getName();
		//lastIndexOf : 해당 단어를 기준으로 맨 마지막에 해당하는 단어 노드 번호
		//indexOf : 해당 단어를 기준으로 맨 맨 앞에서부터 단어를 검토함 (노드 번호)
		int n = filename.lastIndexOf(".");  
		System.out.println(n);
		//int m = filename.indexOf(".");  
		//System.out.println(m);
		String modify = filename.substring(n);  //substring (단어를 자르느 메소드
		System.out.println(modify);
		
		String word2 = "홍길동 환영합니다.";
		//substring(startIndex, endIndex)
		//String sub = word2.substring(4, 6); //(시작index번호, 끝index번호)
		String sub2 = word2.substring(4); //(시작값) 시작값 이후
		System.out.println(sub2);
	}

}
