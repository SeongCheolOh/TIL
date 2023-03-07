package ch11.p470;

public class ExceptionHandlingEx5 {

	public static void main(String[] args) {
		// ó���ؾ� �� ���� Ŭ�������� ��� ���迡 ���� ��
		// ���� Ŭ���� catch ����� ���� �ۼ��ϰ�
		// ���� Ŭ���� catch ����� ���߿�

		String[] array = {"100", "1oo"};
		
		for(int i = 0; i<= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);//�ε���[i]�� ���� ����ȭ�ض�
				System.out.println("array["+i+"] : " + value);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("�迭 �ε����� �ʰ��� : " + e.getMessage());
			}catch(Exception e) {//���� Ŭ������ �Ʒ��ʿ� ����� ���� �ȴ�
				System.out.println("���࿡ ������ ����");
			}
				
		}
	}

}
