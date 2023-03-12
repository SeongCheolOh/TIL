package javaCh12.ex04;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StringClass {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String data = "자바";
		byte[] arr1 = data.getBytes("UTF-8");
		
		System.out.println(Arrays.toString(arr1));
		
		String str1 = new String(arr1, "utf-8");
		System.out.println(str1);
		
		byte[] arr2 = data.getBytes("EUC-KR");
		System.out.println(Arrays.toString(arr2));
		
		String str2 = new String(arr2, "euc-kr");
		System.out.println(str2);

		//StringBuilder 클래스
		String data1 = "abc";
		data1 += "def";
		data1 += "ghi"; // 데이터가 수정되는 개념이 아닌, "abcdefghi" 객체를 새로 생성하는 것
		System.out.println(data1);
		//이전껀 버려지고(쓰레기 객체가 계속 생김), 새로운 객체가 계속 생성되는거라 효율 안좋음
		
		StringBuilder data2 = new StringBuilder("abc");
		data2.append("def");//객체를 수정(끝에 추가)
		System.out.println(data2);
		
		data2.insert(5,"kk");
		System.out.println(data2);//객체를 수정(삽입)
		//장점 >> 메모리 낭비가 없다
		//단점 >> 추가, 삭제할 때 시간이 비교적 더 소요됨
		
		//StringTokenizer 클래스
		//구분자로 잘라낼 때 사용
		//이용분야 >> 데이터베이스에서 자료 가지고 와서 자를 때 이용
		//			빅데이터에서 데이터를 덩어리로 가지고와 잘라 사용할때 이용
		
		String data3 = "하하&노홍철&박명수,유재석 정준하-길";
		//&을 구분자로 사용해서 각각 이름을 분리
		//방법1) String 클래스 이용하기
		String[] arr3 = data3.split("&|,| |-");
		for(String a3 : arr3) {
			System.out.println(a3);
		}System.out.println("----------");
		
		//방법2) StringTokenizer 클래스 이용하기
		String data4 = "하하&노홍철&박명수,유재석 정준하-길";
		//객체 생성
		StringTokenizer st4 = new StringTokenizer(data4,",|&| |-");//data4를 구분자 [,][&][ ][-] 으로 자르세요
		System.out.println("토큰의 갯수는 "+st4.countTokens());
		while(st4.hasMoreTokens()) {
			String token4 = st4.nextToken();
			System.out.println(token4);
		}System.out.println("-----------");
		
		//Wrapper(포장) 클래스 - 기본형을 클래스로 만들어둔 클래스를 칭한다
		//기본 자료형 int byte char long float double boolean
		//>>메소드가 없어 불편하다  / int 기본형을 클래스 만들어준것 메소드 만들어준것이 있다 - Integer
/*		int --> Integer 박싱
		integer --> int 언박싱 */
		
		Integer i = 100;//객체
		int iv = i.intValue();//언박싱
		System.out.println(i);
		System.out.println(iv);
		int ii = 200;
		Integer i1 = Integer.valueOf(ii);//박싱
		System.out.println(i1);
		//언박싱 해보기
		Double d = 3.4;
		double dub = d.doubleValue();
		System.out.println(dub);
		
		//박싱 해보기
		float f = 1.2f;
		Float fb = Float.valueOf(f);
		System.out.println(fb);
	}

}
