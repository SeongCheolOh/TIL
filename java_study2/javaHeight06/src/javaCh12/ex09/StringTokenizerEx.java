package javaCh12.ex09;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// 확인문제 11번
		// 아이디,이름,패스워드 분리시키기
		String a = "아이디,이름,패스워드";
		StringTokenizer b = new StringTokenizer(a,",");
		while(b.hasMoreTokens()) {
			String c = b.nextToken();
			System.out.println(c);
		}System.out.println("-----------");
		
		//StringTokenizer 안 쓰고 분리하기
		//String split(",");
		String[] s = a.split(",");
		for(String s1 : s) {
			System.out.println(s1);
		}

	}

}
