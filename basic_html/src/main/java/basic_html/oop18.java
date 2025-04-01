package basic_html;

import java.util.Scanner;
// 응용문제 답안
//반복문 + Scanner를 이용한 bank 시스템
/*
 * 추가 업무코드를 제작합니다.
 * 메뉴가 변경 요청을 하셔야 합니다.
 * 1.잔액확인, 2.입금, 3.출금, 4.종료 => 변경 요청
 * 잔액확인을 선택하였을 경우
 * 현재 통장 잔액은 : 100000 출력이 되어야 합니다.
 * 
 * 출금을 선택하였을 경우
 * "출금하실 금액을 입력하세요 : "
 * 단, 잔액보다 큰 금액을 입력시 "잔액 액수가 부족합니다." 
 * 잔액보다 적은 금액을 입력시 잔액 - 사용자가 입력한 금액을 적용하여 최종 금액을 출력시킵니다.
 * 
 */
public class oop18 {
	public static void main(String[] args) {
		oop18_bank ob = new oop18_bank();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.잔액확인, 2.입금, 3.출금, 4.종료 번호를 입력하세요 : ");
		int no = sc.nextInt();
		if(no == 1 || no == 2 || no == 3 || no == 4) {
			switch(no) {
				case 1:
					ob.balance();  //1번을 입력시 잔액확인 메소드로 이동
					break;
				case 2:
					ob.deposit();  //2번을 입력시 입금 메소드로 이동
					break;
				case 3:
					ob.withdraw();  //3번을 입력시 출금 메소드로 이동
					break;
				default:
					System.out.println("은행 업무 종료!!");
					break;
			}
		}
		else {
			System.out.println("해당 번호가 아닙니다. 종료하겠습니다.");
		}
	}
}

class oop18_bank{
	int money = 100000; //통장에 10만원 입금된 상황
	Scanner sc2 = new Scanner(System.in);
	
	public void balance() {
		System.out.println("현재 통장 잔액은 : " + this.money);
	}
	
	public void deposit() {
		System.out.println("입금 하실 금액을 입력하세요 : ");
		int money2 = this.sc2.nextInt(); //사용자가 입금하는 금액
		this.money += money2;
		System.out.println("최종금액 : " + this.money);
	}
	
	public void withdraw() {
		System.out.println("출금하실 금액을 입력하세요 : ");
		int money3 = this.sc2.nextInt();
		if (money3 > this.money) {
			System.out.println("잔액 액수가 부족합니다.");
		}
		else {
			this.money -= money3;
			System.out.println("최종금액 : " + this.money);
		}
	}
}
