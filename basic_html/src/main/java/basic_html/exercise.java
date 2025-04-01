package basic_html;

public class exercise {

	public static void main(String[] args) {
		product_exec pe = new product_exec();
	}

}

class product_exec{
	datalist dl = null;
	
	public void product() {
		this.dl = new datalist();
		String[][] product = dl.product();
		System.out.println(product);
		exercise_DTO dto = new exercise_DTO();
	}
}
