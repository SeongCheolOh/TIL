package ch04.sec03;

public class SwitchCharEx {

	public static void main(String[] args) {
		char grade = 'b';
		
		switch(grade) {
		case 'A':
		case 'a': System.out.println("���ȸ��"); break;
		case 'B':
		case 'b': System.out.println("�Ϲ�ȸ��"); break;
		default : System.out.println("�մ�");
		}

	}

}
