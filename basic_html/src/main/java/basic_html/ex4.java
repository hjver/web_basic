package basic_html;

public class ex4 {

	public static void main(String[] args) {
		ex4_box eb = new ex4_box();
		
		try {
			eb.abc(100, "30 0");
		}
		catch(Exception e) {
			System.out.println("A 개발자 코드");
			System.out.println(e);
			try {
				eb.abc(500, "600");
			}
			catch(Exception e2) {
				System.out.println(e2);
			}		
		}
		
		//B개발자 쪽에서 문제가 발생시 확인하는 방법
		
		try {
			eb.bbb("5500"); //인자값으로 bbb 메소드를 호출 값을 전송
		}
		catch(Exception e3) {
			//System.out.println(e3);
			e3.printStackTrace();
		}
	}
}
/* 
 * throws, throw : 외부 클래스에 있는 메소드를 호출 또는 전송, 회신 등 데이터 이관을 할 경우
 * 문제점에 대한 정보를 서로 공유할 수 있도록 처리하는 메소드입니다.
 */
class ex4_box{
	
	public void bbb(String a) throws Exception{
		int k = Integer.valueOf(a) + Integer.valueOf("200a");
		System.out.println(k);
		//throw는 예외처리가 발생하면, 상대방에게 에러 코드를 전송하며, 재전송을 요청 할 수 있음
		//Exception ep = new Exception(); //Exception 라이브러리 (예외처리)
		//throw : return과 비슷한 성격을 가짐 단, 해당 throw는 메소드 기준으로 맨 아래에 작성
		//throw ep;
		
	}
	
	/* throws Exception : 메소스에 적용하며, 
	 * 해당 메소드를 호출 시 무조건 예외처리 기준방침을 적용 후 호출을 해야 합니다.
	 */
	public void abc(int no, String z) throws Exception {
		int sum = no + Integer.parseInt(z);
		System.out.println(sum);
	}
}