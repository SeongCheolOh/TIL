package javaCh14.p614;

public class ThreadB extends Thread{
	
	private WorkObject workObjectB;
	
	public ThreadB( WorkObject workobjectB) {
		this.workObjectB = workObjectB;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			workObjectB.methodB();
		}
		
	}
}
