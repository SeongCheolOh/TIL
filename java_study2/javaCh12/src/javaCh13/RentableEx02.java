package javaCh13;

public class RentableEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//generic도 상속을 받기 때문에
//최소한 부모의 generic은 그대로 받아와야하고, 자식클래스에서 추가도 할 수 있다
class A<I>{
	
}

class AA<I,J> extends A<I>{
	
}

class AAA<I,J> extends AA<I,J>{
	
}