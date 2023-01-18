package ch05.sec08;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		// 객체를 참조하는 배열
		
		//기본타입 배열은 각 항목에 값을 직접 저장하지만
		//참조타입 배열은 각 항목에 객체의 번지를 저장한다.
		
		String[]language = new String[3]; //배열 생성[null][null][null]
		language[0] = "java";
		language[1] = "java";
		language[2] = new String("java");
		
		System.out.println(language[0]==language[1]); // true 같은 객체 참조
		System.out.println(language[0]==language[2]); // false 다른 객체 참조
		System.out.println(language[0].equals(language[2])); // true 문자열 동일
		

	}

}
