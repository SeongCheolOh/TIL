package ch06.sec08;

public class Computer {
	//�������� �Ű�����
	//���� �޼ҵ尡 �������� �Ű������� ������ �ִٸ�
	//�Ű������� ������ ������� �Ű����� �� �� �ִ�.
	
	//�������� �Ű������� ���� �޼ҵ� ����
	int sum(int ... value) {//>>�������� �Ű����� ����
		//sum ���� ����
		int sum = 0;
	//value�� �迭Ÿ���� ����ó�� ���
		for(int i = 0; i<value.length; i++) {
			sum += value[i];
		}
	//�ջ��� ����
	return sum;
	}

}
