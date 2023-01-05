package exBasic;

public class MyFirstClass {

	public static void main(String[] args) {
		//실습 >> 대학 학과 학번 각각 한줄에 출력하는 프로그램 ㅈ
		// 변수 선언하기
		String collageName; //대학명
		String department; //학과
		String student_id; //학번
		//변수에 값을 대입
		collageName = "서울대학교";
		department = "컴퓨터공학과";
		student_id = "23080511";
		
		System.out.println(collageName);
		System.out.println(department);
		System.out.println(student_id);
		
		System.out.println("-----------");
		System.out.println("학교 : " + collageName);
		System.out.println("학과 : " + department);
		System.out.println("학번 : " + student_id);

		System.out.println("-----------");
		System.out.println("학교 : " + collageName + "학과 : " + department + "학번 : " + student_id);

		System.out.println("-----------");
		System.out.print("학교 : " + collageName);
		System.out.print("학과 : " + department);
		System.out.print("학번 : " + student_id);
		
		System.out.println("-----------");
		System.out.printf("학교 : %s, 학과 : %s, 학번 : %s", collageName, department, student_id);

		
	}

}