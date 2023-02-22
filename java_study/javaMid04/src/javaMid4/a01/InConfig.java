package javaMid4.a01;

public interface InConfig {
	//추상메소드
	void i1();
	
	//상수
	static final double PI = 3.14;
	static final boolean OK = true;
	static final int COM_PRICE = 2000000;
	static final int PRNT_PRICE = 500000;
	
	//디폴트에다 메소드를 쓰는 것
	default void di1() {}
	default int dd1() {return 0;}
	
	//정적 메소드
	static void sd() {}
	private void a() {}
}
