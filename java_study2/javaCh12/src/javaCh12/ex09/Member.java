package javaCh12.ex09;

public class Member {
	//확인문제 6번 클래스
	
	private String id;
	private String name;
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//여기에 코드 작성
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+":"+name;
	}
}
