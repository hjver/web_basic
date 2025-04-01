package re_html;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class re_java10_1 {
	public static void main(String[] args) {
		new kiosk();
	}
}

class kiosk extends ab1{
	StringBuilder sb = new StringBuilder();  //메뉴 문자열 용도
	String menus[][] = {
			{"1","콜라","3200"},
			{"2","커피","1700"},
			{"3","아이스크림","800"},
			{"4","오렌지 쥬스","1200"}
		};
	
	public kiosk() {
		this.sc = new Scanner(System.in);
		this.main_method();
	}
	
	@Override
	public void main_method() {
		this.all = new ArrayList<ArrayList<String>>();
		int w = 0;
		while(w < this.menus.length) {
			this.sb.append(this.menus[w][0]+"."+ this.menus[w][1] + " "); //메뉴 문자열을 생성하는 곳
			this.arr_method(this.menus[w]);
			this.all_method();
			w++;
		}
		this.menu_select();
	}
	
	private void menu_select() {
		System.out.println("메뉴를 선택하세요 [" + this.sb + "]");
		try {
			int usermenu = this.sc.nextInt();
			if(usermenu > 0 && usermenu <= this.all.size()) {
				System.out.println("해당 메뉴 갯수를 입력하세요 : ");
				int userea = this.sc.nextInt();
				int total = Integer.parseInt(this.all.get(usermenu-1).get(2)) * userea;
				System.out.println("결제하실 총 금액 : " + total);
			}
			else {
				System.out.println("해당 메뉴 번호를 잘못 입력 하셨습니다.");
				new kiosk();
			}
		}
		catch(Exception e) {
			System.out.println("해당 메뉴를 올바르게 선택하세요!!");
			new kiosk();
		}
		finally {
			sc.close();
		}
	}
	
	public ArrayList<String> arr_method(String smenu[]) {
		this.arr = new ArrayList<String>(Arrays.asList(smenu));
		return this.arr;
	}
	
	@Override
	public ArrayList<ArrayList<String>> all_method() {
		this.all.add(this.arr);
		return this.all;
	}
}