package re_html;

import java.util.Scanner;

//반복문으로 결과를 받는 코드

public class re_java3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(1~10까지) : ");
		int no = sc.nextInt();
		if(no < 1 || no > 10) {
			System.out.println("숫자는 1~10까지만 입력하세요.");
			main(args); //재귀함수로 해당 메소드를 재호출
		}
		else {
			re_java3_box rj = new re_java3_box();
			int result = rj.plus(no);
			System.out.println("최종 결과 합계 : " + result);
		}
		sc.close();
	}

}

class re_java3_box{
	int f;
	
	public int plus(int no) { //return을 사용하는 경우 매개변수로 값을 받은 후 결과를 회신
		//사용자가 입력한 값응 1~ 모두 더하는 반복문
		this.f = 1;
		int sum = 0;
		while(this.f <= no) {
			sum += this.f;
			this.f++;
		}
		return sum;  //최종 결과값을 출력
	}
}