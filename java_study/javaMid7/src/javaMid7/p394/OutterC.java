package javaMid7.p394;

public class OutterC {
	
	int oc = 10;
	static int soc = 20;
	static void socaM() {
		
	}
	void ocM() {
		class InnerC{
			int ic = 20;
//			static int sic = 20;
			void icM() {
				oc = oc+100;// 바깥메소드 사용 가능
				ic = ic+200;// 내부는 당연히 가능
				System.out.println("ocM메소드 내부의 클래스임" + oc + " " + ic);
			}
//			static void icsM() {
//				System.out.println("ocM메소드 내부의 정적메소드임");
//			}
		}
		InnerC inc = new InnerC();
		inc.icM();
	}//end iaM()
}
