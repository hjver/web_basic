package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

//io 응용편 - 강사님 코드
public class file12_1 {
	public static void main(String[] args) {
		file12_box fb = new file12_box();
	}
}

class file12_box {
	final String data[][] = {
			{"1.아이스커피", "2000"},
			{"2.아메리카노", "3500"},
			{"3.카라멜 마키야또", "4000"}
	};
	Scanner sc = null;
	FileWriter fw = null;
	int menu;  //변수만 선언
	
	public file12_box() {
		this.sc = new Scanner(System.in);
		this.menulist();
	}
	
	private void menulist() {  //메뉴 리스트 출력 및 메뉴를 선택
		String menus = "";  //사용자에게 메뉴를 보여주는 형태
		for(int f=0; f<this.data.length; f++) {
			menus += this.data[f][0] + " ";
		}
		System.out.printf("메뉴를 고르세요 [%s] : ", menus);
		try {
			this.menu = this.sc.nextInt();
			if(this.menu > 0 && this.menu < 4) {
				String result = this.receipt();
				if(result == "ok") {
					System.out.println("정상적으로 주문이 완료되었습니다.");
				}
				else {
					System.out.println("서비스 장애로 다시 주문을 부탁 드립니다.");
					this.menulist();
				}
			}
			else {
				System.out.println("1~3번까지의 메뉴를 선택하셔야 합니다.");
				this.menulist();
			}
		}
		catch (Exception e) {  //메뉴 선택에 대한 숫자외에 다른 문자를 입력시
			System.out.printf("%s를 입력하셨습니다. 1~3번까지의 숫자를 입력하세요.%n", this.sc.nextLine());
			this.menulist();
		}
		finally {
			this.sc.close();
		}
	}
	
	//파일에 사용자가 선택한 메뉴관련 정보를 저장하는 메소드
	private String receipt() {
		String call = "no";  //해당 데이터를 올바르게 진행 결과를 return 변수
		String url = "D:\\site\\basic_html\\src\\main\\java\\io\\order.txt";
		try {  //정상적으로 해당 파일에 데이터가 저장 되었을 경우
			File f = new File(url);
			boolean check = f.createNewFile();  //파일신규(true), 같은파일 있을 경우(false)
			//System.out.println("신규생성인가요? : " + check);
			this.fw = new FileWriter(f);  //해당 경로에 파일에 데이터를 쓰기
			this.fw.write("신청하신 메뉴 : " + this.data[this.menu-1][0] + "\n");
			this.fw.write("결제금액 : " + this.data[this.menu-1][1] + "원");
			
			call = "ok";		
		}
		catch(Exception e) {
			System.out.println("해당 파일을 로드하지 못하였습니다.");
		}
		finally {  //IO를 종료하는 파트
			try {
				this.fw.close();  //FileWriter를 종료
			}
			catch(Exception e) {
				System.out.println("해당 파일을 정상적으로 종료하지 못하였습니다.");
			}
		}
		
		return call;
	}
	
}
