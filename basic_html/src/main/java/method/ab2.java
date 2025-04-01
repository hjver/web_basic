package method;

import java.util.ArrayList;

//ab_box에 있는 추상 클래스를 상속 받아서 처리하는 코드
public class ab2 {

	public static void main(String[] args) {
		ab2_box ab = new ab2_box();
		ab.ab_method1();
		ab.ab_method1(12345);
	}
}
//ab_box라는 추상 클래스를 로드함
class ab2_box extends ab_box{
	//abstract : 해당 즉시 실행 메소드도 작동이 됨
	public ab2_box() {  //별도 메소드를 선언하여 클래스 로드시 즉시실행
		String email = "hong@natecom";
		System.out.println(email);
	}
	/*
	 * super : 추상클래스 안에 메소드에 코드를 작성한 내용이 있을 경우
	 * 해당 코드를 로드하여 구성할 때 사용합니다.
	 */
	@Override
	public void ab_method1() { 
		super.ab_method1();
	}
	@Override
	public void ab_method1(int uid) {
		if(uid == 12345) { //인증번호가 동일한 조건일 경우
			this.all = new ArrayList<String>(); //ab 필드에 선언된 클래스 배열을 실행
			while(true) {
				System.out.println("상품명을 입력하세요(exit 입력시 포로그램 종료) : ");
				String product = this.sc.nextLine();
				if(!product.equals("exit")) {
					this.all.add(product);
				}
				else {
					break;
				}
			}
			System.out.println(this.all);  //사용자가 입력한 상품 리스트
		}
		else {
			System.out.println("해당 인증번호가 확인되지 않았습니다.");
		}
		
	}
}
