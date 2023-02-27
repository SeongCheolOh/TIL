package javaCh12.ex09;

import java.io.UnsupportedEncodingException;

public class DecodingEx {

	public static void main(String[] args) {
		// 확인문제 9번
		//utf-8 문자셋으로 인코딩한 데이터를 문자열로 디코딩해서 변수 data에 저장하려고 함
		
		byte[] bytes = {-20, -107, -120, -21, -123, -107};
		String str;
		try {
			str = new String(bytes, "utf-8");
			System.out.println("str: " + str);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//바이트 배열을 String 객체로 만들기
		//1) bytes객체에서 찾아보기>>Byte.___ 중 (byte[]):String으로 나오는걸 찾기 >> 없음
		//2) String 객체에서 찾아보기>>String._____(byte[]):String
		//3) new String~~해서 객체 생성
		
		

	}

}
