package ch06.sec08;

public class MethodOverloading {
	//�޼ҵ� �����ε��ؼ�
	//�Ű����� �ϳ��� ���簢��, �ΰ��� ���簢�� ���� ���ϱ�
	
	double areaRectangle(double width) {
		return width*width;
	}
	
	double areaRectangle(double width, double height) {
		return width*height;
	}

}
