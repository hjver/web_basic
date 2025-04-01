package method;
//추상 클래스를 선언

import java.util.ArrayList;
import java.util.Scanner;

abstract class ab_box {
	String userid = null;  //추상 클래스 전역변수
	Scanner sc = new Scanner(System.in);  //Scanner
	ArrayList<String> all = null;
	final int level = 1;  //상수로 선언하여 값을 변경 못하며 해당 변수를 로드
	//추상 클래스를 상속 받느 동시에 실행되며, @Override는 붙지 않는다. 
	public ab_box() {
		this.userid = "hong";
		System.out.println(this.userid);
	};
	public void ab_method1() {
		int data[] = {10,20,30,40};
		int f;
		for(f=0; f<data.length; f++) {
			System.out.println(data[f]);
		}
	};
	public void ab_method1(String uid) {};
	public void ab_method1(int uid) {};
	
	
}
