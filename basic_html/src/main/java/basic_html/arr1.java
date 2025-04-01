package basic_html;

import java.util.Arrays;

//1차 배열 선언 방식 및 출력 방식 {}
//파싱(parsing), 파서(parser)
public class arr1 {
	public static void main(String[] args) {
		//숫자 배열
		int a[] = {1,2,3,4,5};
		int[] b = {10,20,30,40,50};
		System.out.println(a.length);  //배열 갯수
		System.out.println(a[3]);  //배열은 0부터 시작
		//toString : 문자로 변환
		System.out.println(Arrays.toString(a)); //Arrays : 클래스 배열
		//System.out.println(a);
		
		//문자배열
		String c[] = {"홍길동", "이순신", "강감찬"};
		System.out.println(Arrays.toString(c));
		
		//int배열과 Integer 배열 선언방식이 라이브러리ㅣ 형태로 사용은 안됨
		//int data[] = new int[4];  //int 배열값 비어있을 경우 0
		Integer data[] = new Integer[5];  //integer는 배열값이 비어 있을 경우 null
		data[0] = 100;
		data[1] = 200;
		//data[2] = 300;
		data[3] = 400;
		System.out.println(Arrays.toString(data));
		
		String user[] = new String[3];
		user[1] = "홍길동";
		System.out.println(Arrays.toString(user));
		
		//Object : 복합형태 자료형 (숫자, 실수, 문자...)
		Object member[] = {"홍길동", 25, "강감찬", 30};
		System.out.println(Arrays.toString(member));
		
		Object product[] = new Object[4];
		product[1] = 100;
		product[2] = "안녕";
		System.out.println(Arrays.toString(product));	
	}
}