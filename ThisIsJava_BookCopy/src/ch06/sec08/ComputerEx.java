package ch06.sec08;

public class ComputerEx {

	public static void main(String[] args) {
		//p.235
		//Computer 객체 생성
		Computer c1 = new Computer();
		//sum()메소드 호출 시 매개값 1,2,3 을 주고 변수에 대입
		int result1 = c1.sum(1,2,3);
		System.out.println(result1);
		//다른 변수에 매개값 1,2,3,4,5 대입
		int result2 = c1.sum(1,2,3,4,5);
		System.out.println(result2);
		//sum()메소드 호출 시 배열을 제공하고
		//합산 결과를 리턴받아 result3 변수에 대입
		int[] values = {1,2,3,4,5};
		int result3 = c1.sum(values);
		System.out.println(result3);
		//sum()메소드 호출 시 배열을 제공하고
		//합산 결과를 리턴받아 result4 변수에 대입
		int result4 = c1.sum(new int[] {1,2,3,4,5});
		System.out.println(result4);

	}

}
