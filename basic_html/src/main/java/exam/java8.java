package exam;

import java.util.ArrayList;
import java.util.Arrays;

public class java8 {
	public static void main(String[] args) {
		new java8_box();		
	}
}

class java8_box extends java8_ab{
	Integer nums[] = {3, 5, 2, 1, 6, 7, 8, 9, 10, 4};
	ArrayList<Integer> nums2 = new ArrayList<Integer>(Arrays.asList(nums));
	ArrayList<Integer> even = new ArrayList<Integer>();
	ArrayList<Integer> odd = new ArrayList<Integer>();
	
	public java8_box() {
		this.even();
		this.odd();
		System.out.println("짝수 : " + even);
		System.out.println("홀수 : " + odd);
	}
	
	@Override
	void even() {
		for(Integer num : this.nums) {
			if(num % 2 == 0) {
				even.add(num);
			}
		}	
	}
	
	@Override
	void odd() {
		for(Integer num : this.nums) {
			if(num % 2 != 0) {
				odd.add(num);
			}
		}	
		
	}
	
}