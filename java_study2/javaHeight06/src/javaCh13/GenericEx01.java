package javaCh13;

public class GenericEx01 {

	public static void main(String[] args) {
		// 13.1 ���׸��̶�?
		
		Box<String> box1 = new Box<String>();
		box1.content = "���";
		box1.content = "100";// �׳� 100�� intŸ���̶� ����
		System.out.println(box1);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.content = 100;

	}
	
}
class Box<T>{
	public T content;
	
}