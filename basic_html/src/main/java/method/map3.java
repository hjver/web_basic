package method;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class map3 {
	public static void main(String[] args) {
		new map3_test().keyarray();
		new map3_test_1().test();
	}
}
/*
 * 응용문제 -> 주말 테스트 문제
 * {"hong", "kim", "park", "jang"}
 * {"M", "W", "M", "W"}
 * 해당 원시 배열이 있습니다.
 * 해당 원시배열을 이용하여 다음 결과 처럼 추력되는 key배열 코드를 작성하시오.
 * 
 * { userid=[hong, kim. park, jang], gender=[M, W, M, W] }
 */

class map3_test{
	String data[][] = {
		{"hong", "kim", "park", "jang"},
		{"M", "W", "M", "W"}	
	};
	String keydata[] = {"userid", "gender"};
	public void keyarray() {
		//Map을 생성시 주의사항 : 1차 클래스배열에 대한 객체에 따른 인스턴스명을 체크 해야함
		Map<String, List<String>> userdata = new HashMap<>();
		int w = 0;
		do {
			//inteface로 클래스 배열에 값을 이관하는 코드
			List<String> db = new ArrayList<String>();
			for(int f=0; f<this.data[0].length; f++) {  //4
				db.add(this.data[w][f]);
			}
			userdata.put(this.keydata[w], db);
			w++;
		}while(w < this.keydata.length);  //2
		System.out.println(userdata);
	}
}

class map3_test_1{
	List<String> users = new ArrayList<String>();
	List<String> genders = new ArrayList<String>();
	Map<String, List<String>> data = new HashMap<String, List<String>>();
	
	public void test() {
		users.add("hong");
		users.add("kim");
		users.add("park");
		users.add("jang");
		
		genders.add("M");
		genders.add("W");
		genders.add("M");
		genders.add("w");
		
		data.put("userid", users);
		data.put("gender", genders);
		
		System.out.println(data);
	}
}