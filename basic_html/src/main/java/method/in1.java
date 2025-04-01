package method;

public class in1 {
	public static void main(String[] args) {
		in1_box in = new in1_box();
		in.levels();
	}
}

//interface 로드는 implements
//abstract 로드는 extends
/*
 * interface는 default로 선언한 메소드 외에는 모두 Override를 해야 합니다.
 * [interface 규칙
 * 1. 필드에 선언한 변수는 상수로 인싱합니다.
 * 2. default외에는 모두 Override 해야 함
 * 3. interface에 선언한 메소드를 조금이라도 변화 시킬 경우 새롭게 Override를 해야함
 * 4. interface 필드에 클래스 라이브러리를 선언시 null을 사용하지 않습니다.
 * 5. 즉시 실행되는 메소드가 없음
 */
class in1_box implements inter1{
	//같은 이름의 변수가 있을 경우 class와 interface가 별도로 지정되어 선언됨
	String userid = "park";
	String username = "";  //빈값으로 class에서 활용할 수 없음
	
	@Override
	public Integer levels() {
		//interface에 선언된 변수값ㅇ르 출력함
		System.out.println(inter1.userid);
		
		//class에서 필드에 선언된 변수값을 오드후 데이터를 변환
		this.userid = "hana";
		System.out.println(this.userid);
		return null;
	}
	@Override
	public String names() {

		return null;
	}
	@Override
	public void search() {
		
	}
}
