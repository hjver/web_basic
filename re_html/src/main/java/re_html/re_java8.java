package re_html;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//2차 배열 및 클래스배열
public class re_java8 {
	public static void main(String[] args) {
		re_java8_box rb = new re_java8_box();
		rb.boxs();
		rb.boxs2();
		rb.boxs3();
	}
}

class re_java8_box{
	ArrayList<Object> al1 = null;  //1차
	ArrayList<ArrayList<Object>> al2 = null;  //2차
	Scanner sc = null;
	Object data[][] = {
			{"홍길동", "강감찬", "이순신"},
			{55, 80, 100}
	};	
	
	/* 응용문제3.
	 * 사용자가 숫자 하나를 입력합니다. 단, 배열에 같은 숫자가 있응 경우 재 입력을 해야 합니다.
	 * 사용자가 입력한 숫자 값을 포함하여, 내림차순으로 정렬하는 코드를 자겅하시오.
	 */
	
	int number[] = {8, 10, 1, 22, 16, 14, 36, 31, 20};
	
	public void boxs3() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int k;
		int no=0;
		for(k=0; k<number.length; k++) {
			nums.add(number[k]);
		}
		this.sc = new Scanner(System.in);
		boolean is_break = false;
		while(!is_break) {
			System.out.println("숫자 하나를 입력하세요.");
			for(k=0; k<number.length; k++) {
				try {
					no = this.sc.nextInt();
				}
				catch(Exception e) {
					
				}
				if(no != nums.get(k)) {
					is_break = true;
					break;
				}
			}
		}
		nums.add(no);	
		Collections.sort(nums, Collections.reverseOrder());
		System.out.println(nums);
	}
	
	//2. [홍길동, 55], [강감찬, 80], [이순신, 100]
	public void boxs2() {
		this.al2 = new ArrayList<ArrayList<Object>>();
		int z=0;
		while(z < data[0].length) {  //3
			this.al1 = new ArrayList<Object>();
			int zz=0;
			while(zz < data.length) {  //2
				this.al1.add(data[zz][z]);
				zz++;
			}
			this.al2.add(this.al1);
			z++;
		}
		System.out.println(this.al2);
	}
	
	//1. [홍길동, 강감찬, 이순신], [55, 80, 100]
	public void boxs() {
		this.al2 = new ArrayList<ArrayList<Object>>();
		int w = 0;
		do {
			this.al1 = new ArrayList<>();
			int ww = 0;
			do {
				
				this.al1.add(this.data[w][ww]);
				ww++;
			}while(ww < this.data[0].length);
			this.al2.add(this.al1);
			w++;
		}while(w < this.data.length);
		System.out.println(this.al2);
	}
}
