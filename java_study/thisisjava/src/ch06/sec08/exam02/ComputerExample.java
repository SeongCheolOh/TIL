package ch06.sec08.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer com = new Computer();
		
		//sum() 메소드 호출 시 매개값 1,2,3을 제공하고
		//합산 결과를 리턴받아 result1 변수에 대입
		int result1 = com.sum(1,2,3);
		System.out.println(result1);
		
		//sum() 메소드 호출 시 매개값 1,2,3,4,5을 제공하고
		//합산 결과를 리턴받아 result2 변수에 대입
		int result2 = com.sum(1,2,3,4,5);
		System.out.println(result2);
		
		//sum() 메소드 호출 시 배열을 제공하고
		//합산 결과를 리턴받아 result3 변수에 대입
		int[]values = {1,2,3,4,5};
		int result3 = com.sum(values);
		System.out.println(result3);
		
		//sum() 메소드 호출 시 배열을 제공하고
		//합산 결과를 리턴받아 result4 변수에 대입
		int result4 = com.sum(new int[] {1,2,3,4,5});
		System.out.println(result3);
	}

}
