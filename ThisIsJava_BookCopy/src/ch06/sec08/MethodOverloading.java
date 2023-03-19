package ch06.sec08;

public class MethodOverloading {
	//메소드 오버로딩해서
	//매개값이 하나면 정사각형, 두개면 직사각형 넓이 구하기
	
	double areaRectangle(double width) {
		return width*width;
	}
	
	double areaRectangle(double width, double height) {
		return width*height;
	}

}
