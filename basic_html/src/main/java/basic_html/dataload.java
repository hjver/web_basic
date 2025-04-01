package basic_html;

//Model
public class dataload {

	int a, b, c, d;
	int sum;
	
	public dataload(int a, int b, int c, int d) {  //Setter
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public int calc(char o) {
		int result = 0;
		if(o == '+') {
			result = this.a + this.b + this.c + this.d;
		}
		else if(o == '*') {
			result = this.a * this.b * this.c * this.d;		
		}
		return result;
	}
	
	public int odd() {
		sum = 0;
		if(this.a % 2 != 0) {
			sum += this.a;
		}
		if(this.b % 2 != 0) {
			sum += this.b;
		}
		if(this.c % 2 != 0) {
			sum += this.c;
		}
		if(this.d % 2 != 0) {
			sum += this.d;
		}
		return sum;
	}
	
	public int even() {
		sum = 0;
		if(this.a % 2 == 0) {
			sum += this.a;
		}
		if(this.b % 2 == 0) {
			sum += this.b;
		}
		if(this.c % 2 == 0) {
			sum += this.c;
		}
		if(this.d % 2 == 0) {
			sum += this.d;
		}
		return sum;
	}
}
