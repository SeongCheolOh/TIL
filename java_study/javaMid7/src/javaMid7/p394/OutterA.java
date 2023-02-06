package javaMid7.p394;

public class OutterA {

	int oa= 10;
	static int soa = 20;
	void oaM() {
		oa = oa - 5;
		soa = soa + 10;
		soaM();
		}
	static void soaM() {
//		oa = oa + 5;
		soa = soa - 1;
//		oaM();
	}
	
	class innerA{
		int ia = 20;
//		static int sia = 30;
		void iaM() {
			ia = ia + 10;
			oa = oa + 20;
			soa = soa + 10;
			oaM();
			soaM();
		}
		void iaM2() {
			int sum= 0;
			for(int i = 0; i<=100; i++) {
				sum = sum+i;
			}
			System.out.println(sum);
		}
//		static void siaM() {
			
	}
}
