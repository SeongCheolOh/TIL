package academy_example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ex230222_2 {

	public static void main(String[] args) {
		//���� ���� ���� ���� ������ �Է¹޾� �迭����Ʈ�� �����ϰ�, ���� ��� ���ϱ�
		List<Ex230220_2class> list = new ArrayList<Ex230220_2class>();
		list.add(new Ex230220_2class("����", 0));
		list.add(new Ex230220_2class("����", 0));
		list.add(new Ex230220_2class("����", 0));
		list.add(new Ex230220_2class("����", 0));
		
		int sum = 0;
		for(int i = 0; i<list.size(); i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print(list.get(i).getSubject()+ "�� ������ �Է��ϼ��� > ");
			list.get(i).setScore(sc.nextInt());
			int score = list.get(i).score;
			sum += score;
		}System.out.println("������ = " + sum);
		System.out.println("����� = " +(double)sum/list.size());

	}//end main

}//end class
	class Ex230220_2class{
		String subject;
		int score;
		public Ex230220_2class(String subject, int score) {
			super();
			this.subject = subject;
			this.score = score;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
	}//end class