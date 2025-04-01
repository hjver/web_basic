package method;


//멀티 쓰레드 (interface)
public class th2 {
	public static void main(String[] args) {
		for(int f=0; f<10; f++) {
			//class Tread에서 객체를 선언하여 로드하는 방법
			//th2_box th = new th2_box(f);
			//Thread tr = new Thread(th);
			
			//interface로 Thread에서 객체를 설정하여 로드하는 방식
			Runnable ra = new th2_box(f);
			Thread tr = new Thread(ra);
			try {
				//tr.sleep(1000);
				tr.start();
			}catch (Exception e) {
				System.out.println("CPU 쓰레드 중 하나가 문제가 발생 하였습니다.");
			}
		}
	}
}

//Runnable : 멀티 쓰레드 interface를 사용하는 방법
class th2_box implements Runnable{
	int n = 0;
	public th2_box(int z) {
		this.n = z;
	}
	
	@Override
	public void run() {
		try {
			//Thread.sleep(1000);
			System.out.println(this.n);
		}catch (Exception e) {
			System.out.println("CPU 쓰레드 중 하나가 문제가 발생 하였습니다.");
		}
	}
}
