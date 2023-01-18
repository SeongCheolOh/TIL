package javaBasic2.ch05.day05;

public class ArrayEx187p {

	public static void main(String[] args) {
		// p.187
		
		int[] oldIntArray = {1,2,3};
		
		int[] newIntArray = new int[5]; // [][][][][]
		newIntArray[0]= oldIntArray[0];
		newIntArray[1]= oldIntArray[1];
		newIntArray[2]= oldIntArray[2];
		
		for(int i = 0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i]; 
		}
		
		for(int n : newIntArray) {//향상된 for문
			System.out.print(n + " ");
		}System.out.println();
		
		//newIntArray 0,0자리에 4,5를 대입
		int[] old = {4,5};
		newIntArray[3] = old[0];
		newIntArray[4] = old[1];
		
		//배열의 크기는 나중에 변경할 수 없다. 그ㅐ서 큰 배열을 새로 만들고 다 옮겨주어야 한다.
		//이러한 단점을 없애주는 자료구조가 있다. 이것을 "컬렉션"(list) 이라고 한다. - 나중에 배움
		//배열 복사를 해주는 system 클래스가 있다.
		
		//새 10칸짜리 배열을 만들고, oldIntArray를 복사하기
		int[]newArr1= new int[10];
		System.arraycopy(oldIntArray, 0, newArr1, 0, 3);
						//옮길 배열, 시작인덱스, 옮겨질 배열, 시작인덱스, 옮길인덱스
		for(int i = 0; i<newArr1.length; i++) {
			System.out.print(newArr1[i]+ " ");
		}System.out.println();
		
		
		//ss배열을 만들어 초기값을 넣고, newSS배열을 만들어 복사,출력
		//10 25 30 35
		//>> 0 0 10 25 30 35 0
		int[] ss = {10,25,30,35};
		int[] newSS = new int[7];
		System.arraycopy(ss, 0, newSS, 2, ss.length);
		for(int i=0; i<newSS.length; i++) {
			System.out.print(newSS[i]+ " ");
		}
	}//end main

}//end class
