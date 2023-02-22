package javaMid2.Practice3;

public class BB {

	int sum;
	int maxNum;
	
	public void sum() {
		for(int i=0; i<=maxNum; i++) {
			 sum += i;
		}
		System.out.println(sum);
	}
	
	public void dif() {
		System.out.println(sum-maxNum);
	}

}
