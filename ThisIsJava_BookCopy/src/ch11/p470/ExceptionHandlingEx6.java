package ch11.p470;

public class ExceptionHandlingEx6 {

	public static void main(String[] args) {
		// �� �� �̻��� ���ܸ� �ϳ��� catch ������ ó���ϰ������
		// catch(~~~ | ~~~ e){}�� �ۼ�

		String[] array = {"100", "1oo", null, "200"};
		
		for(int i = 0; i<= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);//�ε���[i]�� ���� ����ȭ�ض�
				System.out.println("array["+i+"] : " + value);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("�迭 �ε����� �ʰ��� : " + e.getMessage());
			}catch(NullPointerException | NumberFormatException e ) {//2���� ���ܸ� ��� ó��
				System.out.println("�����Ϳ� ������ ���� : " + e.getMessage());
			}
				
		}
	}

}
