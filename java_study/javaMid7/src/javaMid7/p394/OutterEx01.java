package javaMid7.p394;

public class OutterEx01 {

	public static void main(String[] args) {
		// OutterA >> 인스턴스 멤버 클래스
		OutterA oa = new OutterA();
		OutterA.innerA oia = oa.new innerA();
		
		// OutterB >> 정적 멤버 클래스
		OutterB.innerB oib = new OutterB.innerB();
		oib.ib = 100;
		oib.ibM();
		//static이 붙어있는 멤버들은 클래스명.멤버변수 or 클래스명.메소드명();
		OutterB.innerB.sia = 200;
		OutterB.innerB.sibM();
		
		// 인스턴스 멤버클래스 사용해서 1~100까지 합 출력하기
		oia.iaM2();
		
		// 정적멤버 클래스 객체화 하기
		/* *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		oib.ibM();
	
/*		*     *
		**   **
		*** ***
		*******  출력하기*/
		oib.ibM2();
		
		OutterC oc = new OutterC();
		oc.ocM();
		
		OutterD.sM(); // static으로 이미 메모리에 올라가있음 >> 객체생성 따로 안해도 됨
		
	}

}
