package javaMid6.p395;

public class OutterAEx {

	public static void main(String[] args) {
		// InnerA클래스의 iaMethod()를 호출하기
		
		OutterA oa = new OutterA();//1. 바깥클래스 객체생성
		OutterA.InnerA oi = oa.new InnerA();//2. 바깥클래스 객체를 통해 내부클래스 객체 생성
		oi.iaMethod();

	}

}
