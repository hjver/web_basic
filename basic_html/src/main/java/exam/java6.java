package exam;

import java.util.Scanner;

public class java6 {

	public static void main(String[] args) {
		String userdata[][] = {
				{"마동석", "01053514423"},
				{"김무열", "01023103637"},
				{"이동휘", "01055317889"},
				{"박지환", "01069882901"},
				{"이주빈", "01095849004"}
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("고객명을 입력하세요 : ");
		String nm = sc.nextLine();
		boolean is_exist = false;
		for(String[] user : userdata) {
			if(nm.equals(user[0])) {
				System.out.println(nm + "님 연락처 " + user[1] + " 입니다.");
				is_exist = true;
				break;
			}
		}
		if(!is_exist) {
			System.out.println("해당 고객은 가입되지 않았습니다.");
		}
		sc.close();
	}
}
