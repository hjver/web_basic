package basic_html;

import java.util.Arrays;

//2차 원시배열
public class arr4 {

	public static void main(String[] args) {
		//2차 배열 선언방식
		String[][] user = {
				{"국어", "영어", "일본어"},
				{"80", "90", "45"}
		};
		System.out.println(user[0][2] + user[1][2]);
		//그룹갯수
		System.out.println(user.length);
		//그룹의 데이터 갯수
		System.out.println(user[0].length);
		
		int[][] adata = new int[2][2];  //그룹 2개, 2개의 데이터
		adata[0][0] = 50;
		adata[0][1] = 150;
		adata[1][0] = 250;
		adata[1][1] = 350;
		//Arrays.toString : 1차 배열에 한해서
		//Arrays.deepToString : 2차 배열부터는 해당 메소드를 이용하여 문자로 출력하는 방식
		System.out.println(Arrays.deepToString(adata));
		
		arr4_box ab = new arr4_box();
		ab.arrbox();
	}
}

class arr4_box{
	int data[][];  //2차 배열 변수 생성
	
	public void arrbox() {
		//할인율 공식 적용
		//10000 => 20% => 8000
		int a = 10000;  //실제가격
		int b = 20; //할인율
		int sum = a - (a * b) / 100;
		System.out.println(sum);
		
		this.data = new int[][] {  //필드에 있는 2차배열에 값을 적용
			{100, 200, 300, 400},
			{10, 5 , 8, 4}
		};
		
		//2차배열에 적용된 금액으로 할인율을 적용하여 출력되는 코드
		int f = 0;
		while(f < this.data[0].length) {
			int sales = this.data[0][f] - (this.data[0][f] * this.data[1][f]) /100;
			System.out.println(sales);
			
			f++;
		}
	}
}