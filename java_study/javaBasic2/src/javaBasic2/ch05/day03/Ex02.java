package javaBasic2.ch05.day03;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//주민번호 "880812-1234567" //집주소 "경기도 하남시" //나이 : 25 //성별 : 남자
		
		Person p1 = new Person();
		
		p1.setSsn( "880815-1234567" );
		p1.setAddress("경기도 하남시");
		p1.setAge (25);
		p1.setGender(true);
		System.out.println(p1.ssn);
		System.out.println(p1.adderss);
		System.out.println(p1.age);
		System.out.println(p1.gender);
				
		
		
		
	}//end main

}//end class
class Person{

	String ssn; //주민번호
	String adderss; //집주소
	int age;
	boolean gender; // 성별
	
	void setSsn(String ssn) {
		this.ssn=ssn;
	}
	void setAddress(String address) {
		this.adderss=address;
	}
	void setAge(int age) {
		this.age= age;
	}
	void setGender(boolean gender) {
		this.gender=gender;
	}
}