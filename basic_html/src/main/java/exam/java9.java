package exam;

import java.util.Scanner;

public class java9 {
	public static void main(String[] args) {
		new java9_box();
	}
}

class java9_box implements java9_in{
	int no;
	
	public java9_box() {
		this.input();
		this.output();
	}
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자하나를 입력하세요 : ");
		this.no = sc.nextInt();
		sc.close();
	}
	@Override
	public void output() {
		if(this.no % 2 == 0) {
			System.out.println("결과 : 짝수 입니다.");
		}
		else {
			System.out.println("결과 : 홀수 입니다.");
		}
	}
}
