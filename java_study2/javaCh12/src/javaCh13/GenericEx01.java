package javaCh13;

public class GenericEx01 {

	public static void main(String[] args) {
		// 13.1 제네릭이란?
		
		Box<String> box1 = new Box<String>();
		box1.content = "사과";
		box1.content = "100";// 그냥 100은 int타입이라 에러
		System.out.println(box1);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.content = 100;

	}
	
}
class Box<T>{
	public T content;
	
}