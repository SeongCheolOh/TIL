package javaMid1.ch07.p284;

public class C extends B{

	String sName = "서울대학교";

	public String getSchool() {
		return sName;
	}

	public void setSchool(String school) {
		this.sName = school;
	}
	public void printO() {
		System.out.println("이름은 " + getName());
		System.out.println("전화번호는 " + getPhone());
		System.out.println("나이는 " + getAge());
		System.out.println("학교 이름은 " + sName);
	}
}
