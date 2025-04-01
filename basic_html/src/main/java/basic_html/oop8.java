package basic_html;
//클래스 상속 + 상수 사용법, 중첩 클래스
public class oop8 {
	public static void main(String[] args) {
		oop8_box2 ob = new oop8_box2();
		ob.aaa();
		ob.bbb();
		oop8_box3 ob3 = new oop8_box3();  //부모 클래스를 객체
		ob3.zzz();
		
		oop8_box3.box4 ob4 = ob3.new box4();  //부모 클래스 객체를 로드 후 자식 클래스 선언
		ob4.abc();
	}
}

class oop8_box{
	int no = 15000;  //변수
	final int delivery = 3000;  //상수 : 고정값이 있으며 해당값을 변경하지 못함
	public void bbb() {
		System.out.println("bbb 메소드");
	}	
	public void aaa() { //상속 받을 클래스에 같은 메소드 형태가 있을 경우 작동 불능이 발생
		System.out.println("bbb 메소드2");
	}
}
//extends : 외부 클래스를 상속 시켜서 자신의 클래스에 사용할수 있도록 설정하는 예약어
//상속을 하게되면, 메소드와 필드에 있는 변수값 모두 사용할수 있습니다.
class oop8_box2 extends oop8_box {
	public void aaa() {
		System.out.println(this.no);
		System.out.println("aaa 메소드");
	}
}

class oop8_box3{  //부모 클래스
	int n = 10;
	
	class box4{ //자식 클래스
		public void abc() {
			int sum = 50 * n; //this.n은 안됨
			System.out.println("abs 중첩 클래스에 사용된 메소드 " + sum);
		}
	}
	
	public void zzz() {
		System.out.println("box3 클래스의 메소드");
	}
}