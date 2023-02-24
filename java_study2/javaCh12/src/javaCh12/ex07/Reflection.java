package javaCh12.ex07;

public class Reflection {

	public static void main(String[] args) {
		// p.547 reflection
		//��Ÿ ����
		
		Class c1 = Car.class;
		System.out.println(c1);
		
		Class c2;
		try {
			c2 = Class.forName("javaCh12.ex07.Car");
			System.out.println(c2.getDeclaredConstructors());
			System.out.println(c2.getDeclaredField("color"));
		}catch(ClassNotFoundException | NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		
		//���ҽ� - �̹���, ȯ�漳���� ���� ���ϵ�
		Class clazz = Reflection.class; //CarŬ������ ��Ÿ������ ��´�.
		String photo1path = clazz.getResource("2.png").getPath();
		String photo2path = clazz.getResource("image/2.png").getPath();
		System.out.println(photo1path);
		System.out.println(photo2path);
				
	}

}
class Car{
	private String color;
	public Car(String color) {
		this.color = color;
		
	}
}