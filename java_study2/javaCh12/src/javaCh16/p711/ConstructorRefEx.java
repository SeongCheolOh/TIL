package javaCh16.p711;

public class ConstructorRefEx {

	public static void main(String[] args) {
		// Person 클래스를 객체화 하고 메소드 호출
		Person p1 = new Person();
		
		//null에는
		//익명형 구현클래스
		//람다식
		//매개변수 생성자 참조 식이 들어갈 수 있다
		Member m1 =	p1.getMember1(new Creatable01() {
			
			@Override
			public Member creat(String id) {
				// Member 클래스 참조변수를 리턴
				return new Member(id) ;
			}
		});
		
		//람다식 ver1
		Member m3 = p1.getMember1((String id)->{return new Member(id);} );
		
		//람다식 ver2
		Member m4 = p1.getMember1((id) -> new Member(id));
		
		//생성자 참조 : 람다식에서 결과를 리턴하는 것이 객체를 생성하는 것 밖에 없다면 다른 표현식이 있다.
		Member m5 = p1.getMember1(Member :: new);
		
		System.out.println(m1);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		
		//매개변수 생성자 참조식
		Member m2 = p1.getMember2(new Creatable02() {
			
			@Override
			public Member creat(String id, String name) {
				return new Member(id, name);
			}
		});
		
		//람다식 ver1
		Member m21 = p1.getMember2((String id, String name)->{return new Member(id, name);} );
		//람다식 ver2
		Member m22 = p1.getMember2((id, name) -> new Member(id, name));
		//생성자 참조
		Member m23 = p1.getMember2(Member :: new);
		System.out.println(m2);
	}

}
