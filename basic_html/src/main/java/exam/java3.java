package exam;

import java.util.Scanner;

public class java3 {
	public static void main(String[] args) {
		new java3_box().mycode();
	}
}

class java3_box{
	String dictionary[][] = {
			{"수박", "watermelon"},
			{"키위", "kiwi"},
			{"포도", "grape"},
			{"딸기", "strawberry"}
	};
	Scanner sc = null;
	String word = null;
	int k;
	boolean is_exist = false;
	
	public void mycode() {
		this.sc = new Scanner(System.in);
		System.out.println("과일 이름을 한글로 입력하세요 : ");
		this.word = this.sc.nextLine();
		if(this.word.equals("")) {
			System.out.println("아무것도 입력하지 않았습니다.");
			this.mycode();
		}
		for(this.k=0; this.k<dictionary.length; this.k++) {
			if(this.word.equals(dictionary[k][0])) {
				System.out.println("영어 : " + dictionary[k][1]);
				this.is_exist = true;
				break;
			}
		}
		if(!is_exist) {
			System.out.println("해당되는 단어는 없습니다.");
		}
		this.sc.close();
		System.exit(0);
	}
}
