package a;

import a.aa.AA;
import b.B;
import b.ba.BA;

public class Main {

	public static void main(String[] args) {
		// B클래스의 static 정적변수를 호출,출력하고싶다
		System.out.println(B.getSb());
		
		// AA클래스의 인스턴스 변수값을 출력하기
		AA a = new AA();
	/*	AA a = new a.aa.AA(); import를 안하고 이렇게 써도 됨 */
		System.out.println(a.getName());
		System.out.println(a.getPhone());
		
		// BA클래스 출력하기
		System.out.println(BA.getSd());//static
		
		BA b = new BA();//instance
		System.out.println(b.getId());
	}

}
