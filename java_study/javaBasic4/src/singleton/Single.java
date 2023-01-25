package singleton;

public class Single {

	private static Single s = new Single();//생성자 호출
		//자기 클래스에서만 사용가능한 private
	private Single() {
		
	}
	private static String now() {
		return "2023-01-25";
	}
	public static Single getInstance() {
		return s;
	}
	
}
