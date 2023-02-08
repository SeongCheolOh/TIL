package javaMid10.p467;

public class ExceptionEx04 {
	
	public static void main(String[] args) {
		int k = 0;
		int a = 0;
		try {
			Class.forName("java.lang.String");
			a = 10 / k; //예외를 잡고 난 부분 아래로는 실행이 되지 않는다
			int[] number = {1,2,3,4,5};
			System.out.println(number[5]);
			}catch(ArithmeticException e) {
			if(k==0) {k=5;
			System.out.println(a/k);
			}
			System.out.println("숫자 잘못");
			}catch(Exception e ) {
			System.out.println("모든 예외를 다 받는다" + e.getMessage());
			}finally {
			System.out.println("정상 종료하기");		
		}
		
	}

}
