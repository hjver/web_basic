package basic_html;

import java.util.Arrays;
import java.util.Scanner;

//1차 원시배열 응용편
public class arr3 {
	public static void main(String[] args) {
		int data[] = {5000,4000,8000,10000,4000};
		//응용문제 해당 배열의 모든값을 다 합한 결과를 출력한느 코드를 작성하시오.
		//최종 결과 값 : 31000
		int z=0;
		int sum=0;
		do {
			sum += data[z];
			z++;
		}while(z < data.length);
		System.out.println("최종 결과 값 : " + sum);
		
		arr3_box ab = new arr3_box();
		ab.box3();
	}
}

/*
 * Scanner를 이용하여 다음의 해당되는 값이 정상적으로 배열에 입력되도록 코드를 작성하시오.
 * 
 * 총 4회를 질문을 하게 됩니다.
 * "입금하실 금액을 입력 하세요 : "
 * 
 * 최종결과는 총 4회 입금된 금액을 배열로 출력하시오.
 */
class arr3_box{
	Scanner sc = null;
	int[] data;
	int z;
	
	public void box3() {
		this.sc = new Scanner(System.in);
		this.data = new int[4];  //빈배열 갯수를 설정
		this.z = 0;
		while(this.z < this.data.length) { //빈배열 갯수 사용
			System.out.println("입금하실 금액을 입력 하세요 : ");
			this.data[this.z] = this.sc.nextInt();
			this.z++;
		}
		System.out.println("최종결과 : " + Arrays.toString(this.data));
		this.sc.close();
	}
}
