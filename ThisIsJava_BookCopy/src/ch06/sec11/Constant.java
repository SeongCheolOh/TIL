package ch06.sec11;

public class Constant {
	//상수 선언
	//원주율, 지구의 무게 및 둘레 등 불변의 값을 상수라고 한다
	//객체마다 저장할 필요가 없고, 단 하나의 값만 가지기 때문에
	//static이며 final성질을 가진다
	//모두 대문자로 작성하는것이 관례(여러 단어일 경우 _ 사용)
	
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	static {
		EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
	}
}
