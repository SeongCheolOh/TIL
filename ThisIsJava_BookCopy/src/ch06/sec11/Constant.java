package ch06.sec11;

public class Constant {
	//��� ����
	//������, ������ ���� �� �ѷ� �� �Һ��� ���� ������ �Ѵ�
	//��ü���� ������ �ʿ䰡 ����, �� �ϳ��� ���� ������ ������
	//static�̸� final������ ������
	//��� �빮�ڷ� �ۼ��ϴ°��� ����(���� �ܾ��� ��� _ ���)
	
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	static {
		EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
	}
}
