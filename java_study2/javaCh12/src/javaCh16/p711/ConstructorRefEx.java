package javaCh16.p711;

public class ConstructorRefEx {

	public static void main(String[] args) {
		// Person Ŭ������ ��üȭ �ϰ� �޼ҵ� ȣ��
		Person p1 = new Person();
		
		//null����
		//�͸��� ����Ŭ����
		//���ٽ�
		//�Ű����� ������ ���� ���� �� �� �ִ�
		Member m1 =	p1.getMember1(new Creatable01() {
			
			@Override
			public Member creat(String id) {
				// Member Ŭ���� ���������� ����
				return new Member(id) ;
			}
		});
		
		//���ٽ� ver1
		Member m3 = p1.getMember1((String id)->{return new Member(id);} );
		
		//���ٽ� ver2
		Member m4 = p1.getMember1((id) -> new Member(id));
		
		//������ ���� : ���ٽĿ��� ����� �����ϴ� ���� ��ü�� �����ϴ� �� �ۿ� ���ٸ� �ٸ� ǥ������ �ִ�.
		Member m5 = p1.getMember1(Member :: new);
		
		System.out.println(m1);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		
		//�Ű����� ������ ������
		Member m2 = p1.getMember2(new Creatable02() {
			
			@Override
			public Member creat(String id, String name) {
				return new Member(id, name);
			}
		});
		
		//���ٽ� ver1
		Member m21 = p1.getMember2((String id, String name)->{return new Member(id, name);} );
		//���ٽ� ver2
		Member m22 = p1.getMember2((id, name) -> new Member(id, name));
		//������ ����
		Member m23 = p1.getMember2(Member :: new);
		System.out.println(m2);
	}

}
