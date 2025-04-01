package re_html;

import java.util.Scanner;

//패스워드 3회 이상 잘못 입력시 프로그램이 종료되도록 하는 코드
public class re_java4 {

	public static void main(String[] args) {
		re_java_box4 rb = new re_java_box4();
		rb.passwod_ck();
	}

}

class re_java_box4{
	
	int count = 0; //실패횟수
	Scanner sc = null;
	String pw = "a1234";
	
	public void passwod_ck() {
		this.sc = new Scanner(System.in);
		String userpw = "";
		//boolean call = true;
		while(true) {  //무한 loop : for(;;)
			System.out.println("패스워드를 입력하세요 : ");		
			userpw = this.sc.next();
			if(this.pw.equals(userpw)) {
				System.out.println("패스워드를 확인하였습니다.");
				break;  //반복문을 종료
				//call = false;
			}
			else {
				this.count++;
				System.out.println("패스워드가 틀립니다.");
				if(this.count == 3) {
					System.out.println("패스워드 3회 실패로 관리자에거 문의하세요!");
					break;
				}
			}
		}
		sc.close();
	}
}