package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

//buffered + 클래스 배열을 활용하여 데이터 출력
//io 사용법 및 nio를 이용하여 사용하느 방식
public class file7 {
	public static void main(String[] args) throws Exception{
		String url = "D:\\site\\basic_html\\src\\main\\java\\io\\gugu.txt";
		//nio : Buffered를 기본으로 할당 하고 있음
		//Paths : 경로 호출하여 데이터를 가져오는 클래스
		//Path : 경로 호출하여 데이터를 가져오는 interface
		//Files : File 자료형에서 좀 더 발전한 클래스
		List<String> data = new ArrayList<String>();
		data = Files.readAllLines(Paths.get(url));
		System.out.println(data);
		
		/*  //io (web에서 핸들링 할 수 있는 코드
		FileReader fr = new FileReader(url);
		BufferedReader br = new BufferedReader(fr);
		List<String> data = new ArrayList<String>();  //txt에 있는 데이터를 빈배열에 삽입
		
		String text = "";  //buffered에서 익어 들인 데이터값을 받는 변수
		for(;;) {
			text = br.readLine();  //txt 파일에 있는 한줄에 있는 내용을 변수 이관
			if(text != null) {
				data.add(text);
			}
			else {
				break;
			}
		}
		br.close();
		fr.close();
		System.out.println(data);
		System.out.println(data.get(1));
		System.out.println(data.size());
		*/
	}
}
