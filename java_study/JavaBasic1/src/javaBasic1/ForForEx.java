package javaBasic1;

public class ForForEx {

	public static void main(String[] args) {
//		// for가 이중으로 들어간 예제
//		for(int i=1; i<3; i++) {//i<3인게 참이면 {}속으로
//			for(int j=1; j<2; j++) {//j<2인게 참이면 {}속으로
//				System.out.println(i + " " + j);// 출력하고 8번줄로 올라가기
		                                        //j++실행해서 j<2 참이면 그 값 계속 출력, 아니면 한단계 탈출
		                                        //i++실행해서 i<3 이 참이면 {}속으로
//				
//			}
//		}
		System.out.println("-------------");
		//아래와 같은 코드의 출력 결과를 쓰시오
		for(int i=2; i<=4; i++) {
			for(int j=5; j>=i ; j--) {
				System.out.print(i + " " +j + " ");
			}
			System.out.println();
		}
		System.out.println("-------------");
		//아래와 같은 코드의 출력 결과를 쓰시오
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=9 ; j++) {
				System.out.print(i + " " +j + " ");
			}
			System.out.println();
		}
		
		//문1) 출력해보기
		//[1,1][1,2][1,3]
		//[2,1][2,2][2,3]
		System.out.println("---------------");
		for(int i=1; i<=2; i++) {
			for(int j=1; j<=3; j++) {
				System.out.print("["+i+","+j+"]");
			}
			System.out.println();
		}
		
		
		
		//[1,1,1][1,1,2]
		//[1,2,1][1,2,2]
		//[2,1,1][2,1,2]
		//[2,2,1][2,2,2]
		System.out.println("--------------------");
		for(int i=1; i<=2; i++) {
			for(int j=1; j<=2; j++) {
				for(int k=1; k<=2; k++) {
					System.out.print("["+i+","+j+","+k+"]" );
				}
				System.out.println();
			}
		}

		//문3) 2 x 1 = 2  2 x 2 = 4  ... 2 x 9 = 18
		//
		//	  9 x 1 = 9                 9 x 9 = 81
		System.out.println("-----------------------");
	/*	int a = 2;
		int b = 9;
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.print(a + " x " + i + " = " + a*i + " / ");}
		System.out.println();
		System.out.println();
		for(int j = 1 ; j <= 9 ; j++) {
			System.out.print(b + " x " + j + " = " + b*j + " / ");}
		System.out.println(); 원하는 답이 이게 아니었음 ㅋㅋ; */
		
		for(int i = 2 ; i <= 9 ; i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				System.out.printf("%2d x %2d=%2d", i , j , i*j);
			}
			System.out.println();
		}
		
		
		
		//문4) 2 x 1 = 2  3 x 1 = 3 ... 9 x 1 = 9
		//
		//	  2 x 9 = 19               9 x 9 = 81 
		System.out.println("-----------------------");
	/*	int c = 1;
		int d = 9;
		for(int i = 2 ; i <= 9 ; i++) {
			System.out.print(i + " x " + c + " = " + c*i + " / ");}
		System.out.println();
		System.out.println();
		for(int j = 2 ; j <= 9 ; j++) {
			System.out.print(j + " x " + d + " = " + d*j + " / ");} */
		for(int i = 1 ; i <= 9 ; i++) {
			for(int j = 2 ; j <= 9 ; j++) {
				System.out.printf(j + " x " + i + " = " + i*j + " / ");
			}
			System.out.println();
		}

	}//end main

}//end class
