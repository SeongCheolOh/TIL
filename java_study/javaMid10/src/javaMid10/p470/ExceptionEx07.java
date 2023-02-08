package javaMid10.p470;

public class ExceptionEx07 {

	public static void main(String[] args) {
		
		B b = new B();

			try {
				b.b1();
			} catch (ClassNotFoundException | ArithmeticException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}

	}

}
