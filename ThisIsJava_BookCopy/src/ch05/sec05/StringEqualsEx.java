package ch05.sec05;

public class StringEqualsEx {

	public static void main(String[] args) {
		//���ڿ� ��
		String var1 = "ȫ�浿";
		String var2 = "ȫ�浿";
		
		if(var1==var2) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
		
		if(var1.equals(var2)) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}System.out.println("----------------");
		
		//��ü ������ ���� ��
		String var3 = new String("ȫ�浿");
		String var4 = new String("ȫ�浿");
		if(var3==var4) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}

		if(var3.equals(var4)) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
	}

}
