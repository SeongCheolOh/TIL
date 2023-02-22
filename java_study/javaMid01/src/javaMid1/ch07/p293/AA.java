package javaMid1.ch07.p293;

public class AA extends A{

	int aa;
	public void setAa(int aa) {
		this.aa = aa;
	}
	public int getAa() {
		return aa;
	}
	public AA() {
		super(200); // 부모 생성자 호출
		System.out.println("AA 클래스의 기본생성자");
	}
	public AA(int aa) {
		System.out.println("AA 클래스의 명시적 생성자");
	}
}
