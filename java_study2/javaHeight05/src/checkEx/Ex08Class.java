package checkEx;

public class Ex08Class {

	public int studentNum;
	public String name;
	
	
	public Ex08Class(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}
	//여기 코드를 작성하세요


	@Override
	public int hashCode() {
		return studentNum;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Ex08Class) {
			Ex08Class ex = (Ex08Class)obj;//다운캐스팅
			return studentNum==ex.studentNum;
			}return false;
			
		}
	
}
