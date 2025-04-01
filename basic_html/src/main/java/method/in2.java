package method;

import java.util.Arrays;

public class in2 {
	public static void main(String[] args) {
		in2_box bx = new in2_box();
		bx.money();
	}
}

/*
class in2_box implements inter2{
	@Override
	public void money() {
		System.out.println(Arrays.toString(this.data));
	}
}
*/

/*
//추가오 interface를 적용한 사항을 class에 상속시켜서 작동하는 방법
class in2_box implements inter2_2{
	@Override
	public void money() {
		System.out.println(Arrays.toString(this.data));
	}
	
	@Override
	public void point() {
		
	}
}
*/

/*
 * implements : 여러개의 interface를 로드할 수 있습니다.
 * extends : 하나의 가상 class 또는 interface만 로드할수 있음
 */
class in2_box implements inter2, inter1 {
	@Override
	public void money() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Integer levels() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String names() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void search() {
		// TODO Auto-generated method stub
		
	}
}
