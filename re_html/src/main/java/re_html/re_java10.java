package re_html;

import java.util.ArrayList;
import java.util.Scanner;

public class re_java10 {
	public static void main(String[] args) {
		String menus[][] = {
				{"1","콜라","3000"},
				{"2","커피","1700"},
				{"3","아이스크림","800"},
				{"4","오렌지 쥬스","1200"}
			};
		new re_java10_box(menus);
	}
}

class re_java10_box extends ab1{
	StringBuilder sb = new StringBuilder();
	String menus[][] = null;
	int menu_num = 0;
	int count = 0;
	int total = 0;
	int x;
	
	public re_java10_box(String menus[][]) {  //즉시실행
		this.menus = menus;
		this.all_method();
		this.main_method();
		this.sc.close();
	}
	
	@Override
	public void main_method() {
		this.sc = new Scanner(System.in);
		System.out.println("[메뉴 배열 및 1EA 가격]");
		int k;
		for(k=0; k<this.all.size(); k++) {
			System.out.println(this.all.get(k).get(0) + "." + this.all.get(k).get(1) + " - " + this.all.get(k).get(2));
			sb.append(this.all.get(k).get(0) + "." + this.all.get(k).get(1) + " ");
		}

		this.box1();
		
		this.total = this.menu_num * this.count * Integer.valueOf(this.all.get(this.menu_num-1).get(2));
		System.out.println("총 결제 금액 : " + this.total);
	}
	
	@Override
	public Integer box1() {
		System.out.println("");
		System.out.println("[메뉴선택]");
		System.out.println(this.sb);
		try {
			this.menu_num = sc.nextInt();
			if(this.menu_num == 1 || this.menu_num == 2 || this.menu_num == 3 || this.menu_num == 4) {
				this.box2();
			}
			else {
				System.out.println("1~4번 사이의 메뉴 숫자를 입력하세요.");
				this.box1();
			}
		}
		catch(Exception e){	
			System.out.println("1~4번 사이의 메뉴 숫자를 입력하세요.");
			this.sc.nextLine();
			this.box1();
		}
		return 0;
	}
	
	@Override
	public String box2() {
		System.out.println("해당 메뉴의 갯수를 입력하세요 : ");
		try {
			this.count = sc.nextInt();
			if(this.count <= 0) {
				System.out.println("1이상의 숫자를 입력하세요.");
				this.box2();
			}
		}
		catch(Exception e){
			System.out.println("1이상의 숫자를 입력하세요.");
			this.sc.nextLine();
			this.box2();
		}
		return null;
	}
	
	@Override
	public ArrayList<String> arr_method() {
		this.arr = new ArrayList<String>();
		int y=0;
		while(y < this.menus[0].length) {
			this.arr.add(this.menus[this.x][y]);
			y++;
		}
		return this.arr;
	}
	
	@Override
	public ArrayList<ArrayList<String>> all_method() {
		this.all = new ArrayList<ArrayList<String>>();
		this.x=0;
		while(x < this.menus.length){
			this.arr = arr_method();
			this.all.add(this.arr);
			x++;
		}
		return this.all;
	}
}
