package ch06.sec10;

public class StaticCannotUse {
		// 정적 멤버들은 객체가 없어도 실행된다는 특징 때문에
		// 사용함에 객체생성이 필요한 인스턴스 필드는 사용 불가능 하다
		// 또한 객체 자신의 참조인 this도 사용 불가능하다
		
		int feild1;
		void method1() {}
		
		static int feild2;
		static void method2() {}
		static {
//			feild1 = 10;
//			method1(); 
//			정적멤버 내부에서 인스턴스 멤버 사용 불가능
//			객체생성 후 사용 가능
			StaticCannotUse canUse = new StaticCannotUse();
			canUse.feild1=10;
			canUse.method1();
			feild2=10;
			method2();
		}

}
