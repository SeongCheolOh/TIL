package ch11.p470;

public class ExceptionHandlingEx04 {

	public static void main(String[] args) {
		// 예외 종류에 따른 처리
		// try 블럭에는 다양한 종류의 예외가 발생할 수 있다
		// 다중 catch를 사용하면 발생하는 예외에 따라 처리 코드를 다르게 작성 가능

		String[] array = {"100", "1oo"};
		
		for(int i = 0; i<= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);//인덱스[i]의 값을 정수화해라
				System.out.println("array["+i+"] : " + value);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("배열 인덱스가 초과됨 : " + e.getMessage());
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음 : " + e.getMessage());
			}
				
		}
	}

}
