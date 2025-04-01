package basic_html;
//외부 라이브러리를 가져오는 형태
import java.util.Scanner;

//Scanner를 이용하여 반복문 사용
/*
 * 응용문제
 * 사용자가 숫자를 하나 입력합니다. 해당 구구단이 출력되도록 합니다.
 * 예시)
 * "구구단 수를 입력하세요 : "4
 * 4
 * 8
 * 16....
 * 
 * 응용문제
 * 총 5번의 숫자를 입력하는 코드를 작성합니다.
 * "숫자를 입력하세요 : " 해당문구 5번 발생
 * 사용자가 총 5번 입력된 숫자의 모든 합을 구하는 코드를 작성합니다.
 */
public class oop15 {
	public static void main(String[] args) {
		oop15_box ob = new oop15_box();
		//ob.gugu();
		ob.calc();
		ob.sc.close();
	}
}

class oop15_box{
	Scanner sc = null;  //객체만 사용하도록 셋팅
	int no;	
	
	public void calc() {
		this.sc = new Scanner(System.in);
		int sum=0;
		int i;
		for(i=1; i<=5; i++) {
			System.out.println("숫자를 입력하세요 : ");
			sum += this.sc.nextInt();   //사용자가 입력한 값을 누적시킴
		}
		System.out.println("총 합계 : " + sum);
	}
	
	public void gugu() {
		System.out.println("구구단 수를 입력하세요 : ");
		this.sc = new Scanner(System.in);  //해당 메소드 호출 시 인스턴스 실핼
		this.no = sc.nextInt();
		
		int i = 1;
		do {
			System.out.println(i * no);
			i++;
		}while(i < 10);
	}
}
