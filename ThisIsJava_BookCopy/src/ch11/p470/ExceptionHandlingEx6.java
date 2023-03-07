package ch11.p470;

public class ExceptionHandlingEx6 {

	public static void main(String[] args) {
		// 두 개 이상의 예외를 하나의 catch 문으로 처리하고싶으면
		// catch(~~~ | ~~~ e){}로 작성

		String[] array = {"100", "1oo", null, "200"};
		
		for(int i = 0; i<= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);//인덱스[i]의 값을 정수화해라
				System.out.println("array["+i+"] : " + value);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("배열 인덱스가 초과됨 : " + e.getMessage());
			}catch(NullPointerException | NumberFormatException e ) {//2가지 예외를 묶어서 처리
				System.out.println("데이터에 문제가 있음 : " + e.getMessage());
			}
				
		}
	}

}
