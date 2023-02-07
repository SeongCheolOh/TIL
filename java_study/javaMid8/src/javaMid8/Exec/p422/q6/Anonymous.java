package javaMid8.Exec.p422.q6;

public class Anonymous {
	
	String a = null;
	Vehicle field = new Vehicle() {
		
		@Override
		public void run() {
			a = "자전거";
			System.out.println(a + "(이)가 달립니다");	
		}
	};

	void method1() {
		Vehicle localVar = new Vehicle() {
			
			@Override
			public void run() {
				a = "승용차";
				System.out.println(a + "(이)가 달립니다");
			}
		};
	
		localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}
