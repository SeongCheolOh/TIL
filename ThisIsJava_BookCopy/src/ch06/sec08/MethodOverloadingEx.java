package ch06.sec08;

public class MethodOverloadingEx {

	public static void main(String[] args) {
		// p.241
		
		MethodOverloading m1 = new MethodOverloading();
		//매개값을 1개, 2개로 다르게 주어
		//정사각형과 직사각형의 넓이를 각각 구해보자
		System.out.println(m1.areaRectangle(4));
		System.out.println(m1.areaRectangle(7, 4));

	}

}
