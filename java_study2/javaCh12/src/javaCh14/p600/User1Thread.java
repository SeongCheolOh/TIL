package javaCh14.p600;

public class User1Thread extends Thread{

	private ThreadCalculator calculator;
	
	public User1Thread() {
		setName("User1Thread");
	}
	
	public void setCalculator(ThreadCalculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(100);
	}
}
