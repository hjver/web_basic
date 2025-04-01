package basic_html;
//클래스와 메소드 형태 (인자값, 매개변수 포함)

//메인 클래스
public class oop3 {

	public static void main(String[] args) {
		//클래스, 객체, 인스턴스(new로 메모리에 올리는 것)
		oop3_box ob = new oop3_box();  //new 클래스() 생성
		ob.kkk("hong");  //해당 객체를 호출 후 메소드를 실행
		ob.aaa(50);  //숫자 인수값을 적용
		
		new oop3_box2().aaa(); //인스턴스 적용 후 메소드 호출
	}
}

class oop3_box2{
	public void aaa() {
		System.out.println("추가 크래스 호출!!!");
	}
	public void ccc() {
		System.out.println("회원가입 메소드 처리");
	}
}

//외부 class
class oop3_box{
	
	public void kkk(String b) {  //일반 메소드 (문자열로 매개변수 받음)
		System.out.println(b);
		System.out.println("외부 클래스 호출 및 메소드 실행");
		oop3_box2 ob2 = new oop3_box2();
		ob2.ccc();
	}
	
	public void aaa(int a) {  //매개변수로 값을 받을 경우 무조건 자료향
		System.out.println(a);
		System.out.println("aaa 메소드");
	}
}
