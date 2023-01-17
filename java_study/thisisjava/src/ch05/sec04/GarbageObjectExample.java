package ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null; // "여행"에 해당하는 String 객체를 쓰레기로 만듦
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null;
		
		//kind1을 "자동차"에서 받고
		//kind2를 kind1("자동차")에서 받았기 때문에
		//마지막으로 kind1 = null을 선언해도 "자동차"는 쓰레기 객체가 되지 않는다
		
		System.out.println("kind2 = " + kind2);
			

	}

}
