package ch03.sec07;

public class LogicalOperatorEx {

	public static void main(String[] args) {
		// �� ������
		// &, && >> �׸��� ����(����)
		// |, || >> �Ǵ� ����(����)
		// ^ >> �ϳ��� true�̸� true(��Ÿ�� ����)
		// ! >> �� ����
		int charCode = 'A';
		if(65<=charCode & charCode <=90) {
			System.out.println("�빮�� �̱���");
		}
		if(97<=charCode && charCode <=122) {
			System.out.println("th���� �̱���");
		}
		if(48<=charCode && charCode <=57) {
			System.out.println("0~9 �����̱���");
		}
		System.out.println("---------------------");
		int value = 6;
		if(value%2==0 | value%3==0) {
			System.out.println("2 �Ǵ� 3�� ����̱���");
		}
		System.out.println("----------------------");
		boolean result = (value%2==0) || (value%3==0); // result= true
		if(!result) {// true�� false�� �ٲ�
			System.out.println("2 �Ǵ� 3�� ����� �ƴϱ���");
		}
	}

}
