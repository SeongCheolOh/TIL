package javaMid8.Exec.p422.q6;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(new Vehicle() {
			
			@Override
			public void run() {
				anony.a = "트럭";
				System.out.println(anony.a + "(이)가 달립니다");
				
			}
		}
		);

	}

}
