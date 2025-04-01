package basic_html;
//if문 사용법
/*
응용문제2.
메인 메소드에서 인자값으로 33 42 82를 외부 클래스로 전달합니다.
해당 숫자를 모두 곱한 후 짝수인지, 홀수인지를 return ruturn값을 출력하시오.

응용문제3.
이메일 : hong@nate.com 과 고객명 : 홍길동을 외부 클래스로 전달할 결루
두 값이 모드 일치할경우 return으로 "해당 고객정보를 확인하였습니다." 라는
결과 값을 출력하며, 두가지 값 중 한가지라도 다를 경우 "일치하는 고객정보가 없습니다."
리고 출력되도록 하시오.
*/
public class oop7 {
	public static void main(String[] args) {
		oop7_box ob = new oop7_box();
		String username = "홍길동";
		ob.login(username);
		
		System.out.println(ob.aaa());
		
		String memail = "hong@nate.com";
		String mname = "홍길동";
		System.out.println(ob.bbb(memail, mname));
	}
}

class oop7_box{

	int a = 33;
	int b = 42;
	int c = 82;
	
	public String aaa() {
		int result = a * b * c;
		String msg;
		if(result % 2 == 0) {
			msg = "짝수값";
		}
		else {
			msg = "홀수값";
		}
		return msg;
	}
	
	public String bbb(String email, String name) {
		String msg;
		if(email.equals("hong@nate.com") && name.equals("홍길동")) {
			msg = "해당 고객정보를 확인하였습니다.";
		}
		else {
			msg = "일치하는 고객정보가 없습니다.";
		}
		return msg;
	}
	
	public void login(String mname) {
		String mid = "hong";
		String mpass = "a1234";
		//equals == 두가지의 뜻이 동일하며, 단 equals 문자에만 사용합니다.
		//숫자를 비교하는 사항 ==만 이용하빈다.
		// &&(AND), ||(OR), 조건문에서 사용하는 연산기호 (==, !=, >=, <=, >, <)
		if(mid.equals("hong") && mname.equals("홍길동")) {
			System.out.println("아이디 확인");
		}
		else {
			System.out.println("아이디 미확인");			
		}
		
		if(!mpass.equals("b1234")) { // !=
			System.out.println("패스워드가 다릅니다.");
		}
		else {
			System.out.println("패스워드가 같습니다.");
		}
		
		int no = 500;
		if(no == 500) {
			System.out.println("동일한 숫자입니다.");
		}
	}
}