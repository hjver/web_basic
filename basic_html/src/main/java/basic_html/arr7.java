
package basic_html;

import java.util.Scanner;

/* 응용문제 외부 클래스를 이용하여 다음과 같이 결과가 나오도록 코드를 작성하시오.
 * [출력예시]
 * LG냉장고
 * 500000
 * 5% : 475000
 * LG 에어콘
 * 1900000
 * 10% : 1710000
 * 삼성 에어콘
 * 1250000
 * 10% : 11250000
 */
/*응용문제 외부 메소드를 이용하여 다음과 같이 결과가 나오도록 코드를 작성하시오.
 * 메뉴 : 1.고객명, 2. 레벨 검색
 * 고객명을 입력하세요 : 유관순
 * 유관순
 * 골드
 * 3000
 * 20
 * 레벨을 입력하세요 : 일반
 * 홍길동
 * 일반
 * 1500
 * 5
 * 이산
 * 일반
 * 1200
 * 5
 */
public class arr7 {

	public static void main(String[] args) {
		final String product[][] = {
				{"LG냉장고", "삼성 가습기", "LG 에어콘", "삼성 에어콘", "코엑 정수가"},
				{"500000", "300000", "1900000", "1250000", "220000"},
				{"Y", "N", "Y", "Y", "N"},
				{"5", "15", "10", "10", "5"}
		};

		final String userpart[][][] = {
				{
					{"홍길동", "강감찬", "유관순", "이순신", "이산"},
					{"일반", "실버", "골드", "실버", "일반"}
				},
				{
					{"1500", "2500", "3000", "1000", "1200"},
					{"5", "10", "20", "10","5"}
				}
		};
		
		arr7_box ab = new arr7_box();
		//ab.view(product);

		ab.view2(userpart);
		ab.sc.close();
	}

}

//length() : 데이터의 단어 갯수, 무조건 문자만 사용 가능
//length : 구룹 수, 데이터 수 등 배열의 원소 수

class arr7_box{
	
	Scanner sc = null;
	String name;
	String level;
	public void view2(String userpart[][][]) {
		int k;
		this.sc = new Scanner(System.in);
		System.out.println("메뉴 : [1.고객명, 2. 레벨] : ");
		String menu = this.sc.next();
		if(menu.equals("1")) {
			System.out.println("고객명을 입력하세요 : ");
			this.name = this.sc.next();
			for(k=0; k<userpart[0][0].length; k++) {
				if(userpart[0][0][k].equals(this.name)) {
					System.out.println("고객명 : " + userpart[0][0][k]);
					System.out.println("레벨 : " + userpart[0][1][k]);
					System.out.println("포인트 : " + userpart[1][0][k]);
					System.out.println("할인율 : " + userpart[1][1][k]);
				}
			}		
		}
		else if(menu.equals("2")) {
			System.out.println("레벨을 입력하세요 : ");
			this.level = this.sc.next();
			for(k=0; k<userpart[0][0].length; k++) {
				if(userpart[0][1][k].equals(this.level)) {
					System.out.println("고객명 : " + userpart[0][0][k]);
					System.out.println("레벨 : " + userpart[0][1][k]);
					System.out.println("포인트 : " + userpart[1][0][k]);
					System.out.println("할인율 : " + userpart[1][1][k]);
				}
			}				
		}
		else {
			System.out.println("메뉴 번호를 잘못 입력 하셧습니다.");
			view2(userpart);
		}
	}
	
	public void view(String product[][]) {
		int z;
		int pay=0;
		for(z=0; z<product[2].length; z++) {
			if(product[2][z] == "Y") {
				pay = Integer.parseInt(product[1][z]) - (Integer.parseInt(product[1][z]) * Integer.parseInt(product[3][z])) /100;
				System.out.println(product[0][z]);
				System.out.println(product[1][z]);
				System.out.println(product[3][z] + "% : " + pay);
			}
		}
	}
}
