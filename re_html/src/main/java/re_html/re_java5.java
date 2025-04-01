package re_html;

import java.util.Scanner;

//접근권한 : public(공유), private(해당 클래스), protected(해당 패키지)
//private < default < protected < public
//private 메소드 중 즉시실행 메소드는 제외
public class re_java5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 구구단 숫자 : ");
		int no = sc.nextInt();
		System.out.println("두번째 구구단 숫자 : ");
		int no2 = sc.nextInt();
		re_java5_box rb = new re_java5_box(no, no2); //즉시실행 메소드만 접근이 가능
		sc.close();
	}
}

class re_java5_box{
	/*
	 * 멧드에서 값을 이관하는 방식
	 * 1. 필드에 ㅂ변수를 선언하여 값을 이관하는 방식
	 * 2. 매개변수로 메소드로 전달하여 이관하는 방식
	 */
	int f, ff;
	protected re_java5_box(int no, int no2) { //클래스 호출시 실행되는 메소드
		this.gugudan(no, no2); //해당 메소드가 private이므로 해당 메소드에서 접근
	}
	
	private void gugudan(int no, int no2) {  //re_java5_box 클래스에서만 접근
		//2*1 ~ 2*5
		this.f = no;
		do {
			
			this.ff =1;
			do {
				System.out.println(this.f + "*" + this.ff + "=" + f*ff);
				this.ff++;
			}while(this.ff <= 5);
			
			this.f++;
		}while(this.f <= no2); //상요자가 시작값 및 범위값을 설정
	}
}