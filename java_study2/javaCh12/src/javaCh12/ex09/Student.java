package javaCh12.ex09;

public class Student {
	//확인문제 5번 클래스
	
	private String studentNum;

	public String getStudentNum() {
		return studentNum;
	}

	public Student(String studentNum) {
		super();
		this.studentNum = studentNum;
	}
	
	//여기에다 작성
	
	@Override
	public int hashCode() {
		//studentNum을 리턴
		return studentNum.hashCode();
	}//똑같으면 equals로 감
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student t = (Student)obj;
		
		return studentNum.equals(t.studentNum);
		}
		return false;
	}

}
