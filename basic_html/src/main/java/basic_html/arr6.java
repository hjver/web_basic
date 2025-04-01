package basic_html;

import java.util.Arrays;
import java.util.Scanner;

//배열 Return 사용법
public class arr6 {

	public static void main(String[] args) {
		arr6_box ab = new arr6_box();
		//1차 배열을 REturn 받을때도 배열 자료형을 입력후 출력시킴
		String[] result = ab.alldata("a123456");
		System.out.println(Arrays.toString(result));
		
		/* 응용문제 (해당 메소드로 배열 데이터를 이관)
		 * Scanner를 이용하여 혈액형을 검색시 해당 사용자명과 통신사가 출력되도록 
		 * 코드를 각성하시오.
		 * 찾고자 하는 혈액형을 입력하세요.
		 * 이가연
		 * O
		 * KT
		 */
		final String data[][] = {
				{"박선하", "박준범", "오민영", "이가연", "정성문"},
				{"A", "B", "AB", "O", "A"},
				{"SKT", "KT", "LGT", "KT", "알뜰폰"}
		};
		ab.search(data);
		//String[][] result2 = ab.search2(data);
		//System.out.println(Arrays.deepToString(result2));
	}

}

class arr6_box{
	
	String[] user = null;
	Scanner sc = null;
	String search_word = null;
	String[][] res = null;
	int k;
	int count;
	
	public void search(String[][] data) {  //해당 메소드에 데이터 출력
		this.sc = new Scanner(System.in);
		this.count = 0;
		System.out.println("찾고자 하는 혈액형을 입력하세요 : ");
		this.search_word = this.sc.next();
		for(this.k=0; this.k<data[0].length; this.k++) {
			if(data[1][k].equals(this.search_word)) {
				System.out.println(data[0][this.k]);
				System.out.println(data[1][this.k]);
				System.out.println(data[2][this.k]);
			}
		}
	}
	
	public String[][] search2(String[][] data) {  //해당 메소드에 데이터 출력
		this.sc = new Scanner(System.in);
		System.out.println("찾고자 하는 혈액형을 입력하세요 : ");
		this.search_word = this.sc.next();
		this.count = 0;
		for(this.k=0; this.k<data[0].length; this.k++) {
			if(data[1][k].equals(this.search_word)) {
				this.count++;
			}
		}
		this.res = new String[3][this.count];
		this.count = 0;
		for(this.k=0; this.k<data[0].length; this.k++) {
			if(data[1][k].equals(this.search_word)) {
				this.res[0][this.count] = data[0][k];
				this.res[1][this.count] = data[1][k];
				this.res[2][this.count] = data[2][k];
				this.count++;				
			}
		}		
		return this.res;
	}
	
	//1차 문자배열 return 메소드
	public String[] alldata(String key) { //배열 겂을 반환하는 return 메소드
		if(key.equals("a123456")) {
			this.user = new String[] {"구나영", "김선익", "김수영", "김중수", "황재준"};
		}
		return this.user;
	}
}