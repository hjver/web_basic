package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class java1 {
	public static void main(String[] args) {
		new java1_box().mycode();
	}
}

class java1_box {
	Scanner sc = null;
	int cnt = 0;
	ArrayList<Integer> nums = null;
	Integer num = null;
	int k;
	
	public void mycode() {
		this.nums = new ArrayList<Integer>();
		System.out.println("숫자를 입력 하세요 : ");
		try {
			this.sc = new Scanner(System.in);
			this.cnt = this.sc.nextInt();
			if(this.cnt <= 0) {
				System.out.printf("'%s'를 입력하셨네요. 0보다 큰 정수를 입력하세요.%n", this.cnt);
				this.mycode();
			}
			boolean is_continue = true;
			while(is_continue) {
				this.num = (int)Math.ceil(Math.random()*30);
				boolean is_duplicate = false;
				for(this.k=0; this.k<nums.size(); this.k++) {
					if(this.num == this.nums.get(k)) {
						is_duplicate = true;
						break;
					}
				}
				if(!is_duplicate) {
					this.nums.add(num);
				}
				if(this.nums.size() == this.cnt) {
					is_continue = false;
				}
			}
			System.out.print("결과 : ");
			for(this.k=0; this.k<this.nums.size(); this.k++) {
				System.out.print(this.nums.get(this.k));
				if(this.k < this.nums.size()-1) {
					System.out.print(", ");
				}
			}
		}
		catch(Exception e) {
			System.out.printf("'%s'를 입력하셨네요. 0보다 큰 정수를 입력하세요.%n", this.sc.nextLine());
			this.mycode();
		}
		finally {
			this.sc.close();
		}
		System.exit(0);
	}
}
