package checkEx;

public class Ex08Class {

	public int studentNum;
	public String name;
	
	
	public Ex08Class(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}
	//���� �ڵ带 �ۼ��ϼ���


	@Override
	public int hashCode() {
		return studentNum;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Ex08Class) {
			Ex08Class ex = (Ex08Class)obj;//�ٿ�ĳ����
			return studentNum==ex.studentNum;
			}return false;
			
		}
	
}
