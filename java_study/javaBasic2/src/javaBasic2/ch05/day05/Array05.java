package javaBasic2.ch05.day05;

public class Array05 {

	public static void main(String[] args) {
		// 다차원 배열
		int[][] a = new int[2][3];//[행][렬]개념 >> 2행3렬짜리 객체 생성 
		a[0][0] = 5;       //[5][  ][ ]
		a[1][1] = 10;      //[ ][10][ ]
		
		int[][] b = { {1,2,3}, {4,5,6} };
		//[1][2][3]
		//[4][5][6]
		
		int[][] c = {{4,3}, {5,7}};
		//[4][3]
		//[5][7]
		
		int[][] d = {{1,2,3,4},{5,6,7,8}};
		//[1][2][3][4]
		//[5][6][7][8]
		
		String[][] e = {{"a","b","c"},{"d","e","f"},{"g","h","i"}};
		//[a][b][c]
		//[d][e][f]
		//[g][h][i]
		
		int[][][] f = {  { {1},{2} }  ,  { {3},{4} }  ,  { {5},{6} }  };
		
		//bb의 배열 모습을 new
		
		int[][] bb = new int[2][3];
		int[][] cc = new int[2][2];
		int[][] dd = new int[2][4];
		String[][] ee = new String[3][3];
		int[][][] ff = new int[3][2][1];
		
		//출력하기
		//b배열 출력
		System.out.println(b[0][0] + " " + b[0][1] + " " + b[0][2] );
		System.out.println(b[1][0] + " " + b[1][1] + " " + b[1][2] );

		//e배열 출력
	/*	System.out.println(e[0][0][0] + " " + e[0][0][1] + " " + e[0][0][2] );
		System.out.println(e[1][0] + " " + e[1][1] + " " + e[1][2] );
		System.out.println(e[1][0] + " " + e[1][1] + " " + e[1][2] ); */
		
		//f배열 출력
		System.out.println(f[0][0][0]);
		System.out.println(f[0][1][0]);
	}

}
