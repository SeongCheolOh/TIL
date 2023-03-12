package javaCh14.p600;

public class User2Thread extends Thread{

	private ThreadCalculator calculator;
	
	public User2Thread() {
		setName("User2Thread");
	}
	
	public void setCalculator(ThreadCalculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(50);
	}
}
