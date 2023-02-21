package javaCh12.ex01;

public class Member {

	private String id;

	public Member(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member) obj;
			if(id.equals(m.id)) return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
	@Override
	public String toString() {
		
		return "��� Ŭ������ ���������� ����� �� �ڵ����� ���� �޼ҵ���" + id;
	}
}
