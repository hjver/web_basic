package basic_html;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		ex2_box eb = new ex2_box();
		//eb.exbox(); //finally 사용방법
		eb.exbox2();  //해당 오류 문제 발생시 문법에 대한 임시 조치 후 재실행
	}

}
//예외처리 처리방법
class ex2_box{
	//필드에는 try~catch를 사용하지 않음
	Scanner sc = null;
	
	public void exbox2() {
		//replace, replaceAll : 특정 단어를 다른단어로 변경하는 기능 가진 메소드
		//replaceAll은 정규식 코드 형태로 특정 단어의 범위를 설정하여 다른 단어로 변경하는 메소드
		String a = "500a0";
		String word = "abecdefgeABCDEFG";
		//String reword = word.replace("e", "홍");
		String reword = word.replaceAll("[a-dE-F]", "홍");
		System.out.println(reword);
		
		int b = 0;
		try {
			b = b + Integer.parseInt(a);
			
		}
		catch(NumberFormatException ne) {   
			//해당 예외처리 구분이 발생될 경우 임시조치 코드를 작성 후 정상적으로 작성되도록 함
			a = a.replaceAll("[a-zA-Z]", "");
			b = b + Integer.parseInt(a);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("최종 결과값 : " + b);
	}
	
	public void exbox() {
		this.sc = new Scanner(System.in);
		System.out.println("사용자 이름을 입력하세요 : ");
		
		try {
			String user = this.sc.next();
			if(user.equals("") || user.equals(null)) {
				System.out.println("사용자 미입력!!");
			}
			else {
				System.out.println("연락처를 입력하세요 단 '-' 없이 사용");
				Integer tel = this.sc.nextInt();
				System.out.println(tel);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {  //finally는 try와 catch 실행시 무조건 실행되는 프로세스를 마치는 메소드
			this.sc.close();
			System.out.println("finally는 무조건 작동하는 메소드");
		}
	}
}