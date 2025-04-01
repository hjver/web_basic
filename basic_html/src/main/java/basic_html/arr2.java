package basic_html;

import java.util.Arrays;

public class arr2 {

	public static void main(String[] args) {
		arr2_box ab = new arr2_box();
		ab.arrbox();
		int backdata[] = {100,200,300};
		ab.arrbox2(backdata);  //해당 메소드레 배열 변수값을 전달
	}

}

class arr2_box{
	int data[];  //배열울 사용하기 위한 변수만 선언
	String basket[] = new String[5];  //5개의 데이터 방을 생성한 필드값
	int f;
	
	//해당 변수의 자료령 및 배열기호를 적용하여 매개변수로 값을 받음
	public void arrbox2(int[] z) {  
		System.out.println(Arrays.toString(z));
	}
	
	public void arrbox() {
		/*
		this.data = new int[3];
		this.data[0] = 500;
		this.data[1] = 1000;
		this.data[2] = 1500;
		*/
		this.data = new int[] {500,1000,1500,2000};
		this.f = 0;
		while(this.f < this.data.length) {
			System.out.println(this.data[this.f]);
			f++;
		}
		//필드에 선언되어 있는 배열을 new를 사용시 새롭게 배열 구성이 됩니다.
		this.basket = new String[] {"a", "b", "c"};
		System.out.println(Arrays.toString(basket));
	}
}
