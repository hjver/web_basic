package method;

//멀티 쓰레드 운영방법(extends 클래스)
public class th1 {
	public static void main(String[] args) {
		//단일 쓰레드 사용 방식
		//th1_box th = new th1_box();
		//th.aaa();  //aaa메소드 모두 실행 후 bbb실행(단일 쓰레드)
		//th.bbb();
		
		//멀티 쓰레드 사용 방식
		int w = 0;
		while(w <= 100) {
			mth1_box mb = new mth1_box(); 
			//먼저 끝난 값을 출력시키는 형태가 됩니다.
			mb.aaa(w);
			
			//Thread 클래스를 호출 후 run 메소드를 작동시킥 위하여 start()
			Thread th = new Thread(mb);
			th.start(); //run 메소드를 각각의 Thread로 실행시키기 위함
			
			//단일 쓰레드로 데이터를 출력시 무조건 순서대로 값이 출력
			//mb.bbb(w);
			w++;
		}
	}
}

//멀티 쓰레드
class mth1_box extends Thread{ //Thread 클래스를 상속 받음
	int no;
	
	public void aaa(int w) {
		this.no = w;
	}
	
	public void bbb(int w) {
		this.no = w;
		System.out.println(w);
	}
	
	@Override
	public void run() {  //멀티 쓰레드를 사용할 수 있도록 하는 메소드
		try {
			Thread.sleep(2000); //쓰레드를 일시 정지 시키는 메소드, 1000 = 1초
			System.out.println(this.no);
		}
		catch(Exception e) {
			System.out.println("Thread에 문제가 발생하였습니다.");
		}
	}
}

class th1_box{  //단일 쓰레드 형태 : 해당 메소드가 모두 실행 후 다음 메소드가 실행 형태
	public void aaa() {
		int w = 0;
		while(w <= 100) {
			System.out.println("a메소드:" + w);
			w++;
		}
	}
	
	public void bbb() {
		int w = 0;
		while(w <= 100) {
			System.out.println("b메소드:" + w);
			w++;
		}
	}		
}
