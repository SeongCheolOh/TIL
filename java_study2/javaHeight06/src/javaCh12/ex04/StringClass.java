package javaCh12.ex04;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StringClass {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String data = "�ڹ�";
		byte[] arr1 = data.getBytes("UTF-8");
		
		System.out.println(Arrays.toString(arr1));
		
		String str1 = new String(arr1, "utf-8");
		System.out.println(str1);
		
		byte[] arr2 = data.getBytes("EUC-KR");
		System.out.println(Arrays.toString(arr2));
		
		String str2 = new String(arr2, "euc-kr");
		System.out.println(str2);

		//StringBuilder Ŭ����
		String data1 = "abc";
		data1 += "def";
		data1 += "ghi"; // �����Ͱ� �����Ǵ� ������ �ƴ�, "abcdefghi" ��ü�� ���� �����ϴ� ��
		System.out.println(data1);
		//������ ��������(������ ��ü�� ��� ����), ���ο� ��ü�� ��� �����Ǵ°Ŷ� ȿ�� ������
		
		StringBuilder data2 = new StringBuilder("abc");
		data2.append("def");//��ü�� ����(���� �߰�)
		System.out.println(data2);
		
		data2.insert(5,"kk");
		System.out.println(data2);//��ü�� ����(����)
		//���� >> �޸� ���� ����
		//���� >> �߰�, ������ �� �ð��� ���� �� �ҿ��
		
		//StringTokenizer Ŭ����
		//�����ڷ� �߶� �� ���
		//�̿�о� >> �����ͺ��̽����� �ڷ� ������ �ͼ� �ڸ� �� �̿�
		//			�����Ϳ��� �����͸� ����� ������� �߶� ����Ҷ� �̿�
		
		String data3 = "����&��ȫö&�ڸ��,���缮 ������-��";
		//&�� �����ڷ� ����ؼ� ���� �̸��� �и�
		//���1) String Ŭ���� �̿��ϱ�
		String[] arr3 = data3.split("&|,| |-");
		for(String a3 : arr3) {
			System.out.println(a3);
		}System.out.println("----------");
		
		//���2) StringTokenizer Ŭ���� �̿��ϱ�
		String data4 = "����&��ȫö&�ڸ��,���缮 ������-��";
		//��ü ����
		StringTokenizer st4 = new StringTokenizer(data4,",|&| |-");//data4�� ������ [,][&][ ][-] ���� �ڸ�����
		System.out.println("��ū�� ������ "+st4.countTokens());
		while(st4.hasMoreTokens()) {
			String token4 = st4.nextToken();
			System.out.println(token4);
		}System.out.println("-----------");
		
		//Wrapper(����) Ŭ���� - �⺻���� Ŭ������ ������ Ŭ������ Ī�Ѵ�
		//�⺻ �ڷ��� int byte char long float double boolean
		//>>�޼ҵ尡 ���� �����ϴ�  / int �⺻���� Ŭ���� ������ذ� �޼ҵ� ������ذ��� �ִ� - Integer
/*		int --> Integer �ڽ�
		integer --> int ��ڽ� */
		
		Integer i = 100;//��ü
		int iv = i.intValue();//��ڽ�
		System.out.println(i);
		System.out.println(iv);
		int ii = 200;
		Integer i1 = Integer.valueOf(ii);//�ڽ�
		System.out.println(i1);
		//��ڽ� �غ���
		Double d = 3.4;
		double dub = d.doubleValue();
		System.out.println(dub);
		
		//�ڽ� �غ���
		float f = 1.2f;
		Float fb = Float.valueOf(f);
		System.out.println(fb);
	}

}
