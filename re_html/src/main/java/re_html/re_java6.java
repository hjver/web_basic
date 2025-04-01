package re_html;

import java.util.Scanner;
/* 키오스크 메뉴형태에 맞는 주문 시스템을 제작하게 됩니다.
 * [키오스크] - 메뉴선택
 * 메뉴선택 : 1.커피 2.햄버커 3.콜라 4.피자 5.샌드위치
 * 
 * 단, 1~5 외에 숫자외 입력시 
 */
public class re_java6 {
	public static void main(String[] args) {
		re_java6_box rb = new re_java6_box();
	}
}

class re_java6_box{
	Scanner sc = null;
	String menu[] = null;
	int usermenu = 0;  //사용자가 선택한 메뉴값
	
	public re_java6_box() {
		this.menu = new String[]{"coffee", "humburger", "cola", "pizza", "sandwitch"};
		this.sc = new Scanner(System.in);
		this.menu_select();
	}
	
	private void menu_select() {
		//StringBuiler, StringBuffer : 문자열을 쉽게 연결할 수 있음
		StringBuilder sb = new StringBuilder(); //append
		int w = 0;	
		while(w < this.menu.length){
			sb.append((w+1) + "." + this.menu[w] + " ");
			w++;
		}
		System.out.println("menu No : " + sb);
		try {  //try => 정상적인 프로세서 진행에 대한 처리 메소드
			this.usermenu = this.sc.nextInt(); //사용자가 입력한 값을 변수로 이관
			if(this.usermenu == 5) {
				System.out.println("SOLD OUT!!");
				menu_select();
			}
			else {
				System.out.println("Order Completed!!");
				System.exit(0);
			}
		}
		catch(Exception e) {  //catch => 문제사항이 발생시 처리되는 메소드
			System.out.println("error No Numbers...");
			//System.out.println(e);
			//this.sc.nextLine();
			//menu_select();
			new re_java6_box();
		}
		finally {
			this.sc.close();
		}
	}
}