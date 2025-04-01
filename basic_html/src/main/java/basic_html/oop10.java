package basic_html;
//외부 oop10+oop9 코딩
public class oop10 {
	String userid, usertel;
	int age;
	
	public oop10(String a, String b, int c) {  //즉시 실행 메소드
		//setter : 필드에 있는 변수에 값을 이관
		this.userid = a;
		this.usertel = b;
		this.age = c;
		this.member();
	}
	//getter : 필드에 있는 변수값을 가져오는 형태
	public void member() {  //getter역할로 출력
		System.out.println(this.userid);
		System.out.println(this.usertel);
		System.out.println(this.age);
	}
	
	public String idcheck(String id) {
		String msg = "";
		switch(id) {
			case "hong":
			case "HONG":
			msg = "홍길동";	
			break;
			
			case "park":
			msg = "박가은";
			break;
			
			case "admin":
			msg = "관리자";
			break;
			
			default:
			msg = "혹인되지 않은 사용자";
		}
		return msg;
	}
}
