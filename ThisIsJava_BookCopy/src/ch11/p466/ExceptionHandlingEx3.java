package ch11.p466;

public class ExceptionHandlingEx3 {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");//ClassPath ��ġ���� �־��� Ŭ������ ã�� �ڵ�
			System.out.println("java.lang.String Ŭ������ �����մϴ�.");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		try {
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String2 Ŭ������ �����մϴ�");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
