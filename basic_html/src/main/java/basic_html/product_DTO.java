package basic_html;

import java.util.ArrayList;

//DTO(Data Transfer Object) => setter, getter => Data를 class배열로 변환 및 java에서 값을 이관,회신
//VO(Value Object) => getter만 있음
public class product_DTO {
	String product_nm, sales_use, money, sales_money, discount, like;
	ArrayList<String> datamake = null;
	ArrayList<ArrayList<String>> alldata = new ArrayList<ArrayList<String>>();
	
	//2차 배열을 생성하는 return 메소드
	public ArrayList<ArrayList<String>> alldata(){
		return this.alldata;
	}
	
	//1차배열을 생성하는 return 메소드
	public ArrayList<String> datamake(){
		this.datamake = new ArrayList<String>();
		//getter 메소드를 1차 클래스 배열에 데이터 추가
		this.datamake.add(getProduct_nm());
		this.datamake.add(getSales_use());
		this.datamake.add(getMoney());
		this.datamake.add(getDiscount());
		this.datamake.add(getSales_money());
		this.datamake.add(getLike());
		return this.datamake;
	}
	
	public product_DTO(String result[][]) {
		ArrayList<String> pd = null;
		int w = 0;
		while(w < result.length) {  //원시배열 그룹 갯수 만큼 반복문을 적용
			//원시배열 배열을 각 파트에 맞는 setter 메소드에 값을 전달
			this.setProduct_nm(result[w][0]);
			this.setSales_use(result[w][1]);
			this.setMoney(result[w][2]);
			this.setDiscount(result[w][3]);
			this.setSales_money(result[w][4]);
			this.setLike(result[w][5]);
			pd = this.datamake();  //1차 클래스 배열을 로드하여 getter를 활성화 및 클래스
			this.alldata.add(pd);  //1차 클래스 배열로 생성된 값을 2차 클래스 배열로 데이터
			w++;
		}
	}

	public String getProduct_nm() { //getter (데이터 보내는 역할)
		return product_nm;
	}

	public void setProduct_nm(String product_nm) { //setter (데이터 받는 역할)
		this.product_nm = product_nm;
	}

	public String getSales_use() {
		return sales_use;
	}

	public void setSales_use(String sales_use) {
		this.sales_use = sales_use;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getSales_money() {
		return sales_money;
	}

	public void setSales_money(String sales_money) {
		this.sales_money = sales_money;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getLike() {
		return like;
	}

	public void setLike(String like) {
		this.like = like;
	}
}
