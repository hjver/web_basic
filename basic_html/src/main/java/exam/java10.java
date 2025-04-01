package exam;

import java.util.Scanner;

public class java10 {
	public static void main(String[] args) {
		new java10_box();
	}
}

class java10_box extends java10_ab{
	Scanner sc = null;
	
	public java10_box() {
		int no = this.menu1();
		if(no == 1) {
			this.menu2();
		}
		else if(no == 2) {
			this.menu3();
		}
		this.output();
		this.sc.close();
	}
	
	@Override
	public int menu1() {
		this.sc =  new Scanner(System.in);
		System.out.println("[1.휴대폰 인증, 2.이메일 인증] 선택 :");
		int no = this.sc.nextInt();	
		return no;
	}
	@Override
	public void menu2() {
		this.sc =  new Scanner(System.in);
		System.out.println("휴대폰 번호를 입력하세요(숫자만) : ");
		this.sc.nextLine();
	}
	@Override
	public void menu3() {
		this.sc =  new Scanner(System.in);
		System.out.println("이메일을 입력하세요 : ");
		this.sc.nextLine();
	}
	@Override
	public void output() {
		System.out.println("[최종출력 결과]");
		System.out.println("인증번호 5523 발송!!");
	}
}
