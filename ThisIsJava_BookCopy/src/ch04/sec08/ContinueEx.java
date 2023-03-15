package ch04.sec08;

public class ContinueEx {

	public static void main(String[] args) {
		// 반복문인 for, while, do-while에만 사용되는데
		// continue 아래로는 실행이 안 되고 바로 조건문으로 올라간다
		for(int i = 1; i<=10; i++) {
			if(i%2 !=0) {//i/2의 나머지가 0이 아닌, 즉 홀수인 경우
				continue;//조건문으로 바로 올라간다
			}System.out.println(i);
		}

	}

}
