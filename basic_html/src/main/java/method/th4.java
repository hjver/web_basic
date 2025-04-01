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
public class th4 {
	public static void main(String[] args) {
		
		Integer nums[] = {10, 65, 33, 22, 19, 31,26, 87, 94, 21};
		List<Integer> all = new ArrayList<Integer>(Arrays.asList(nums));
		
		thread1 th1 = new thread1(all);
		Thread tr1 = new Thread(th1);
		thread2 th2 = new thread2(all);
		Thread tr2 = new Thread(th2);
		thread3 th3 = new thread3(all);
		Thread tr3 = new Thread(th3);
		
		tr1.start();
		tr2.start();
		tr3.start();
	}
}

class thread1 extends Thread {
	List<Integer> all = null;
	
	public thread1(List<Integer> all) {
		this.all = all;
	}
	
	@Override
	public void run() {
		long sum = 1L;
		for(Integer f : this.all) {
			if(f % 2 == 0) {
				sum *= f;
			}
		}
		System.out.println("짝수만 모두 곱한 값 : " + sum);
	}
}

class thread2 extends Thread {
	List<Integer> all = null;
	
	public thread2(List<Integer> all) {
		this.all = all;
	}
	
	@Override
	public void run() {
		long sum = 1L;
		for(Integer f : this.all) {
			if(f % 2 == 0) {
				sum *= f;
			}
		}
		System.out.println("홀수만 모두 곱한 값 : " + sum);
	}
}

class thread3 extends Thread {
	List<Integer> all = null;
	
	public thread3(List<Integer> all) {
		this.all = all;
	}
	
	@Override
	public void run() {
		long sum = 0L;
		for(Integer f : this.all) {
			sum += f;
		}
		System.out.println("모든 배열의 값을 더한 값 : " + sum);
	}
}
