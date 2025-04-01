package basic_html;

import java.util.ArrayList;

//1차 배열값을 이용하여 최종 합계를 구하는 코드를 작성하시오(예외처리 필수)
/*
 * [결과]
 * 포인트에 대한 전체 합계 : 90100
 * 단, 해당 배열의 값을 전달 할 경우 오류 발생시 오류 처리에 관한 메세지도 출력
 * 
 * [오류발생시]
 * "정상적인 데이터를 변환하지 못하여 서비스 오류가 발생 하였습니다."
 */
public class ex5 {

	public static void main(String[] args) {
		String money[] = {"5,000", "6,500", "70,000", "3,400", "5,200"};
		ex5_box eb = new ex5_box();
		eb.abc(money);
		
	}
}

class ex5_box {
	
	public void abc(String money[]) {
		int x;
		try {
			int m;
			int sum=0;
			for(x=0; x<money.length; x++) {
				sum += Integer.valueOf(money[x].replace(",", ""));
			}
			System.out.println(sum);
		}
		catch(NumberFormatException nfe) {
			System.out.println("정상적인 데이터를 변환하지 못하여 서비스 오류가 발생 하였습니다.");
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}
}
