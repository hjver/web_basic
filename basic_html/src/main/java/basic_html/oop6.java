package basic_html;
//메소드 형태
public class oop6 {

	public static void main(String[] args) {
		oop6_box ob = new oop6_box();
		ob.aaa();
		ob.aaa("홍길동");
		ob.aaa(25);
		String result = ob.aaa(10, 20);
		System.out.println(result);
		int result2 = ob.aaa("홍길동", "01012345678");
		System.out.println(result2);
	}
}

class oop6_box{
	public oop6_box() { //즉시 실행 메소드 (클래스명 동일한 메소드)
		System.out.println("즉시 실행 메소드");
	}
	//메소드명은 동일하게 사용할수 있습니다. 단, 조건 매개변수에 할당되는 자료형 구분
	public void aaa() { //일반 메소드
		System.out.println("일반 실행 메소드!!");		
	}
	public void aaa(String a) { //문자를 할당 받는 메소드
		System.out.println("일반 메소드 : " + a);		
	}
	public void aaa(int a) {  //숫자를 할당 받는 메소드
		System.out.println("일반 메소드 : " + a);		
	}
	
	/* 
	 자료형 return 메소드 이며, 해당 return에
	 동일한 자료형 데이터를 return 하여야 한다.
	 */
	public String aaa(int a, int b) { //return 메소드
		int sum = a + b;
		String msg = "";
		if(sum % 2 == 0) {
			msg = "짝수값";
		}
		else {
			msg = "홀수값";			
		}
		return msg;
	}
	public int aaa(String a, String b) {
		int z = 1;
		return z;
	}
}
