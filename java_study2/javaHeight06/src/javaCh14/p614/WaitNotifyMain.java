package javaCh14.p614;

public class WaitNotifyMain {

	public static void main(String[] args) {
		WorkObject wO = new WorkObject();
		
		ThreadA tA = new ThreadA(wO);
		ThreadB tB = new ThreadB(wO);
		
		tA.start();
		tB.start();
		tB.setDaemon(true);
		tA.setDaemon(false);
	}

}
