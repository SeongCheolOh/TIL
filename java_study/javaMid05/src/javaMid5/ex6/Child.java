package javaMid5.ex6;

public class Child extends Parent{
	public int studentNo;
	public Child(String name, int studentNo) {
		super(name); 
//해결법1	this.name = name; 부모에게 기본생성자를 만들어놓고 쓰거나 아님 위의 super 사용
		this.studentNo = studentNo;
	}
}
