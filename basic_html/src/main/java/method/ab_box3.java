package method;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

//ab4 연계
public abstract class ab_box3 {
	Integer total = 0; //잔액을 설정하는 변수
	final String menus[] = {"1.신한", "2.농협", "3.국민", "4.하나"}; //각 은행별 메뉴
	Scanner sc = new Scanner(System.in);
	ArrayList<ArrayList<String>> banks = null; //2차
	ArrayList<String> acc = null;  //1차
	
	public String today() {  //일자
		Date day = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sf.format(day);
	}
	public abstract String deposit(int money); //입금 메소드
	public abstract String drawal(int money); //출금 메소드
}
