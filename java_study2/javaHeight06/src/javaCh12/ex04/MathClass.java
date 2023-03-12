package javaCh12.ex04;

import java.util.Random;

public class MathClass {

	public static void main(String[] args) {
		//p.528 수학 클래스
		double v1 = Math.ceil(5.3);
		double v2 = Math.PI;
		System.out.println(v1+", "+v2);
		
		double v3 = Math.max(1.1, 2.2);// 2개 중 큰 것
		System.out.println(v3);
		System.out.println(Math.random());//랜덤숫자
		double v4 = Math.round(v3);//반올림
		System.out.println(v4);
		
		
		//난수(규칙이 없는 숫자)를 얻는 것 - 소프트웨어 키, 비밀번호 암호화/복호화
		//1) math.random()
		//2) util - random 클래스 이용
		Random rd = new Random();
		System.out.println(rd.nextBoolean());//true 또는 false가 랜덤 출력
		System.out.println(rd.nextLong());//Long 범위의 랜덤숫자 출력
		System.out.println(rd.nextInt(10));//10이하(종자값)
	}

}
