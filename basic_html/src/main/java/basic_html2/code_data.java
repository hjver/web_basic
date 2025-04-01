package basic_html2;

public class code_data {
	public int no = 50;   //public은 다른 패키지, 다른 클래스 접근가능
	private int no2 = 100;  //private은 해당 class에서만 변경 및 접근가능
	protected int no3 = 150;  //protected 같은 패키지에서 변경 및 접근가능
	
	public void abc() {  //외부에서 호출에서 실행 가능
		System.out.println(this.no);
		System.out.println(this.no2);
		System.out.println(this.no3);
		this.bbb();
	}
	private void bbb() {  //해당 클래스에서만 실행하는 메소드
		System.out.println(this.no);
	}
	protected void ccc() {  //같은 패키지일 경우 호출하여 실행가능
		System.out.println(this.no);
	}
}
