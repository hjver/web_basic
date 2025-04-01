package basic_html;

import java.util.Scanner;

/*
 * scanner 사용시 주의사항
 * 1. close를 사용시 System.in이 dead가 되면서 더 이상 사용하지 못함
 * 2. nextLine 사용후 next or nextInt 사용후  nextLine 사용시 오류발생
 */

//scanner를 이용하여 if문 사용하기
public class oop14 {
	public static void main(String[] args) {
		oop14_box ob = new oop14_box();
		ob.login();
		ob.member();
		ob.sc.close();
	}
}

class oop14_box{
	String id;
	//모든 메소드에 해당 클래스에 대한 객체 활용할수 있음
	Scanner sc = new Scanner(System.in);
	
	public void member() {
		System.out.println("인증번호를 입력하세요 : ");
		String code = this.sc.next();
		System.out.println(code);
		
	}
	
	public void login() {
		System.out.println("아이디를 입력하세요 : ");
		/*
		 * equals : 사용자가 직법 값을 입력하는 사항 또는 Front에서 값을 이관 받을때
		 * ==(연산기호) : 변수에 직접 개발자 값을 넣을 경우
		 * intern() : 연산기호로 핸들링 한다는 메소드 입니다.
		 */
		this.id = this.sc.nextLine().intern();
		if(this.id.equals("hong")) {
		//if(this.id == "hong") {
			System.out.println("가입된 사용자");
		}
		else {
			System.out.println("미가용자");
		}
		//숫자는 연산기호 모두 핸들링을 합니다.
		System.out.println("사용자의 나이를 입력하세요 : ");
		int age = this.sc.nextInt();
		if(age < 14) {
			System.out.println("14세 미만은 가입이 되지 않습니다.");
		}
		else {
			System.out.println("14세 이상 입니다.");
		}
	}
}
