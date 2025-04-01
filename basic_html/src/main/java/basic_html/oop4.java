package basic_html;
//필드에 있는 변수 핸들링 및 지역변수 핸들링
//메모리 종류 : ROM, RAM => 캐시 메모리, 메모리
public class oop4 {
	//static : 메모리에 해당 변수를 저장 (무조건 필드에만 적용함)
	static String user = "홍길동";
	
	//메모리에 저장된 메소드
	public static void main(String[] args) {
		System.out.println(user);  //같은 메모리 상에서 해당 ㅂㄴ수를 호출
		oop4_box pd = new oop4_box();
		//외부 클래스에 있는 필드에 있는 변수의 값을 변경할수 있으며, 가져올수 있음
		pd.product = "김치 냉장고";
		pd.money = 60000;
		pd.aaa();
	}

}

class oop4_box{
	String product = "냉장고";
	static int money = 50000;
	
	//단, 외부 클래스를 이용하여 메소드를 실행 전역변수를 호출할 경우
	//this 또는 변수명으로 static
	public void aaa() {
		System.out.println("상품가격 : " + this.money); //메모리 전역변수 호출
		String product = "에어콘";
		System.out.println(this.product); //일반 전역변수 호출
		System.out.println("실행!!");
		this.bbb();
	}
	public void bbb() {
		//메인 크래스를 객체화하여, 해당 필드에 있는 변수를 호출함
		oop4 po4 = new oop4();
		System.out.println(po4.user);
	}
}
