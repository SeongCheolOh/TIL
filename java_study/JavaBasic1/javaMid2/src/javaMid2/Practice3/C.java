package javaMid2.Practice3;

public class C extends BB{
	
	public C() {
		super.maxNum = 200;
	}
	
	public void mul() {
		int maxNum = 20;
		long multiple = 1;
		for(int i=1; i<=maxNum; i++) {
			multiple = multiple * i;
		}
		System.out.println(multiple);
	}

}
