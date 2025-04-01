package basic_html;

import java.util.ArrayList;
import java.util.Arrays;

//method를 활용한 2차 클래스 배열 데이터 만들기
public class arr12 {

	public static void main(String[] args) {
		Integer datalist[][] = {
				{10,20,30},
				{100,200,300}
		};
		arr12_box ab = new arr12_box();  //외부 클래스 노드
		ArrayList<ArrayList<Integer>> all = new ArrayList<ArrayList<Integer>>();
		int w = 0;
		while(w < datalist.length) { //3
			//abc라는 메소드에 원시 1차 배열값을 전송 후 1차 클래스 배열로 return 겨로가를 받음
			ArrayList<Integer> data = ab.abc(datalist[w]);
			all.add(data);  //return 받은 결과값을 2차 배열에 추가
			w++;
		}
		System.out.println(all);
	}

}

class arr12_box{
	
	public ArrayList<Integer> abc(Integer list[]){  //1차 클래스 배열 메소드
		//1차 클래스 배열을 생성
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(list));
		return al;  //생성된 1차 클래스 배열값을 회신
	}
	
	//2차 클래스 메소드
	public ArrayList<ArrayList<Integer>> bbb(){
		
		return null;
	}
}