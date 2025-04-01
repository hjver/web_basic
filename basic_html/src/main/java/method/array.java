package method;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//추가 데이터 배열 구조
//ArrayList, LinkedList : 
/*
 * List(부모 interface) : ArrayList, LinkedList 중에서 선택하여 사용 가능
 * ArrayList : 순차적으로 데이터를 입력, 삭제 또는 출력할 경우 속도가 빠름
 * LinkedList : 데이터를 검색 또는 기존 데이터에서 추가 데이터를 중간에 삽입 또는 삭제하여 처리할 경우 속도가 빠름
 */

public class array {
	List<String> all = null;  //필드에 interface 배여을 선언

	public static void main(String[] args) {
		//ArrayList, LinkedList : 동일한 사용법
		ArrayList<String> al = new ArrayList<String>();
		LinkedList<String> al2 = new LinkedList<String>();
		al2.add("홍길동");
		al2.add("강감찬");
		//System.out.println(al2);
		List<String> al3 = new ArrayList<String>();
		List<String> al4 = new LinkedList<String>();
		//new array_box().datacheck();  //ArrayList (순차 데이터 입력 더 빠름)
		new array_box().datacheck2();  //LinkedList (ArrayList 보다는 느림)
		
		//배열에 값을 중간에 적용시킴
		//new array_box().datacheck3();
		//new array_box().datacheck4();  //LinkedList (ArrayList 보다는 빠름)
	}
}

class array_box{
	List<Integer> all = null;
	long start = System.currentTimeMillis();
	long end = 0;
	
	public void datacheck() {
		this.all = new ArrayList<Integer>();
		int f = 1;
		do {
			this.all.add(f);
			f++;
		}while(f < 1000000);
		this.end = System.currentTimeMillis();
		long total = this.end - this.start;
		System.out.println(total);
	}
	
	public void datacheck2() {
		this.all = new LinkedList<Integer>();
		int f = 1;
		do {
			this.all.add(f);
			f++;
		}while(f < 1000000);
		this.end = System.currentTimeMillis();
		long total = this.end - this.start;
		System.out.println(total);
	}
	
	public void datacheck3() {
		this.all = new ArrayList<Integer>();
		int f = 1;
		do {
			this.all.add(f);
			if(f >= 800) {
				this.all.add(800, 100);
			}
			f++;
		}while(f < 100000);
		this.end = System.currentTimeMillis();
		long total = this.end - this.start;
		System.out.println(total);
	}
	
	public void datacheck4() {
		this.all = new LinkedList<Integer>();
		int f = 1;
		do {
			this.all.add(f);
			if(f >= 800) {
				this.all.add(800, 100);
			}
			f++;
		}while(f < 100000);
		this.end = System.currentTimeMillis();
		long total = this.end - this.start;
		System.out.println(total);
	}
}
