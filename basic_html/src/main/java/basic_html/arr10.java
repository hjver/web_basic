package basic_html;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//데이터 할당 갯수 및 배열 정렬방식
public class arr10 {

	public static void main(String[] args) {
		//메모리 할당 클래스 배열에 최대 값은 5518개입니다.
		ArrayList<Integer> al = new ArrayList<Integer>();
		int f;
		for(f=0; f<5518; f++) {
			al.add(f);
		}
		//System.out.println(al);
		
		//new arr10_box().arrbox();
		//new arr10_box().aligns();
		new arr10_box().aligns2();
	}
}
/*
 * 응용문제
 * 사용자를 추가하여 배열에 입력하는 코드를 작성해주세요.
 * "사용자명를 입력하시오 : "
 * 홍길동
 * "사용자명를 입력하시오 : "
 * 이순신
 * 
 * 최대 5번을 질문을 적용하여 다음과 결과가 나오도록 하시오.
 * [홍길동, 이순신, 강감찬, 유관순, 장보고]
 */
class arr10_box{
	Scanner sc = null;
	ArrayList<String> al = null;
	ArrayList<Integer> al2 = null;
	
	public void aligns2() {
		Integer number[] = {5,1,22,6,11,9,7};
		Arrays.sort(number);  //오름차순 (원시배열)
		System.out.println(Arrays.toString(number));
		Arrays.sort(number, Collections.reverseOrder()); //내림차순 (원시배열)
		System.out.println(Arrays.toString(number));
	}
	
	public void aligns() {
		Integer number[] = {5,1,22,6,11,9,7};
		this.al2 = new ArrayList<Integer>(Arrays.asList(number));
		System.out.println(this.al2);
		Collections.sort(this.al2);  //배열에 데이터가 오름차순으로 정렬(클래스 배열)
		System.out.println(this.al2);
		Collections.sort(this.al2, Collections.reverseOrder());
		System.out.println(this.al2);  //내림차순 정렬(클래스 배열)
		
		//문자열로 정력이 작동되며, 한글 : ㄱ ~ ㅎ, 영업 : a ~ z
		String user[] = {"홍길동", "이순신", "강감찬", "유관순", "장보고"};
		this.al = new ArrayList<String>(Arrays.asList(user));
		System.out.println(this.al);
		Collections.sort(this.al); 
		System.out.println(this.al);
	}
	
	public void arrbox() {
		this.sc = new Scanner(System.in);
		this.al = new ArrayList<String>();
		int f;
		for(f=0; f<5; f++) {
			System.out.println("사용자명를 입력하시오 : ");
			this.al.add(this.sc.next());
		}
		System.out.println(this.al);
		this.sc.close();
	}
}
