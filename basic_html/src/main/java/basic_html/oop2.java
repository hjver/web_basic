package basic_html;

//전역변수, 지역변수, 자료형 변환

public class oop2 {
	//필드 공간에 전역변수를 선언하려 셋팅, 객체, 외부 class 호출
	String user = "홍길동";  //전역변수
	
	public static void main(String[] args) {

		int point = 8000;  //지역변수
		
		String money = "9000";
		String delivery = "3000";
		//Integer.parseInt : 문자 -> 숫자로 변환하는 클래스.메소드 (int)
		//Integer.valueOf : 문자 -> 숫자로 변환하는 클래스.메소드 (Integer)
		//int sum = Integer.parseInt(money) + Integer.parseInt(delivery);
		Integer sum = Integer.valueOf(money) + Integer.valueOf(delivery);
		System.out.println(sum);
		//int no = null; //오류
		Integer no2 = null;
		
		float m = 10.23f;
		String total = m + "세일 가격 입니다.";
		System.out.println(total);
		//String.valueOf : 숫자,소수점 -> 문자열
		String total2 = String.valueOf(m) + "세일 가격 입니다.";
		System.out.println(total2);
		int no3 = 10;
		String total3 = String.valueOf(m) + no3;
		System.out.println(total3);
	}
}
