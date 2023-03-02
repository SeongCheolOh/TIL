package javaCh14.p614;

public class WorkObject {
	//p.614 wait() + notify()를 이용한 스레드 제어
	
	public synchronized void methodA() {
		System.out.println("ThreadA methodA() 작업 실행");
		notify(); //실행하기
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB methodB() 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
