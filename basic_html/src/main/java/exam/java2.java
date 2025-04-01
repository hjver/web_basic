package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class java2 {
	public static void main(String[] args) {
		new java2_box().mycode();
	}
}

class java2_box{
	Scanner sc = null;
	ArrayList<Integer> nums = new ArrayList<Integer>();
	Integer num = 0;
	int cnt = 6;
	int k;
	
	public void mycode() {
		this.sc = new Scanner(System.in);
		boolean is_continue = true;
		while(is_continue) {
			System.out.println("숫자를 입력하세요(1~46) : ");
			try {
				this.num = this.sc.nextInt();
				if(this.num < 1 || this.num > 46) {
					System.out.printf("'%s'를 입력하셨네요. 1~46 사이의 정수를 입력하셔야 합니다.%n", this.num);
					mycode();
				}
				boolean is_duplicate = false;
				for(this.k=0; this.k<this.nums.size(); this.k++) {
					if(this.num == this.nums.get(k)) {
						is_duplicate = true;
						if(is_duplicate) {
							System.out.println("중복된 숫자를 입력하셨습니다.");
						}
						break;
					}
				}
				if(!is_duplicate) {
					this.nums.add(this.num);
				}
				if(this.nums.size() == this.cnt) {
					is_continue = false;
				}
			}
			catch(Exception e) {
				System.out.printf("'%s'를 입력하셨네요. 1~46 사이의 정수를 입력하셔야 합니다.%n", this.sc.nextLine());
				mycode();
			}
		}
		System.out.print("[출력] ");
		for(this.k=0; this.k<this.nums.size(); this.k++) {
			System.out.print(this.nums.get(k));
			if(this.k < this.nums.size()-1) {
				System.out.print(", ");
			}
		}
		this.sc.close();
		System.exit(0);
	}
}