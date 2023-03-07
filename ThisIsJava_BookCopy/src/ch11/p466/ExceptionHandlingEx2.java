package ch11.p466;

public class ExceptionHandlingEx2 {

	public static void main(String[] args) {
		//����ó�� �ڵ� �߰�
		System.out.println("���α׷� ����");
		printLength("ThisIsJava");
		printLength(null); 
		System.out.println("���α׷� ����");
	}
	
	public static void printLength(String data) {
		try{
			System.out.println("���� �� : " + data.length());
		}catch(NullPointerException e) {//���� ������ ��� 3���� ���
			System.out.println(e.getMessage());//���1 ������ ����
			System.out.println(e.toString());//���2 ���� + ������ ����
//			e.printStackTrace();//���3 ���� + ������ ���� + �߻� ��ġ ����
		}finally {
			System.out.println("������ ����");
		}
	}

}
