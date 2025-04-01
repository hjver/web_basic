package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

//buffer 활용하는 방식
public class file6 {
	public static void main(String[] args) {
		try {
			String url = "D:\\site\\basic_html\\src\\main\\java\\io\\gugu.txt";
			FileReader fr = new FileReader(url);
			//Buffered : 메모리를 활용하여 데이터를 출력 또는 입력을 하는 것을 말합니다.(temp)
			//readLine() : 해당 데이터 라인을 전체 읽어드림
			/*
			 * Buffered 유의사항 : 조건문 또는 반복문에 적용시 해당 데이터가 유실될 수 있음
			 * Buffered는 많은 양의 데이터를 처리할 때 유리한 상항입니다.
			 */
			BufferedReader br = new BufferedReader(fr);
			String msg = null;
			/*
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
			*/
			while(true) {
				msg = br.readLine();
				if(msg != null) {
					System.out.println(msg);
				}
				else {
					break;
				}
			}
			
			/*  //해당 코드는 변수에 값을 이관 및 조건문에 사용하였으므로 데이터 누수가 발생함
			String msg = br.readLine();
			
			if(br.readLine() != null) {
				System.out.println(br.readLine());
				System.out.println(br.readLine());				
			}
			*/
			
			br.close();
			fr.close();
		}catch(FileNotFoundException fe) {  //경로 전용 예외처리 파트
			System.out.println("파일 경로 문제 발생!!");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}


