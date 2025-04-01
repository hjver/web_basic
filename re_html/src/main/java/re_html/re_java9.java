package re_html;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 응용문제3.
 * 사용자가 숫자 하나를 입력합니다. 단, 배열에 같은 숫자가 있응 경우 재 입력을 해야 합니다.
 * 사용자가 입력한 숫자 값을 포함하여, 내림차순으로 정렬하는 코드를 자겅하시오.
 */
public class re_java9 {
	public static void main(String[] args) {
		int numbers[] = {8, 10, 1, 22, 16, 14, 36, 31, 20};
		new re_java9_box(numbers);
	}
}

class re_java9_box extends ab1{
	
	public re_java9_box(int numbers[]) {
		this.sc = new java.util.Scanner(System.in);
		this.number = numbers;
		this.arr = new ArrayList<String>();
		int w = 0;
		while(w < numbers.length) {
			this.arr.add(String.valueOf(numbers[w]));
			w++;
		}
		main_method();
	}
	
	@Override
	public void main_method() {
		System.out.println("숫자를 한 입력해 주시기 바랍니다.");
		try {
			int userno = this.sc.nextInt();
			Integer num[] = new Integer[this.number.length + 1]; //기존 데이터 배열 + 1를 더하여
			
			boolean nock = true;
			int w = 0;
			while(w < this.number.length) {
				if(userno == this.number[w]) {
					nock = false;
					break;
				}	
				num[w] = this.number[w];
				w++;
			}
			if(nock == false) {
				System.out.println("해당 숫자는 이미 등록되어 있습니다.");
				main_method(); //new 사용없이 자신의 메소드를 재호출 할 수 있음(try)
			}
			else {
				num[num.length-1] = userno;
				//Arrays.sort(num);  //올림차순
				//내림차순 (Integer, String 클래스 자료형)
				Arrays.sort(num, Collections.reverseOrder());
				System.out.println(Arrays.toString(num));
			}
//			String userno = "36";
//			//contains : 클래스 배열에서 해당 데이터가 있는지를 확인하는 메소드(true, false)
//			boolean ck = this.arr.contains(String.valueOf(userno));
//			System.out.println(ck);
			
		}
		catch (Exception e){
			System.out.println("숫자만 입력하세요!!");
			new re_java9_box(this.number).main_method();
		}
		finally {
			sc.close();
		}
	}
}