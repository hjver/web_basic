package io;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

//io 응용편
/*
 * 키오스크에서 오더 받은 내용을 다음과 같이 정리 하여 order.txt로 저장되도록 합니다.
 * 
 * [결과]
 * 메뉴를 고르세요 [1.아이스커피, 2.아메리카노 3.카라멜 마키야또] :
 * 아이스커피 : 2000
 * 아메리카노 : 3500
 * 카라멜 마끼야또 : 4000
 * 
 * [order.txt에 다음 내용이 저장되도록 합니다.
 * 신청하신 내용 : 아메리카노
 * 결제금액 : 3500
 */
public class file12 {
	public static void main(String[] args) {
		String menus[][] = {
				{"아이스커피", "아메리카노", "카라멜 마끼야또"},
				{"2000", "3500", "4000"}
		};
		ArrayList<ArrayList<String>> all = new ArrayList<ArrayList<String>>();
		int x, y;
		for(x=0; x<menus.length; x++) {
			ArrayList<String> al = new ArrayList<String>();
			for(y=0; y<menus[0].length; y++) {
				al.add(menus[x][y]);
			}
			all.add(al);
		}
		
		files12_box fb = new files12_box(all);
	}
}

class files12_box{
	ArrayList<ArrayList<String>> all = null;
	Scanner sc = null;
	StringBuilder sb = null;
	int menu_no = 0;
	String ori = "D:\\site\\basic_html\\src\\main\\java\\io\\order.txt";
	File f = null;
	FileWriter fw = null;
	
	public files12_box(ArrayList<ArrayList<String>> all) {
		this.all = all;
		this.select_menu();
		this.ouput_file();
	}
	
	public void select_menu() {
		this.sb = new StringBuilder();
		this.sb.append("메뉴를 고르세요 [");
		for(int k=0; k<this.all.get(0).size(); k++) {
			this.sb.append(k+1 + ". " + this.all.get(0).get(k) + " ");
		}
		this.sb.append("]" + "\n");
		for(int k=0; k<this.all.get(0).size(); k++) {
			this.sb.append(all.get(0).get(k) + " : " + this.all.get(1).get(k) + "\n");
		}		
		System.out.println(sb);
		try {
			this.sc = new Scanner(System.in);
			this.menu_no = this.sc.nextInt();
			if(this.menu_no < 1 || this.menu_no > 3) {
				System.out.println("메뉴 선택을 잘못하셨습니다.");
				this.select_menu();
			}
		}
		catch(Exception e) {
			System.out.println("메뉴 선택을 잘못하셨습니다.");
			this.sc.nextLine();
			this.select_menu();
		}
		this.sc.close();
	}
	
	public void ouput_file() {
		try {
			this.f = new File(this.ori);
			this.f.createNewFile(); 
			this.fw = new FileWriter(this.f);
			this.fw.write("신청하신 내용 : " + all.get(0).get(menu_no-1) + "\n");
			this.fw.write("결제금액 : " + all.get(1).get(menu_no-1));
			this.fw.close();
		}
		catch(Exception e) {
			System.out.println("경로 또는 파일에 문제가 있습니다.");
		}	
	}
}
