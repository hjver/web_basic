package method;

import java.util.ArrayList;

//메인 Controller + abstract
/*
 * 오버로드, 오버로딩(Overload, Overloading) : 상속 메소드 외에 개발자 별도로 메소드를 구성
 * 오버리드, 오버라이딩(Override, Overriding) : 상속 메소드
 * extends : 외부 클래스를 상속받아서 처리
 */
public class ab1 extends ab_box1 {
	public static void main(String[] args) {
		new ab1().zbox();
	}
	public void zbox() {
		abox1();
	}
}

class ab_box1 {  //일반 클래스
	public void abox1() {
		System.out.println("일번 메소드를 호출!!");
	}
}

//abstract : 추상클래스
abstract class ab2_box1{  //추상 클래스를 선언함
	public String userid = "";  //필드에 변수를 선언시 public, protected를 이용합니다.
	//private 으로 변수를 선언시 abstract 안에서만 작동이 되는 변수 제어입니다.
	public void aaa() {};
	public String bbb() { return null; }
	public Integer ccc() { return 0; }
}

//일반 class에 추상클래스를 상속 받아서 @Override를 이용하여 필요한 메소드를 구성하여 코드를 작성
class ab2_class extends ab2_box1{
	@Override  //추상클래스에서 상속된 메소드를 호출
	public void aaa() {
		//추상 클래스에서 필드에 선언된 변수를 가져와서 사용
		this.userid = "hong";	
	}
	@Override
	public String bbb() {
		return null;
	}
	@Override
	public Integer ccc() {
		return null;
	}
	
	//Overloading : 추상클래스에 선언한 메소드 외에 별도로 개발작 메소드를 생성한 사항
	public ArrayList<String> ddd(){
		return null;
	}
}

//extends는 상ㅅㄱ 클래스를 한개의 상속 받을 수 있음
class ab3_class extends ab2_box1{
	@Override
	public void aaa() {
		System.out.println(this.userid); 
	}
}



