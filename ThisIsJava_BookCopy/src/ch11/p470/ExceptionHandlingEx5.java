package ch11.p470;

public class ExceptionHandlingEx5 {

	public static void main(String[] args) {
		// 처리해야 할 예외 클래스들이 상속 관계에 있을 때
		// 하위 클래스 catch 블록을 먼저 작성하고
		// 상위 클래스 catch 블록은 나중에

		String[] array = {"100", "1oo"};
		
		for(int i = 0; i<= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);//인덱스[i]의 값을 정수화해라
				System.out.println("array["+i+"] : " + value);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("배열 인덱스가 초과됨 : " + e.getMessage());
			}catch(Exception e) {//상위 클래스라서 아래쪽에 출력은 먼저 된다
				System.out.println("실행에 문제가 있음");
			}
				
		}
	}

}
