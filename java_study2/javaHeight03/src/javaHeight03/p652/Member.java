package javaHeight03.p652;

public class Member {

	private String name;
	private int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//�̸��� ����, ���̰� ������ ���� ���(���ü) ��� ���� ���α׷���
	//1. hashCode() ���ƾ�, 2. equals()�� ���ƾ�.
	//hashCode����� equals������ ������ �޼ҵ� ȣ������ �ʾƵ� Set�� ��ü�� �˾Ƽ� ���ü �Ϸ��� �ڵ�ȣ��

	@Override
	public int hashCode() {
		// �����ڰ� hashCode ������
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {//obj �������� ���������� �Է� �� Set �ڷ��� �ּҰ� ����
		if(obj instanceof Member) {
			Member target = (Member) obj;
			return target.name.equals(this.name) && target.age == this.age;
			//target.name�� ���� �ڷ��� �̸�, this.name�� ���ִ� �ڷ��� �̸�
		}
		return false;
	}
	
	
}
