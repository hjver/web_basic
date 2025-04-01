package basic_html;
//메인 핸들링 java - oop10과 연계작업
public class oop9 {

	public static void main(String[] args) {
		//즉시 실행 메소드가 있을 경우 아래의 코드 처럼 인자값을 전달할수 있음
		oop10 op = new oop10("hong", "01012345678", 33);
		String id = "admin";
		
		//oop10에 있는 idcheck 메소드의 return 값을 받음
		String result = op.idcheck(id);    
		System.out.println(result);
	}
}
