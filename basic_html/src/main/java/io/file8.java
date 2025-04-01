package io;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

//byte 자료형 + nio 활용하기
public class file8 {
	public static void main(String[] args) throws Exception{
		String word = "abcd";
		//String word = "홍길동";
		//byte의 기본 배열코드 형태는 ASCII 형태 입니다.
		byte data[] = word.getBytes();  //byte는 숫자, 원시배열을 무조건 사용
		//System.out.println(Arrays.toString(data));
		String unbox = new String(data);  //byte의 원시배열 숫자값을 문자로 표현
		//System.out.println(unbox);
		
		//readAllBytes : byte 자룔형, readAllLines : String 자료형
		String url = "D:\\site\\basic_html\\src\\main\\java\\io\\gugu.txt";
		byte alldata[] = Files.readAllBytes(Paths.get(url));
		System.out.println(Arrays.toString(alldata));
		String unbox2 = new String(data);
		System.out.println(unbox2);
		
		//byte : ASCII, Binary 모두 사용할 수 있는 자료형
	}
}
