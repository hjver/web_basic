package method;

import java.util.Scanner;

//inter3, inter4을 연계하여 사용한 코드
public class in3 {
	public static void main(String[] args) {
		Integer bankselect = 2;
		allbank ab = new allbank(bankselect);
	}
}

class allbank implements inter3, inter4 {
	String password = "";  //비밀번호
	String bankname = "";  //은행명
	Integer cg = 0;  //수수료
	Scanner sc = new Scanner(System.in);
	String userpassword = ""; //사용자가 입력한 패스워드
	
	public allbank(Integer bankselect) {
		switch(bankselect) {
		case 1: //국민
			this.KB_bank();
		break;
		
		case 2: //신한
			this.SH_bank();
		break;

		default:
			System.out.println("해당 은행은 서비스 정지중입니다.");
		break;
		}
	}
	
	@Override
	public void KB_bank() { //국민은행 처리 메소드
		this.password = inter3.password;
		this.bankname = inter3.bankname;
		this.cg = inter3.cg;
		System.out.printf("%s 패스워드를 입력하세요 : %n", this.bankname);
		this.userpassword = this.sc.next();
		if(this.password.equals(this.userpassword)) {
			System.out.println("입출금 서비스를 선택해 주세요.");
			System.out.println("타 은행 수수료는 " + this.cg + " 입니다.");
		}
		else {
			System.out.println("패스워드가 다릅니다.");
		}
	}
	
	@Override
	public void SH_bank() { //신한은행 처리 메소드
		this.password = inter4.password;
		this.bankname = inter4.bankname;
		this.cg = inter4.cg;
		System.out.printf("%s 패스워드를 입력하세요 : %n", this.bankname);
		this.userpassword = this.sc.next();
		if(this.password.equals(this.userpassword)) {
			System.out.println("입출금 서비스를 선택해 주세요.");
			System.out.println("타 은행 수수료는 " + this.cg + " 입니다.");
		}
		else {
			System.out.println("패스워드가 다릅니다.");
		}
	}
}
