package javaCh14.p600;

public class SynchronizedEx {

	public static void main(String[] args) {
		
		ThreadCalculator calculator = new ThreadCalculator();
		
		User1Thread u1 = new User1Thread();
		u1.setCalculator(calculator);
		u1.start();

		User2Thread u2 = new User2Thread();
		u2.setCalculator(calculator);
		u2.start();
	}

}
