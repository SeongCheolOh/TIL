package academy_example;

import java.util.ArrayList;
import java.util.List;

public class Ex230222_1 {

	public static void main(String[] args) {
		//100 ������ ���� ������ �Է¹޾Ƽ� ������ �� ���ϱ� 
		List<Ex230222_1class> list = new ArrayList<Ex230222_1class>();
		int sum = 0;
		for(int i = 1; i<=100; i++) {//100���� �ݺ���
			list.add(new Ex230222_1class(i-1));//�ε����� 0�����Ͷ� i-1���� �ۼ�
			list.get(i-1).setNum(i);//i-1�ε����� ���� i�� setNum�Ͽ� ������
			sum += list.get(i-1).getNum();//�ջ�
		}System.out.println("�ε����� ���� = " + list.size()+"��");
		System.out.println(list.size()+"���� �ε��� �� ���� "+sum+ "�Դϴ�");
		
	}//end main
		
}//end class
class Ex230222_1class{
	int num;

	public Ex230222_1class(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
