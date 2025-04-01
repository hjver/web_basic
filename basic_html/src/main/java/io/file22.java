package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//ASCII (Stream + Reader, Writer)
//StreamReader, StreamWriter
//Stream [byte],Reader {String]
public class file22 {

	public static void main(String[] args) {
		try {
			System.out.println("입력값은 : ");
			//InputStreamReader : Stream + Reader를 합쳐서 사용하며 변환 가능한 라이브러리
			InputStreamReader isr = new InputStreamReader(System.in);
			/* //StreamReader 입력된 값을 ASCII 코드로 변환하여 출력
			int data = isr.read();
			System.out.println(data);
			*/
			BufferedReader br = new BufferedReader(isr);
			System.out.println(br.readLine());  //메모리에 저장된 값을 읽어들임
			br.close();
			isr.close();
			
			/*
			OutputStreamWriter osw = new OutputStreamWriter(System.out);
			BufferedWriter bw = new BufferedWriter(osw);
			*/
			
			//객체 한개로 Stream, Writer를 혼합하여 사용하는 코드
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			String msg = "주문하신 물품이 배송중에 있습니다.";
			bw.write(msg);
			bw.close();
			//osw.close();			
			
		}catch(Exception e) {
			System.out.println("코드 에러!!");
		}
	}
}
