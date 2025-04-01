package method;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//추상 클래스 생성 (ab3.java와 연계)
public abstract class ab_box2 {
	//추상 클래스에 사용된 일반 return 메소드
	public String today() {
		//local Pc의 시간을 출력하는 라이브러리
		Date day = new Date();
		//yyyy : 년도, MM : 월, dd: 일
		//HH(hh) : 시간 => HH(24기준), hh(12), mm(분), ss(초), a : AM,PM
		//SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		//SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sf2 = new SimpleDateFormat("E", Locale.ENGLISH); //E : 요일
		//Locale : 언어셋을 변경할 때 사용하는 라이브러리
		//System.out.println(sf.format(day));
		//System.out.println(sf2.format(day));
		
		return sf.format(day);
	}
	//추상 클래스에 사용된 추상 return 메소드, 단 {} 사용안함
	//abstract 메소드는 상속 받을 경우 무조건 override 해야하는 메소드
	public abstract String product();
	public void basket() {
		
	}
	public abstract void userbasket();
}
