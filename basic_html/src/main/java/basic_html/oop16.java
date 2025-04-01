package basic_html;

import java.util.Scanner;

//더블 반복문 (for, while, do~while)
public class oop16 {
	public static void main(String[] args) {
		oop16_box ob = new oop16_box();
		//ob.fors();
		//ob.whiles();
		//ob.dowhiles();
		ob.users();
		ob.sc.close();
	}
}

class oop16_box{
	int f, ff;
	/*
	 * 응용문제
	 * 사용자가 구구단 단수를 입력하게 됩니다.
	 * "시작 단수 : "5
	 * "종료 단수 : "7
	 * "구구단 범위 정수 : "3
	 * 
	 * [결과]
	 * 5 * 1
	 * 5 * 2
	 * 5 * 3
	 * 6 * 1
	 * ...
	 */
	
	Scanner sc = null;
	int a, b, c;
	public void users() {
		this.sc = new Scanner(System.in);
		System.out.println("시작 단수 : ");
		this.a = this.sc.nextInt();
		System.out.println("종료 단수 : ");
		this.b = this.sc.nextInt();
		System.out.println("구구단 범위 정수 : ");
		this.c = this.sc.nextInt();
		int i = this.a;
		int j;
		do {
			j = 1;
			do {
				System.out.println(i + "*" + j + "=" + i*j);
				j++;
			}while(j <= this.c);
			i++;
		}while(i <= this.b);
	}
	
	public void fors() {
		for(this.f=2; this.f<10; this.f++) { //2~9
			for(this.ff=1; this.ff<=9; this.ff++) {
				System.out.println(f + "*" + ff + "=" + f*ff);
			}
		}
	}
	public void whiles() {
		this.f = 2;
		while(this.f <= 9) { //2~9
			this.ff = 1;   //작은 while에 사용하는 초기값
			while(this.ff <= 9) {
				System.out.println(f + "*" + ff + "=" + f*ff);
				ff++;
			}
			f++;
		}
		
	}
	public void dowhiles() {
		this.f = 2;
		do {
			this.ff = 1;
			do {
				System.out.println(f + "*" + ff + "=" + f*ff);
				this.ff++;
			}while(this.ff <= 9);
			this.f++;
		}while(this.f <= 9);
	}	
}