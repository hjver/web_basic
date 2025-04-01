package basic_html;

import java.util.InputMismatchException;
import java.util.Scanner;

//예외처리 응용편
/*
 * 응용문제
 * 사용자가 다음과 같이 은행 금액을 입금하는 프로세서입니다.
 * 문제가 발생시 숫자만 입력 받을 수 있도록 처리하는 예ㅗ이처리 코드를 작성하시오
 * 
 * [결과]
 * "입금하실 금액을 입력하세요 : "aaa
 * "숫자만 입력하셔야 합니다."
 * "입금하실 금액을 입력하세요 : "5000
 * "입금하신 금액은 : 5000 입니다."
 */
public class ex3 {
	public static void main(String[] args) {
		ex3_box eb = new ex3_box();
		eb.bank();
	}
}

class ex3_box{
	Scanner sc = null;
	
	public void bank() {
		this.sc = new Scanner(System.in);
		System.out.println("입금하실 금액을 입력하세요 : ");
		int no = 0;
		try {
			no = this.sc.nextInt();
			System.out.println("입금하신 금액은 : " + no +" 입니다.");
		}
		catch(InputMismatchException ime) {
			System.out.println("숫자만 입력하셔야 합니다.");
			bank();  //해당 문제가 발생시 재귀 메소드로 재호출
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			this.sc.close();
		}
	}
}