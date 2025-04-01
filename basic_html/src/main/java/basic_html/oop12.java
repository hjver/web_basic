package basic_html;
//while + do~while
public class oop12 {
	public static void main(String[] args) {
		//new oop12_box().box1();  //while, do~while 사용법
		//new oop12_box().box2();  //무한루프(while)
		new oop12_box().box3();  //무한루프(do~while)
	}
}

class oop12_box{
	int w;
	
	public void box3() {
		this.w = 0;
		boolean ok = true;
		do {
			System.out.println(this.w);
			if(this.w >= 20) {
				ok = false;  //무한루프 정지
				//break;
			}
			this.w++;
		}while(ok);  //true를 이용하여 무한루프
	}
	
	public void box2() {
		this.w = 0;
		boolean ok = true;
		while(ok) { //true 무한 적용
			System.out.println(this.w);
			if(this.w == 20) { 
				ok = false;  //true와 false을 이용하며 무한, 정지
				//break;
			}
			this.w++;
		}
	}
	
	public void box1() {
		this.w = 0;  //시작값
		while(this.w <= 5) {  //범위값
			System.out.println(this.w);
			this.w++;  //증가, 감소
		}
		
		this.w = 0;
		do {
			System.out.println(this.w);
			this.w++;
		}while(this.w <= 5);
	}
}
