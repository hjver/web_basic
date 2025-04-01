package basic_html;
//반복문 (for, while, do~while)
public class oop11 {

	public static void main(String[] args) {
		oop11_box ob = new oop11_box();
		//ob.box1();  //for문 올림차순
		//ob.box2();  //for문 내림차순
		//ob.box3();  //for문 무한루프 사용법
		//ob.box4();  //무한루프 이용한 응용편(if문)
		ob.box5();
	}
}

class oop11_box{
	int f;  //반복문에서 사용하는 변수
	//++ (1씩 증가), -- (1씩 감소)
	public void box1() {
		int sum=1;
		//int number = 0;
		Integer number = null;
		for(this.f=1; this.f<5; this.f++) { //1 ~ 4
			number = 100;  //int number : for문 안에 있는 지역변수
			//System.out.println(this.f);
			//sum = sum + this.f;
			sum += this.f;
		}
		System.out.println(sum);
		System.out.println(number);
	}
	
	public void box2() {
		for(this.f=20; this.f>5; this.f--) {
			System.out.println(this.f);
			if(this.f <= 10) {
				break; //반복문 정지
			}
		}
	}
	
	public void box3() {
		//for(;;)  //무한루프 사용형태1
		
		for(this.f=1;;this.f++) { //1~무한루프 사용형태2
			System.out.println(this.f);
			if(this.f >= 50) {  //조건문으로 해당 조건이 완료 되었을때 정지
				break;
			}
		}
	}
	/*
	 * 응용편(무한루프 + 조건문)
	 * 80 이상이 되었을 경우 무한루프는 정지를 해야 하며,
	 * 80까지 숫자중 짝수의 갯수를 최종 출력하는 코드를 작성하시오.
	 */
	public void box4() {
		int c=0;  //갯수를 카운팅 하는 변수
		for(this.f=1;;this.f++) {
			if(this.f >= 80) {
				break;
			}
			else {
				if(this.f % 2 == 0) {
					c++;
				}			
			}
		}
		System.out.println("최종 짝수의 갯수는 : " + c);
	}
	
	public void box5() {  //반복문 : break, continue
		for(this.f=1; this.f<=10;this.f++) {
			if(this.f == 4 || this.f == 8 || this.f == 9) {
				continue;   //반복문 실행시 해당 조건에 맞을 경우 건너뒤기로 진행
			}
			System.out.println(this.f);
		}
	}
}
