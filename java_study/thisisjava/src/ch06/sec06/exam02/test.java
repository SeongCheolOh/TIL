package ch06.sec06.exam02;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		School school = new School();
		
		System.out.print("Name : ");
		school.setName(sc.next());
		System.out.print("School : ");
		school.setScName(sc.next());
		System.out.print("Grade : ");
		school.setGrade(sc.nextInt());
		
/*		school.getName
		school.getScName
		school.getGrade */
		
		
		
		
	}//end main
	
}//end class
class School{
	String name;
	String scName;
	int grade;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScName() {
		return scName;
	}
	public void setScName(String scName) {
		this.scName = scName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

}