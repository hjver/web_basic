package exam;

public class java5 {
	public static void main(String[] args) {
		new java5_box().mycode();
	}
}

class java5_box{
	int nums[] = {20, 36, 11, 8, 22, 31};
	int max_num;
	int k;
	
	public void mycode() {
		this.max_num = this.nums[0];
		for(this.k=1; this.k<this.nums.length; this.k++) {
			if(this.max_num < this.nums[k]) {
				this.max_num = this.nums[k];
			}
		}
		System.out.println("가장 큰 수는 " + this.max_num + " 입니다.");
	}
}