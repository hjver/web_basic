package method;
//ab_box2과 연계 (추상 클래스)
public class ab3 {

	public static void main(String[] args) {
		ab3_box ab = new ab3_box();
		ab.product();
	}

}

class ab3_box extends ab_box2{

	@Override
	public String product() {
		String date = this.today();
		System.out.println(date);
		return null;
	}
	@Override
	public void userbasket() {
		
	}
}