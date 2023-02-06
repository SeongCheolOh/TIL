package javaMid7.p394;

public class OutterD {

	static int sia = 200;
	static void sM() {
		int ss = 10;
		class InnerD{
			int sid = 20;
			void sim() {
				System.out.println("여기는 sM메소드 내부의 InnerD 클래스" + " " +sia + " " + sid + " " + ss);
			}
		}
		InnerD id = new InnerD();
		id.sim();
		
	}
}
