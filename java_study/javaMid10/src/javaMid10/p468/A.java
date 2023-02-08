package javaMid10.p468;

public class A {
	public void a1() throws ArithmeticException, ArrayIndexOutOfBoundsException, ClassNotFoundException{
		a2();
		Class.forName("java.lang.String");
	}
	void a2()throws ArithmeticException, ArrayIndexOutOfBoundsException{
		a3();
		int[]num = {1,2,3};
		System.out.println(num[5]);
	}
	void a3() throws ArithmeticException{
			int a = 10 /0 ;
		}
		
}
