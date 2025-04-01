package re_html;
//추상 클래스

import java.util.ArrayList;
import java.util.Scanner;

public abstract class ab1 {
	Scanner sc = null;
	ArrayList<String> arr = null;
	ArrayList<ArrayList<String>> all = null;
	String user = null;
	int number[] = null;
	String datas[] = null;
	
	public abstract void main_method(); //필수 override
	public Integer box1() {
		return 0;
	};
	public String box2() {
		return null;
	}
	public ArrayList<String> arr_method(){
		
		return null;
	}
	public ArrayList<ArrayList<String>> all_method(){
		
		return null;
	}
}
