package javaCh12.ex06;

import java.util.regex.Pattern;

public class P545 {

	public static void main(String[] args) {
		// ����ǥ���� - ���� ���
		String regExp1 = "\\d{6}\\-[1-4]\\d{6}"; //�ֹε�Ϲ�ȣ ����ǥ����
		
		if(Pattern.matches(regExp1, "851213-1028519")) {
			System.out.println("�ֹε�� ��ȣ�� �½��ϴ�");
		}else {
			System.out.println("�ֹε�� ��ȣ ������ �ƴմϴ�");
		}
		
		String regExp2 = "\\w+@\\w+\\.\\w+(\\.\\w+)?"; //�̸��� ����ǥ����
		if(Pattern.matches(regExp2, "osc0904@naver.com")) {
			System.out.println("�̸��� ������ �½��ϴ�");
		}else {
			System.out.println("�̸��� ������ �ƴմϴ�");
		}
	}

}
