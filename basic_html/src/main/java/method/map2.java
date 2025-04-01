package method;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*
 * Hashtable(데이터 병렬처리에 사용하는 키배열) 사용법 - null(X)
 * HashMap(데이터 단일처리에 ㅏ용하는 키배열) - null(O)
 */
public class map2 {

	public static void main(String[] args) {
		Map<Integer, String> data = new Hashtable<Integer, String>();
		data.put(1, "HTML");
		data.put(2, "CSS");
		data.put(3, "Javascript");
		data.put(4, "Java");
		System.out.println(data);
		int w = 0;
		while(w < data.keySet().size()) { //키 객수만큼 반복문을 이용하여 데이터를 출력
			System.out.println(data.get(w+1));  //해당 키에 맞는 데이터를 출력
			w++;
		}
	}
}
