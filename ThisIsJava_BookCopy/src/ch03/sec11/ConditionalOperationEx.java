package ch03.sec11;

public class ConditionalOperationEx {

	public static void main(String[] args) {
		// ���׿�����
		
		//���ǽ�1(�ǿ�����1) ? ��or�����(�ǿ�����2) : ��or�����(�ǿ�����3)
		//A ? B : C
		//A�� true�� B, false�� C��� ��
		int score = 85;
		char grade = (score>90) ? 'A' : ((score>80)? 'B' : 'C');
		System.out.println(grade);

	}

}
