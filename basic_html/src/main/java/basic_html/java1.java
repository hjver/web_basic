package basic_html;
/* java 프로그램시 유의할 점
 1. class, method를 잘 관리
 2. cpu 관리 : 쓰레드
 3. 메모리 관리
*/

//public class 사용시 같은 파일에 두개의 public은 없음
//class 명은 절대 중복되면 안됨
public class java1 { // 기본 class

	// main method
	// static : 메모리에 저장시켜서 사용하는 자료형
	public static void main(String[] args) {
		//String~double : 데이터형 (Byte)
		
		String user = "홍길동";  //문자열 변수 선언하여 데이터 할당
		int age = 25;  //숫자(정수)
		Integer point = 5000; //숫자(class)
		//float(4Byte) < double(8Byte)
		float money = 25.5f;  //소수점(실수)
		double sales = 0.8;   //소수점
		
		//float을 사용시 결과값은 double, float를 자료형 선언
		int sum = age + point;  //정수 -> int, Integer
		float sum2 = point * money;
		
		String msg = "님 환영합니다.";
		
		String login = user + msg;
		System.out.println(login);
		System.out.printf("출력 테스트!!%n");
		System.out.printf("%s님 로그인 되셨습니다. 포인트는 : %d%n", user, point);
		
		boolean ck = true; //true, false
		
		//숫자 : byte(127) < short < int < long
		short no = 30000;  //short : 3만까지 숫자
		long no2 = 5000000000L;  //L을 데이터 맨 뒤에 위치를 시켜서 사용
		System.out.println(no);
		char agree = '홍';  //char 한글자를 입력시키는 자료형 ' ' 입력
		
		/* java 자료형은 데이터 범위 존재함 */
	}
}
