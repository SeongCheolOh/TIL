package ch05.sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// 배열변수
		int[] intArray = null; 
		//intArray[0] = 10;		// NullPointerExeption
		
		String str = null;
		//System.out.println("총 문자 수 : " + str.length()); //NullPointerExeption

	}

}
