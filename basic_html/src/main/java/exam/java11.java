package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class java11 {
	public static void main(String[] args) {
		new java6_box().mycode();
	}
}

class java6_box{
	String users[][] = {
			{"hong", "kim", "park", "jang"},
			{"M", "W", "M", "W"}
	};
	String keys[] = {"userid", "gender"};
	
	public void mycode() {
		Map<String, ArrayList<String>> userdata = new HashMap<>();
		int w = 0;
		while(w < this.keys.length) {
			ArrayList<String> al = new ArrayList<String>(Arrays.asList(users[w]));
			userdata.put(this.keys[w], al);
			w++;
		}
		System.out.println(userdata);
	}
}