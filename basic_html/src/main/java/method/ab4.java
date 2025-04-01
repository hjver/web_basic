package method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

/*
 * 응용문제, 추상 클래스를 이용하여 입,출금이 가능하는 프로세스를 제작합니다.
 * 다음과 같이 프로세스가 진행됩니다.
 * 
 * "은행 메뉴를 선택해 주세요(1.신한, 2.농협, 3.국민, 4.하나) : "
 * 단 2번을 선택시 "현재 농협은 시스템 점검으로 서비스가 되지 않습니다."
 * 그 외에 사힝은 다음과 같습니다.
 * "입/출금 메뉴를 선택하세요 : 1. 입금, 2. 출금, 3. 종료"
 * "입금 금액을 입력하세요 : " 또는 "출금 금액을 입력하세요 : "
 * 종료를 선택시 "입/출금 업무를 종료 합니다."
 * 
 * 통장잔고 금액 : 100000이 적용되어 있으며, 단 해당 은행은 국민은행 입니다.
 * 입금 및 출금이 처리 되었을 경우 "입금 5000 되었습니다.", "출금 5000 되었습니다."
 * 단 잔고가 없을 경우 "해당 통장 잔액이 모자랍니다."
 * 입금 되었을 경우 통장잔고 + 입금 금액이 적용 되어야 합니다.
 */
public class ab4 {
	public static void main(String[] args) {
		//ab4_box ab = new ab4_box();
	}
}
/*
class ab4_box extends ab_box3{
	String banknm = "국민";
	int userinput;
	int money;
	int sinhan, kookmin, hana;
	String menu_msg[] = new String[3];
	
	public ab4_box() {
		this.total = 100000;
		this.acc = new ArrayList<String>(Arrays.asList(this.menus));
		this.user_menu();
	}
	
	private void user_menu() {
		String menulist = "";
		int w = 0;
		while(w < this.acc.size()) {
			menulist += this.acc.get(w) + " ";
			w++;
		}
		menu_msg[0] = String.format("은행 메뉴를 선택해 주세요 : %s", menulist);
		System.out.printf("은행 메뉴를 선택해 주세요 : %s", menulist);
		try{
			this.menu_msg[0] = this.sc.nextInt();
		}
		catch(InputMismatchException ime) {
			System.out.println("메뉴 숫자를 입력해 주세요.");
			this.sc.nextLine(); // 입력 버퍼를 비움
			user_menu();
		}
		switch(this.usermenu) {
			case 1:
				user_menu2();
				break;
			case 2:
				System.out.println("현재 농협은 시스템 점검으로 서비스가 되지 않습니다.");
				break;
			case 3:
				user_menu2();
				break;
			case 4:
				user_menu2();
				break;
			default:
				System.out.println("1~4번까지 메뉴 번호를 입력하세요");
				user_menu();
				break;
		}
	}

	public void user_menu2() {
		System.out.println("입/출금 메뉴를 선택하세요(1. 입금, 2. 출금, 3. 종료) : " );
		try {
			this.usermenu2 = this.sc.nextInt();
		}
		catch(InputMismatchException ime) {
			System.out.println("메뉴 숫자를 입력해 주세요.");
			this.sc.nextLine(); // 입력 버퍼를 비움
			user_menu2();
		}
		switch(this.usermenu2) {
			case 1:
				System.out.println("입금 금액을 입력하세요 : ");
				this.money = this.sc.nextInt();
				deposit(this.money);
				break;
			case 2:
				System.out.println("출금 금액을 입력하세요 : ");
				this.money = this.sc.nextInt();
				drawal(this.money);
				break;
			case 3:
				System.out.println("입/출금 업무를 종료 합니다.");
				break;
			default:
				System.out.println("1~3번까지 메뉴 번호를 입력하세요");
				user_menu2();
				break;
		}
	}
	
	public void check_scanner_input(String msg) {
		sys
		try{
			this.userinput = this.sc.nextInt();
		}
		catch(InputMismatchException ime) {
			System.out.println("메뉴 숫자를 입력해 주세요.");
			this.sc.nextLine(); // 입력 버퍼를 비움
			user_menu();
		}		
	}
	
	public void nonghyup() {
		System.out.println("농협");
	}
	
	public void kookmin() {
		System.out.println("국민");
	}
	
	public void hana() {
		System.out.println("하나");
	}

	@Override
	public String deposit(int money) {
		return null;
	}
	@Override
	public String drawal(int money) {
		return null;
	}

}
*/
