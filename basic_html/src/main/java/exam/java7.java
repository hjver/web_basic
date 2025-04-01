package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class java7 {
	public static void main(String[] args) {
		String products[] = {"스마트워치","카메라","킥보드","노트북","프린터","세탁기","무선청소기","냉장고","안마기","공기청정기"};
		ArrayList<String> products2 = new ArrayList<String>(Arrays.asList(products));
		
		Scanner sc = new Scanner(System.in);
		System.out.println(products2 + " 삭제하실 상품명을 입력하세요 : ");
		String prod = sc.nextLine();
		products2.remove(prod);
		System.out.println(products2);
		sc.close();
	}
}
