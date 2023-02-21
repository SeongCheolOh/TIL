package academy_example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ex230222_2 {

	public static void main(String[] args) {
		//국어 영어 수학 과학 점수를 입력받아 배열리스트에 저장하고, 총점 평균 구하기
		List<Ex230220_2class> list = new ArrayList<Ex230220_2class>();
		list.add(new Ex230220_2class("국어", 0));
		list.add(new Ex230220_2class("영어", 0));
		list.add(new Ex230220_2class("수학", 0));
		list.add(new Ex230220_2class("과학", 0));
		
		int sum = 0;
		for(int i = 0; i<list.size(); i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print(list.get(i).getSubject()+ "의 점수를 입력하세요 > ");
			list.get(i).setScore(sc.nextInt());
			int score = list.get(i).score;
			sum += score;
		}System.out.println("총점은 = " + sum);
		System.out.println("평균은 = " +(double)sum/list.size());

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