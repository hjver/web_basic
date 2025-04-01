package basic_html;

import java.util.ArrayList;
//arr_dto와 연계
public class arr13 {

	public static void main(String[] args) {
		//2차 클래스 배열 (모든 회원 각각 정보를 배열로 담는 역할
		ArrayList<ArrayList<String>> alldata = new ArrayList<ArrayList<String>>();
		ArrayList<String> rdata = null; //1차 클래스 배열(각 개인 데이터를 DTO로 회신 받음)
		arr_dto ad = new arr_dto();
		
		ad.setName("홍길동");  //사용자명 setter
		ad.setEmail("hong@nate.com");  //이메일 setter
		rdata = ad.member();   //DTO에서 생성된 1차 클래스 배열값을 받음
		alldata.add(rdata);  //2차 클래스 배열로 배열을 추가
		
		ad.setName("유관순");
		ad.setEmail("yksoon@nate.com");
		rdata = ad.member();
		alldata.add(rdata);
		
		System.out.println(alldata);
	}

}
