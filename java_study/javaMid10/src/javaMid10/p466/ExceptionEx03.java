package javaMid10.p466;

public class ExceptionEx03 {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			int a = 10/0; //예외를 잡고 난 부분 아래로는 실행이 되지 않는다
			int[] number = {1,2,3,4,5};
			System.out.println(number[5]);
			
		}catch(ClassNotFoundException e ) {
			System.out.println("class에 대한 에러입니다");
		}catch( ArithmeticException e) {
			System.out.println("수학적으로 잘못된 에러입니다");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어남");
		}
		finally {
			System.out.println("정상 종료하기");
				
		}
		
	}

}
