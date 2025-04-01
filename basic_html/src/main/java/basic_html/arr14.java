package basic_html;

import java.util.ArrayList;
import java.util.Scanner;

//arr_dto와 연계
public class arr14 {

	public static void main(String[] args) {
		/*
		 * 응용편
		 * 사용자를 추가하는 회원가입 시스템을 제작해야 합니다.
		 * 다음과 같이 진행되도록 코드를 작성합니다
		 * 
		 * (지속적 반복)
		 * 메뉴 : 1. 회원추가, 2. 회원리스트 출력, 3. 시스템 종료 :
		 * 
		 * 1. 회원추가를 추가시
		 * "아이디를 입력하세요 : "
		 * "고객명를 입력하세요 : "
		 * "패스워드를 입력하세요 : "
		 * "이메일를 입력하세요 : "
		 * 
		 * 2. 회원리스트 출력 선택시
		 * 등록된 회원 데이터가 콘솔로 추력되어야 합니다.
		 * 
		 * 3. 시스템 종료를 선택시
		 * system.exit(0) 로 프로그램을 종료 완료하시면 되겠습니다.
		 */

		arr14_box ab = new arr14_box();
		ab.menu_handling();
	}
}

class arr14_box{
	ArrayList<ArrayList<String>> alldata = new ArrayList<ArrayList<String>>();
	Scanner sc = null;
	arr_dto dto = null;
	
	public void menu_handling() {
		this.dto = new arr_dto();
		this.sc = new Scanner(System.in);
		System.out.println("1. 회원추가, 2. 회원리스트 출력, 3. 시스템 종료 : ");
		int no = this.sc.nextInt();
		if(no == 1) {
			System.out.println("아이디를 입력하세요 : ");
			this.dto.setId(this.sc.next());
			System.out.println("고객명을 입력하세요 : ");
			this.dto.setName(this.sc.next());
			System.out.println("패스워드를 입력하세요 : ");
			this.dto.setPasswd(this.sc.next());
			System.out.println("이메일을 입력하세요 : ");
			this.dto.setEmail(this.sc.next());
			this.alldata.add(this.dto.member());	
			menu_handling();
		}
		else if(no == 2) {
			System.out.println(this.alldata);
			menu_handling();
		}
		else {
			System.out.println("시스템을 종료합니다.");
			System.exit(0);
		}
		
	}
}



