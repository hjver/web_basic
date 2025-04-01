package basic_html;

import java.util.ArrayList;

//2차 클래스 배열
public class arr11 {

	public static void main(String[] args) {
		Integer a[][] = {
				{10,20,30},
				{100,200,300}
		};
		/*
		 * 2차 클래스 배열에 데이터 값을 적용해야 할 경우 1차 클래스 배열을 생성 후
		 * 데이터를 추가하여 2차 클래스 배열에 적용해야만 정상적으로 반영됩니다.
		 */
		//빈 2차 클래스 배열
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>(); 
		int w = 0;
		while(w < a.length) {
			//1차 클래스 배열
			ArrayList<Integer> al2 = new ArrayList<Integer>();
			int ww = 0;
			while(ww <a[0].length) {
				al2.add(a[w][ww]);
				ww++;
			}
			al.add(al2);
			w++;
		}
		//System.out.println(al);
		//System.out.println(al.get(1).get(2));
		
		new arr11_box().arr11box();
	}
}

class arr11_box{
	ArrayList<Integer> al = null;
	ArrayList<ArrayList<Integer>> all =null;
	Integer datalist[][] = {
			{15, 20, 25, 30},
			{8,11, 31, 44},
			{17, 41, 39, 20}
	};
	/*
	 * 1. 원시배열을 자료형 클래스로 변환합니다.
	 * 2. 1차 클래스 배열을 생성하여 뎅터를 리관함
	 * 3. 1차 클래스 배열을 2차 클래스 배열로 이관함
	 * 4. 2차 크래스 배열 출력
	 */
	/*
	 * 응용문제 2차 운시배열 값이 있습니다. 해당 2차 원시 각각의 그룹 데이터 중
	 * 짝수의 값만 그룹별로 설정하여 2차 클래스 배열에 적용되도록 하시오.
	 * 결과
	 * [[20,30],[8,44],[20]]
	 */
	
	public void arr11box() {
		this.all = new ArrayList<ArrayList<Integer>>();
		int f = 0;
		while(f < this.datalist.length) {
			this.al = new ArrayList<Integer>();
			int ff = 0;
			while(ff < this.datalist[0].length) {
				if(this.datalist[f][ff] % 2 == 0) {
					this.al.add(this.datalist[f][ff]);
				}
				ff++;
			}
			this.all.add(this.al);
			f++;
		}
		System.out.println(this.all);
	}
}
