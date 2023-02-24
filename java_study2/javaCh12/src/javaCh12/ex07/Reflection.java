package javaCh12.ex07;

public class Reflection {

	public static void main(String[] args) {
		// p.547 reflection
		//메타 정보
		
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
		
		//리소스 - 이미지, 환경설정에 관련 파일들
		Class clazz = Reflection.class; //Car클래스의 메타정보를 얻는다.
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