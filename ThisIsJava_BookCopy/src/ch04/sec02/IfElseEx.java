package ch04.sec02;

public class IfElseEx {

	public static void main(String[] args) {
		int score1 = 93;
		if(score1>=90) {
			System.out.println("������ 90���� Ů�ϴ�");
			System.out.println("����� A �Դϴ�");
		}else{
			System.out.println("����<90");
			System.out.println("B���");
		}System.out.println("-----------");
		
		int score2 = 75;
		
		if(score2>=90) {
			System.out.println("����>=90");
			System.out.println("A���");
		}else if(score2>=80) {
			System.out.println("90>=����>=80");
			System.out.println("B���");
		}else {
			System.out.println("����<80");
			System.out.println("C���");
		}

	}

}
