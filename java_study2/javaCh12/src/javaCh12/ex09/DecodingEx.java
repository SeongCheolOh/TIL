package javaCh12.ex09;

import java.io.UnsupportedEncodingException;

public class DecodingEx {

	public static void main(String[] args) {
		// Ȯ�ι��� 9��
		//utf-8 ���ڼ����� ���ڵ��� �����͸� ���ڿ��� ���ڵ��ؼ� ���� data�� �����Ϸ��� ��
		
		byte[] bytes = {-20, -107, -120, -21, -123, -107};
		String str;
		try {
			str = new String(bytes, "utf-8");
			System.out.println("str: " + str);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//����Ʈ �迭�� String ��ü�� �����
		//1) bytes��ü���� ã�ƺ���>>Byte.___ �� (byte[]):String���� �����°� ã�� >> ����
		//2) String ��ü���� ã�ƺ���>>String._____(byte[]):String
		//3) new String~~�ؼ� ��ü ����
		
		

	}

}
