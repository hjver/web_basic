package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class java4 {
	public static void main(String[] args) {
		new java4_box().mycode();
	}
}

class java4_box{
	Scanner sc = null;
	ArrayList<Integer> nums = new ArrayList<Integer>();
	Integer num = null;
	int cnt = 10;
	int k;
	
	public void mycode() {
		this.sc = new Scanner(System.in);
		boolean is_continue = true;
		while(is_continue) {
			System.out.println("숫자를 입력하세요(1~500) : ");
			try {
				this.num = this.sc.nextInt();
				if(this.num < 1 || this.num > 500) {
					System.out.printf("'%s'를 입력하셨네요. 1~500 사이의 정수를 입력하세요.%n", this.num);
					mycode();
				}
				this.nums.add(this.num);
				if(this.nums.size() == this.cnt) {
					is_continue = false;
				}
			}
			catch(Exception e) {
				System.out.printf("'%s'를 입력하셨네요. 1~500 사이의 정수를 입력하세요.%n", this.sc.nextLine());
				mycode();				
			}
		}
		Collections.sort(this.nums, Collections.reverseOrder());
		System.out.println("[최종 출력]");
		System.out.println(this.nums);
		this.sc.close();
		System.exit(0);
	}
}