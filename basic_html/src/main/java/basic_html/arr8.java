package basic_html;

import java.util.ArrayList;

//클래스 배열을 사용하는 방법
public class arr8 {

	public static void main(String[] args) {
		//ArrayList 클래스 배열(빈 문자열)
		/*
		 * add : 배열에 데이터를 추가
		 * remove : 배열에 데이터 삭제 (단, 데이터 삭제시 배열번호를 사용
		 * size : 배열의 데이터 갯수
		 * clear : 배열을 초기화
		 * get : 배열에 있는 데이터값을 출력
		 * 
		 * 클래스 배열 자료형 : String, Integer 형태 클래스 자료형
		 */
		ArrayList<String> al = new ArrayList<String>(); 
		al.add("홍길동");
		al.add("김유신");
		al.add("유관순");
		System.out.println(al);
		System.out.println(al.get(1));
		System.out.println(al.size());
		System.out.println(al.remove(0));
		System.out.println(al);
		//al.clear();
		System.out.println(al);
		
		ArrayList<String> al4 = (ArrayList)al.clone();
		System.out.println(al4.get(0));
		
		//숫자형태의 빈 클래스를 선언
		ArrayList<Integer> al2 = new ArrayList();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		System.out.println(al2.size());
		System.out.println(al2);
		System.out.println(al2.get(0));
		
		//clone은 클래스 배열의 값을 복사하는 형태에 적용하는 메소드
		//단, clone복사시 자료형이 변환 되었을 경우 값을 가져오는 부분에서 문제가 발생할 수 있음
		ArrayList<Integer> al3 = (ArrayList)al2.clone();
		al3.add(100);
		System.out.println(al3);
		System.out.println(al2.size());
		System.out.println(al3.get(0));
		
		//자료형을 확인하는 방법
		System.out.println(al3.get(0).getClass());
		System.out.println(al3.get(0).getClass().getName());
	}

}
