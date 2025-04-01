package basic_html;

import java.util.ArrayList;
import java.util.Arrays;

//원시배열 -> 클래스배열로 전환
public class arr9 {

	public static void main(String[] args) {
		//원시배열
		Integer data[] = {10,20,30,40,50};
		//클래스 배열
		ArrayList<Integer> all = new ArrayList<>(Arrays.asList(data));
		//Arra.asList(원시배열 변수)
		//System.out.println(all);
		//System.out.println(all.get(3));
		all.add(70);
		int f;
		for(f=0; f<all.size(); f++) {
			//System.out.println(all.get(f));
		}
		Integer data2[] = {100, 200, 300};
		//addAll을 이용하여 추가 원시 배열 데이터를 적용할수 맀음
		all.addAll(Arrays.asList(data2));
		//System.out.println(all);
		//System.out.println(Arrays.asList(data2));
		//System.out.println(data2);
		new arr9_box().arrbox();
	}
}

class arr9_box{
	/*
	 * 응용문제
	 * 해당 원시배열을 클래스 배열로 변환 후 해당 데이터 중 짜구의 데이터 값만 출력하는
	 * 코드를 작성하시오.
	 */
	final Integer no[] = {15,22,16,33,42,51,50,98,94,47,32};
	
	public void arrbox() {
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(this.no));
		int f;
		for(f=0; f<al.size(); f++) {  //클래스 배열 갯수만큼 반복
			if(al.get(f) % 2 == 0)  //짝수 조건
				System.out.println(al.get(f)); //데이터 출력
		}
		al.set(3,  1000);  //set(배열번호, 수정값) : 해당 클래스 배열에 있는 갓을 수정할 때 사용합니다.
		System.out.println(al);
	}
}
