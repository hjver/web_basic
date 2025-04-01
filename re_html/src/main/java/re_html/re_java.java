package re_html; //그룹

public class re_java { //클래스를 무조건 사용해야 함

	//메인 메소드
	public static void main(String[] args) {
		String data1 = "hong";
		String data2 = "25";
		re_box1 rb = new re_box1(data1, data2);
		//rb.check();
	}

}

//java 메소드는 같은 이름 또는 같은 자료형이라도 매개변수의 종류 따라 다르게 인식함
class re_box1{
	//public(오픈), private(해당 클래스만 접근), protected(같은 패키지에서 사용)
	public String a,b,c;  //필드에 적용된 사항 this를 사용함
	
	//즉시실행 (public, protected 만 사용)
	protected re_box1(String data1, String data2) { //Setter
		this.a = data1;
		this.b = data2;
		this.check();
	}
	
	public re_box1(String data1) {
		this.a = data1;
	}
	
	//일반 void 메소드 (return X) => 자료형 및 return 이 없는 메소드
	private void check() {
		System.out.println(this.a);
		String zzz = this.level();  //return 함수를 호출 후 결과값을 받는 코드
		System.out.println(zzz);  //결과값을 출력하는 코드
	}
	
	public String level() {
		String levels = ""; //return레서 결과값을 사용할 변수
		
		if(this.a == "hong") {
			levels = "실버회원";
		}
		else {
			levels = "비회원";
		}
		return levels;
	}
}