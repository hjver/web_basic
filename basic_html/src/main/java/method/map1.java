package method;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class map1 {
	public static void main(String[] args) {
		//new map1_box().box();
		new map1_box().box2();
	}
}

/*
 * Map 클래스 배열 (key, value)를 구성하여 put을 이용하여 데이터를 입력하는 방식
 * 동일한 키명을 사용시 기존 데이터를 변경 되어버림
 */
//사용빈도 : HashMap > ArrayList > LinkedList
class map1_box{
	List<String> all = null;
	Map<String, String> all2 = null;
	
	//map을 이용하여 사용하는 방식
	public void box() {
		HashMap<String, String> map1 = new HashMap<>();
		map1.put("product1", "냉장고");
		map1.put("product2", "키보드");
		map1.put("product3", "마우스");
		System.out.println(map1);  //키 별로 데이터 배열 출력
		System.out.println(map1.get("product3")); //등록된 키명을 입력해야만 데이터를 출력
		System.out.println(map1.keySet());  //등록된 key명만 출력할 수 있음
		//Map (interface)를 활용하여 다양한 클래스를 로드할 수 있음(HashMap, Hashtable, TreeMap)
		Map<String, String> map2 = new HashMap<>();
		Map<String, String> map3 = new TreeMap<>();
		//사용법은 동일하게 map1과 같음
	}
	
	//key 배열 + Arraylist : 1차 순차클래스 배열 => 2차 키배열로 전환
	public void box2() {
		ArrayList<Integer> one = new ArrayList<Integer>();
		HashMap<String, ArrayList<Integer>> data = new HashMap<String, ArrayList<Integer>>();
		one.add(10);
		one.add(500);
		one.add(150);
		one.add(null);
		data.put("point", one);
		//System.out.println(data);  //전체 배열 출력
		//System.out.println(data.get("point").get(1));  //해당 키에 맞는 데이터값
		//System.out.println(data.get("point").size());  //해당 키에 데이터 갯수
		
		//foreach를 이용하여 대표키를 설정한 후 대당 대표키에 적용된 데이터를 반복문으로 출력함
		//for(출력할 자료형 변수명 : 키배열을 선언)
		for(Integer no : data.get("point")) {
			System.out.println(no);
		}
		
		//data.remove("point");  //해당 키의 데이터를 모두 삭제
		//data.get("point").clear();  //해당 키의 데이터만 삭제함
		data.get("point").remove(1);  //해당 키 그룹에 있는 데이터 특정값을 삭제
		
		//data.get("point").set(2,  250);  //키 배열에서 해당 배열값을 변경하는 방식
		one.set(2, 300);  //1차 ArrayList 배열의 배열번호를 적용후 데이터 변경방식
		System.out.println(data); 
	}
}