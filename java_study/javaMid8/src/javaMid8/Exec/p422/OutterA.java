package javaMid8.Exec.p422;

public class OutterA {
	int oa = 10;
	static int soa = 20;
	
	void oaM() {}
	static void soaM() {}
	
	void localMethod() {
		int ss = 40;
		/*static*/ class LocalClass1{}
		class LocalClass2{
			final int fa = 20;
			int ffa = 5;
			void a() {
				ffa = ffa+200;
				oa = oa + 100 ;
//				ss = ss + 400; >> int ss는 final처리가 되어 수정이 불가능하다
				System.out.println(ffa + " " + oa + " " + ss);
				oaM();
			}
		}
		LocalClass2 lc = new LocalClass2();
		lc.a();
	}
	
	class InnerA{//인스턴스 멤버 클래스
		int ia = 20;
		void iaM() {
			ia = ia+10;
			oa = oa+20;
			soa = soa + 30;
			oaM();
			soaM();
		}
	}
	static class InnerSA{
		int sia = 20;
		void siaM() {
			sia = sia+10;
//			oa = oa+20;
			soa = soa + 30;
//			oaM();
			soaM();
		}
		
	}
}
