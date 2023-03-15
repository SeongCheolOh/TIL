package ch05.sec04;

public class GarbageObjectEx {

	public static void main(String[] args) {
		// 어떤 변수에서도 참조하지 않는 객체가 생성되면
		// 자바는 이 객체를 쓰레기로 취급하고
		// 자동으로 쓰레기 수집기를 실행, 데이터를 제거 한다.
		
		String hobby = "여행";
		hobby = null; // "여행"은 쓰레기 객체가 됨
		
		String car1 = "자동차";
		String car2 = car1;
		car1 = null;//car1에 해당하는 "자동차" 객체는 연결이 끊어졌지만
		//car2는 여전히 "자동차"를 참조하고 있기 때문에 쓰레기 취급하지 않는다

	}

}
