package ch03.sec10;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		// 대입연산자
		
	/*	단순 대입 연산자 "=" = 우측의 피연산자 값을 좌측 변수에 저장 */
	/*	복합 대입 연산자 "+=" = 변수+피연산자 후 다시 변수에 저장
					 "-=" = 변수-피연산자 후 다시 변수에 저장
					 "*=" = 변수*피연산자 후 다시 변수에 저장
					 "/=" = 변수/피연산자 후 다시 변수에 저장
					 "%=" = 변수/피연산자 후 나머지를 다시 변수에 저장
					 "&=" = 변수&피연산자 후 다시 변수에 저장
					 "|=" = 변수|피연산자 후 다시 변수에 저장
					 "^=" = 변수^피연산자 후 다시 변수에 저장
					 "<<=" = 변수<<피연산자 후 다시 변수에 저장
					 ">>=" = 변수>>피연산자 후 다시 변수에 저장
					 ">>>=" = 변수>>>피연산자 후 다시 변수에 저장 */
		int result = 0;
		result += 10;
		System.out.println(result);
		result -= 5;
		System.out.println(result);
		result *= 3;
		System.out.println(result);
		result /= 5;
		System.out.println(result);
		result %= 3;
		System.out.println(result);
		result += 10;
		System.out.println(result);
		result &= 40; // 좌우를 이진수화 후 둘 다 1인거만 추려내기
		System.out.println(result);
		result ^= 20; // 좌 우 모두 1인 자리 추려내기
		System.out.println(result);
		

	}

}
