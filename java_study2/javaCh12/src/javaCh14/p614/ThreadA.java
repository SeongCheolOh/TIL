package javaCh14.p614;

public class ThreadA extends Thread{
	
	private WorkObject workObjectA;
	
	public ThreadA( WorkObject workobjectA) {
		this.workObjectA = workObjectA;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			workObjectA.methodA();
		}
		
	}
}
