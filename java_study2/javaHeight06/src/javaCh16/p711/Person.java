package javaCh16.p711;

public class Person {

	public Member getMember1( Creatable01 c1) {//�Ű������� �������̽��� ������ �ִ�
		String id = "winter";
		Member member = c1.creat(id);
		return member;
	}
	
	public Member getMember2( Creatable02 c2) {//�Ű������� �������̽��� ������ �ִ�
		String id = "winter";
		String name = "�Ѱܿ�";
		Member member = c2.creat(id, name);
		return member;
	}
}
