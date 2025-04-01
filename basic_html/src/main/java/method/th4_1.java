package method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//응용문제
/*
 * {10, 65, 33, 22, 19, 31,26, 87, 94, 21}
 * 해당 원시 배열 값이 있습니다. 
 * 원시배열을 이용하여 멀티 쓰레드로 결과 값을 출력하는 코드를 작성하시오.
 * 
 * [결과]
 * 짝수만 모두 곱한 값을 출력하는 결과값
 * 홀수만 모두 곱한 값을 출력하는 결과 값
 * 모든 배열의 값을 더한 출력 결과 값
 * 
 */
public class th4_1 {
	public static void main(String[] args) {
		
		Integer nums[] = {10, 65, 33, 22, 19, 31,26, 87, 94, 21};
		List<Integer> all = new ArrayList<Integer>(Arrays.asList(nums));
		
		thread1_1 th1 = new thread1_1(all);
		Thread tr1 = new Thread(th1);
		thread2_1 th2 = new thread2_1(all);
		Thread tr2 = new Thread(th2);
		thread3_1 th3 = new thread3_1(all);
		Thread tr3 = new Thread(th3);
		
		tr1.start();
		tr2.start();
		tr3.start();
	}
}

class calculation{
	String msg[] = {"짝수만 모두 곱한 값 : ", "홀수만 모두 곱한 값 : ", "모든 배열의 값을 더한 값 : "};
	List<Integer> all = null;

	public calculation(List<Integer> all) {
		this.all = all;
	}
	public void calc(int n) {
		long sum = 1L;
		for(Integer f : this.all) {
			if(n == 2) {
				sum += f;
			}
			else
				if(f % 2 == n) {
					sum *= f;
				}
		}
		System.out.println(this.msg[n] + sum);		
	}
}

class thread1_1 extends Thread {
	List<Integer> all = null;
	calculation cal = null;
	
	public thread1_1(List<Integer> all) {
		this.all = all;
		this.cal = new calculation(this.all);
	}
	
	@Override
	public void run() {
		this.
		cal.calc(0);
	}
	
}

class thread2_1 extends Thread {
	List<Integer> all = null;
	calculation cal = null;
	
	public thread2_1(List<Integer> all) {
		this.all = all;
		this.cal = new calculation(this.all);
	}
	
	@Override
	public void run() {
		this.cal.calc(1);
	}
}

class thread3_1 extends Thread {
	List<Integer> all = null;
	calculation cal = null;
	
	public thread3_1(List<Integer> all) {
		this.all = all;
		this.cal = new calculation(this.all);
	}
	
	@Override
	public void run() {
		this.cal.calc(2);
	}
}
