package basic_html;

import java.util.Scanner;

//Scanner와 여러형태의  메소드 응용편
/*
 * 응용문제
 * 외부 클래스를 이용하여 사용자가 하나의 숫자값을 입력합니다.
 * 입력된 값이 짝수인지 홀수인지를 확인하는 return 메소드 코드를 작성하시오
 * [결과]
 * "숫자 하나를 입력하시오 : "27
 * "입력하신 결과는 홀수 입니다." => return 결과 출력
 * 
 * 응용문제2.
 * 다음 up&down 게임을 제작하게 됩니다.
 * 1~10 까지 숫자 => 전역변수를 외부에서 절대 변경 못하도록 적용합니다.
 * 단, 정답까지 최대 기회는 3번 입니다.
 * 
 * 숫자를 입력하세요 : 3
 * 결과 : up
 * 숫자를 입력하세요 : 9
 * 결과 : down
 * 숫자를 입력하세요 : 7
 * 결과 : 정답
 */
public class oop21 {
	public static void main(String[] args) {
		oop21_box ob = new oop21_box();
	    ob.odd_even();
	    ob.up_down();
	    ob.sc.close();
	}
}

class oop21_box{
	Scanner sc = new Scanner(System.in);
	int no;
	private int ans = 4;
	
	public void odd_even() {
		System.out.println("숫자 하나를 입력하시오 : ");
		this.no = this.sc.nextInt();
		String msg;
		if(this.no % 2 == 0) {
			msg = "입력하신 결과는 짝수 입니다.";
		}
		else {
			msg = "입력하신 결과는 홀수 입니다.";
		}
		System.out.println(msg);
	}
	
	public void up_down() {  //재귀함수로도 가능
		int i;
		String msg="";
		for(i=1; i<=3; i++) {
			System.out.println("숫자를 입력하세요 : ");
			this.no = this.sc.nextInt();
			if(this.no >= 1 && this.no <= 10) {
				if(this.no > this.ans) {
					msg = "결과 : down";
				}
				else if(this.no < this.ans){
					msg = "결과 : up";
				}
				else {
					msg = "결과 : 정답";
				}				
			}
			else {
				msg = "1~10 사이의 값을 입력하세요.";
			}
			System.out.println(msg);
		}
		if(!msg.equals("결과 : 정답")) {
			System.out.println("정답을 맞추지 못했습니다.");
		}
		else {
			System.out.println("정답을 맞추었습니다.");
		}
	}
}
