package ch06.sec10;

public class StaticMemberEx {

	public static void main(String[] args) {
		// p.247
		
		//정적멤버 호출
		double result1 = 10*10*StaticMember.pi;
		int result2 = StaticMember.plus(10, 5);
		int result3 = StaticMember.minus(10, 5);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}
