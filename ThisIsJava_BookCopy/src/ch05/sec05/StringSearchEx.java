package ch05.sec05;

public class StringSearchEx {

	public static void main(String[] args) {
		// ���ڿ� ã��
		// ����.indexOf("���ڿ�"); >> �־��� ���ڿ��� ���۵Ǵ� �ε��� ��ȣ ����
		// ����.substring(����); >> �־��� ���� ������ �ε��� �߶󳻾� ����
		String subject = "�ڹ� ���α׷���";
		int location = subject.indexOf("���α׷���");// �־��� ���ڿ��� ���۵Ǵ� �ε��� ����
		System.out.println(location);
		String subStr = subject.substring(location);// 3 ���ķ��� �ε����� ����
		System.out.println(subStr);
		
		location = subject.indexOf("�ڹ�"); // �־��� ���ڿ��� ���۵Ǵ� �ε��� ����
		System.out.println(location);
		if(location==0) {
			System.out.println("�ڹٿ� ���õ�");
		}else {
			System.out.println("�ڹٿ� ���� ����");
		}System.out.println("----------------");

		// ����.contains("���ڿ�"); >> �ܼ��� ���ԵǾ��ִ����� ���� �� true/ false ����
		boolean result = subject.contains("�ڹ�");
		if(result) {
			System.out.println("�ڹٿ� ���õ�");
		}else {
			System.out.println("�ڹٿ� ���� ����");
		}
	}

}
