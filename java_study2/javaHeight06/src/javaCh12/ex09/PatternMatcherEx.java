package javaCh12.ex09;

import java.util.regex.Pattern;

public class PatternMatcherEx {

	public static void main(String[] args) {
		// Ȯ�ι��� 17��
		//����ǥ���� �̿�
		//ù��°�� ���ĺ�, �ι�°���� ���ڿ� ���ĺ����� ������ 8~12�� ������ id������ �˻��ϰ���
		//���ĺ��� ��ҹ��� ��� ���
		
		String id = "Anger1004";
		String redExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
		boolean isMatch = Pattern.matches(redExp, id);
		if(isMatch) {
			System.out.println("id�� ����� �� �ֽ��ϴ�");
		}else {
			System.out.println("id�� ����� �� �����ϴ�");
		}

	}

}
