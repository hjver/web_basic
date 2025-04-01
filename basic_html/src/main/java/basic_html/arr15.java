package basic_html;

import java.util.ArrayList;
import java.util.Scanner;

/* 
 * 상품출력 파트 java 코드 : 원시배열 => Controller에서 DTO 원시배열 전달 => DTO =>
 * 클래스 배열로 변화 => Controller 출력
 */
public class arr15 {

	public static void main(String[] args) {
		Controller_arr15 ca = new Controller_arr15();
		ca.product_list();
	}
}
// 응용문제 : 해당 프로세스에 검색 단어를 입력하면 해당 상품 정보가 출력되도록 코드를 수정하시오.
class Controller_arr15{
	//해당 외부 클래스를 인스턴스를 객체화하여 필드에 적용시킴
	datalist dl = new datalist();
	//DTO를 로드
	product_DTO dto = null;
	
	//상품 데이터
	ArrayList<ArrayList<String>> pdlist = null;
	Scanner sc = null;
	public void product_list() {
		String result[][] = this.dl.product();
		this.dto = new product_DTO(result);
		//dto에서 2차 클래스배열 return값을 받아서 Controller에서 객체처리 및 출력
		this.pdlist = this.dto.alldata();
		
		//검색어를 통하여 해당 상품 데이터를 출력하는 기능 추가
		this.sc = new Scanner(System.in);
		System.out.println("검색할 단어를 입력하세요 : ");
		String word = this.sc.nextLine(); //사용자가 입력한 검색어
		int x = 0 ;
		int count = 0; //해당 검색단어 맞는 상품 갯수를 체크
		while(x < this.pdlist.size()) {
			if(this.pdlist.get(x).get(0).indexOf(word) != -1) {
				System.out.println(pdlist.get(x));
				count++;
			}
			x++;
		}
		if(count == 0) {
			System.out.println("해당 검색어에 맞는 상품은 없습니다.");
		}
		this.sc.close();
	}
}