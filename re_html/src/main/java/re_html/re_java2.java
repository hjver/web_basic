package re_html;

import java.util.Scanner;

//문자에 관하여 조건문에 형태를 확인하는 코드 (==, equals)
//Scanner : 사용자가 입력하는 가상의 입력창
public class re_java2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("패스워드를 입력하세요 : ");
		//nextLine(), next() : 문자
		//nextInt() : 숫자, nextFloat() : 소수점
		//nextLine을 사용시 자료형이 변경 되었을 경우 nextLine을 재사용하지 못함
		//next() : text, password (띄워쓰기를 인식하지 못함)
		//nextLine() : textarea
		String passwd = sc.next();
		System.out.println("동일한 패스워드를 입력하세요 : ");
		String passwd2 = sc.next();
		
		re_java2_box rb = new re_java2_box();
		String result = rb.check(passwd, passwd2);
		
		if(result == "no") {
			System.out.println("동일한 패스워드가 아닙니다.");
		}
		else {
			System.out.println("패스워드가 동일합니다.");
		}
		
		sc.close();
	}

}

class re_java2_box{
	
	public String check(String passwd, String passwd2) { //return 메소드 (자료형에 맞게 값을 이관)
		// ==, != : 문자일 경우 사용자가 입력하는 사항 인식하지 못함
		// 숫자 : ==, != 무조건 사용가능함
		String ck = null;
		if(passwd.equals(passwd2)) {
			ck = "yes";
		}
		else {
			ck = "no";
		}
		
		return ck;
	}
}