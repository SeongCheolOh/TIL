package javaMid2.p293;

public class HeriEx01 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.setFood("먹는 것 입력");
		animal.setSound("동물의 소리 입력");
		animal.printAll();//출력
		
		Dog dog = new Dog();
		dog.setFood("강아지 사료");
		dog.setSound("멍멍");
		dog.setCharacteristic("주인을 잘 따른다");
	//	dog.all();
		System.out.println();
		dog.printAll();//부모클래스에 printAll 있어서 사용가능 
		//자기클래스에 printAll이 있으면 우선 사용, 없으면 부모클래스의 메소드 사용
	}

}
