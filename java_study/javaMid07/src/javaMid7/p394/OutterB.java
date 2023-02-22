package javaMid7.p394;

public class OutterB {

	int ob= 10;
	static int sob = 20;
	void obM() {
		ob = ob - 5;
		sob = sob + 10;
		sobM();
		}
	static void sobM() {
//		ob = ob + 5;
		sob = sob - 1;
//		obM();
	}
	
	static class innerB{
		int ib = 20;
		static int sia = 30;
		void ibM() {
			ib = ib + 10;
//			ob = ob + 20;   바깥클래스의
			sob = sob + 10;
//			obM(); 			인스턴스멤버들은 사용 불가능
			sobM();
		}
		static void sibM() {
			for(int i = 0; i < 5 ; i++) {
				for(int j = 0; j < 5-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		void ibM2() {
			for(int i = 0; i < 4; i++) {//i = 0,1,2,3
				for(int j = 0; j <i+1; j++) {//j = 0; 1개씩 늘어나야하고
					System.out.print("*");
				}
				for(int k = 0; k<5 - 2*i ; k++) {//k = 0,1,2,3,4; 2개씩 줄어들어야하고, 0이하면 false해서 멈추기
					System.out.print(" ");
				}
				for(int l = 0; l<i+1; l++) {//l = 0; 1개씩 늘어나야하고
					if(i == 3 && l == 3)break;
					System.out.print("*");
				}
				System.out.println();
			}
		}
			
	}
}
