package javaCh12.ex09;

public class Member {
	//Ȯ�ι��� 6�� Ŭ����
	
	private String id;
	private String name;
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//���⿡ �ڵ� �ۼ�
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+":"+name;
	}
}