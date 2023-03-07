package ch11.p470;

public class ExceptionHandlingEx04 {

	public static void main(String[] args) {
		// ���� ������ ���� ó��
		// try ������ �پ��� ������ ���ܰ� �߻��� �� �ִ�
		// ���� catch�� ����ϸ� �߻��ϴ� ���ܿ� ���� ó�� �ڵ带 �ٸ��� �ۼ� ����

		String[] array = {"100", "1oo"};
		
		for(int i = 0; i<= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);//�ε���[i]�� ���� ����ȭ�ض�
				System.out.println("array["+i+"] : " + value);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("�迭 �ε����� �ʰ��� : " + e.getMessage());
			}catch(NumberFormatException e) {
				System.out.println("���ڷ� ��ȯ�� �� ���� : " + e.getMessage());
			}
				
		}
	}

}
