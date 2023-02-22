package javaMid6.p395;

public class AEx {
	
	public static void main(String[]args) {
		A a = new A();
		a.method();
		
		//B클래스를 다른 클래스에서 사용하고싶다 ex) AEx >> B
		//B클래스를 포함하고있는 외부클래스 A를 객체화 후 B 객체화해서 사용
		//형식>> A.B b = a.new B();
		A.B b = a.new B(); // 이걸 짤 수 있을까....
		b.bMethod();
	}

}
