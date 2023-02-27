package javaCh12.ex09;

public class Student {
	//Ȯ�ι��� 5�� Ŭ����
	
	private String studentNum;

	public String getStudentNum() {
		return studentNum;
	}

	public Student(String studentNum) {
		super();
		this.studentNum = studentNum;
	}
	
	//���⿡�� �ۼ�
	
	@Override
	public int hashCode() {
		//studentNum�� ����
		return studentNum.hashCode();
	}//�Ȱ����� equals�� ��
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student t = (Student)obj;
		
		return studentNum.equals(t.studentNum);
		}
		return false;
	}

}
