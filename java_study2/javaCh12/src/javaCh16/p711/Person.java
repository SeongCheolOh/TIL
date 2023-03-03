package javaCh16.p711;

public class Person {

	public Member getMember1( Creatable01 c1) {//매개변수로 인터페이스를 가지고 있다
		String id = "winter";
		Member member = c1.creat(id);
		return member;
	}
	
	public Member getMember2( Creatable02 c2) {//매개변수로 인터페이스를 가지고 있다
		String id = "winter";
		String name = "한겨울";
		Member member = c2.creat(id, name);
		return member;
	}
}
