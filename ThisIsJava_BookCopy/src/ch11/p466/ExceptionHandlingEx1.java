package ch11.p466;

public class ExceptionHandlingEx1 {

	public static void main(String[] args) {
		//���ܰ� ����� ����
		System.out.println("���α׷� ����");
		printLength("ThisIsJava");
//		printLength(null); ���ڿ� ��� null�� �ָ� NullPointerException �߻�
		System.out.println("���α׷� ����");
	}
	
	public static void printLength(String data) {
		System.out.println("���� �� : " + data.length());
	}

}
