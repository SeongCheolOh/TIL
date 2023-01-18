package ch05.sec09;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		// 배열 복사
		
		//배열은 한번 생성하면 길이를 변경할 수 없다
		//더 많은 공간이 필요하다면, 큰 배열을 새로 만들고 거기에 값을 복사해야 한다
		
		//길이 3인 배열
		int[]a = {1,2,3};
		
		//길이 5인 배열 생성
		int[]b = new int[5];
		
		//복사
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];
		}
		
		//출력
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		//좀 더 간단한 방법 System.arraycopy();메소드 활용
		//System.arraycopy(기존 배열, 의 시작인덱스, new 배열, 의 시작 인덱스, 항목 수);
		System.arraycopy(a, 0, b, 0, a.length);
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}

	}

}
