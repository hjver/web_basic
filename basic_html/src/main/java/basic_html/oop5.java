package basic_html;
//클래스와 메소드 응용편
/*
 응용편
 외부 클래스를 이용하여 다음과 같이 결과값이 출력되도록 코드를 작성하시오.
 단, 전역변수에 다음과 같은 결과값이 있습니다.
 전역변수 : 100000, 80000, 3.5
 해당 전역변수의 모든 값을 외부 클래스에서 이관 받아서 세개의 값을 곱한 결과를
 출력하시오.
 */
public class oop5 {
	//static : 메모리에 고정적 할당
	
	public static void main(String[] args) {
		oop5_box ob = new oop5_box();
		ob.aaa();

		//메인 클래스레서 일반 메소드를 호출한 경우
		oop5 op = new oop5();
		op.main2();
		
		//main2(); //static 메소드를 활용할 경우
	}
	//메인 class에 일반 메소드를 활용한 상황
	public void main2() {
		System.out.println("메인 일반 메소드 호출!!");
	}

}

class oop5_box{
	int a = 100000;
	int b = 80000;
	float c = 3.5f;
	/*
	 산술연산을 할 경우 결과값이 - 형태가 출력 될 경우
	 자료형 범위를 오버하여 결과가 나왔으므로 오류 결과가 출력된 것임
	 */
	public void aaa() {
		//Long : 클래스를 이용하여 int를 자료형을 변환하여 출력하는 형태	
		
		long sum = Long.valueOf(a) * Long.valueOf(b);
		double sum2 = sum * c;
		System.out.println(sum2);
	}
}
