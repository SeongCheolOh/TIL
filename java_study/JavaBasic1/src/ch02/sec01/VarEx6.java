package ch02.sec01;

import java.util.Scanner;

public class VarEx6 {

	public static void main(String[] args) {
		// 이름, 출생년도 입력하면 나이를 출력하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------");
		System.out.println("나이 계산하는 프로그램");
		System.out.println("-------------");
		System.out.println("이름==>");
		String name = sc.next();
		System.out.println("출생년도(4자리)==>");
		int birthYear = sc.nextInt();
		int age = 2023 - birthYear;
		
		System.out.println(name + "의 나이는 " + age + "세 입니다.");
		//조건 - 나이 = 0~7살은 유아 / 8~13살 어린이 / 14~19살 청소년 / 20~60 장년 / 61~노년
		
		if (0 <= age && age <= 7)
		System.out.println("유아");
		else if (8 <= age && age <= 13)
		System.out.println("어린이");
		else if (14 <= age && age <= 19)
		System.out.println("청소년");
		else if (20 <= age && age <= 60)
		System.out.println("장년");
		else if (61 < age)
		System.out.println("노년");
		
		/*조건)
		 * 유아인 경우는 지원금 100만원을 받으세요
		 * 어린이인 경우는 지원금 50만원을 받으세요
		 * 청소년인 경우는 지원금 20만원을 받으세요
		 * 노인인 경우는 지원금 30만원을 받으세요
		 * 장년인 경우는 지원금 20만원을 내세요
		 */
				
		// 내가 짠 코드
		/*  if ("유아")
				System.out.println("100만원 지급받으세요");
			if ("어린이")
				System.out.println("50만원 지급받으세요");
			if ("청소년")
				System.out.println("20만원 지급받으세요");
			if ("장년")
				System.out.println("20만원 지불하세요");
			if ("노년")
				System.out.println("30만원 지급받으세요"); >> if 안 내용이 부족하다 */
		
		//다른 사람들이 짠 코드
		if (21 <= age && age <= 60)
			System.out.println("장년");
			System.out.println("100만원 지급받으세요"); 
			//> 56번 줄은 if와는 관계가 없이 출력이 된다
			// 그래서 두 줄을 {}로 묶어준다
			if (0 <= age && age <= 7) {
				System.out.println("유아");
				System.out.println("100만원 지급받으세요");} 
			else if (8 <= age && age <= 13) {
				System.out.println("어린이");
				System.out.println("50만원 지급받으세요");} 
			else if (14 <= age && age <= 19) {
				System.out.println("청소년");
				System.out.println("20만원 지급받으세요");} 
			else if (20 <= age && age <= 60) {
				System.out.println("장년");
				System.out.println("20만원 지블하세요");} 
			else {
				System.out.println("노년");
				System.out.println("30만원 지급받으세요");} 

			// age type : 나이별 타입(유아, 어린이, ...) subsidy=100 // 지원금
		
		String ageType = null; // 나이별 타입 // null=아직 변수에 값을 대입하지 않았다
		double subsidy = 0; // 지원금
		if (0 <= age && age <= 7) {
			ageType="유아";
			subsidy=100;}
	    else if (8 <= age && age <= 13) {
			ageType="어린이";
			subsidy=50;}
		else if (14 <= age && age <= 19) {
			ageType="청소년";
			subsidy=20;}
		else if (20 <= age && age <= 60) {
			ageType="장년";
			subsidy=-20;}
		else {
			ageType="노인";
			subsidy=20;
		}
		if (subsidy>=0)
			System.out.println("당신은 " +ageType +"입니다. 정부 지원금 " + subsidy + " 만원을 받으세요");
		else 
			System.out.println("당신은 " +ageType +"입니다. 정부 지원금 " + Math.abs(subsidy) + " 만원을 내세요");
		
		// ageType "장년"이면 내세요 라고 출력하게 만들기
		// 문자열이 같다는 변수명 .equals("문자열") >> ageType.equals("어른")
		if (ageType.equals("장년"))
			System.out.println("당신은 " +ageType +"입니다. 정부 지원금 " + Math.abs(subsidy) + " 만원을 내세요");
		else 
			System.out.println("당신은 " +ageType +"입니다. 정부 지원금 " + subsidy + " 만원을 받으세요");
		
		//(어른과 노인만 대상)집이 있습니까 Y= true / N= false
		//집이 있는 사람은 10% 추가 지출
		//노인이 집이 있으면 10% 덜 받기

		/* 내가 쓴 코드
		 * Scanner sc1 = new Scanner(System.in);
		 * String name1 = sc1.next();
		 * System.out.println("집이 있습니까?==>(yes 또는 no 로 대답하시오)");*/
		boolean houseOx = false; //집 유무 변수
		if(ageType.equals("장년")||ageType.equals("노년")) {
			System.out.println("집이 있으면 ture, 없으면 false 입력해 주세요");
			houseOx=sc.nextBoolean();}
			
		
			if(ageType.equals("장년")&&houseOx){  // 장년이고 집이 있으면
				subsidy= subsidy + (int)subsidy *0.1;}
			else if(ageType.equals("노인") && houseOx) {  // 장년이고 집이 있으면
				subsidy = subsidy - (int)subsidy *0.1;}
				
			
			
			if (subsidy>=0)
				System.out.println("111당신은 " +ageType +"입니다. 정부 지원금 " + subsidy + " 만원을 받으세요");
			else 
				System.out.println("111당신은 " +ageType +"입니다. 정부 지원금 " + Math.abs(subsidy) + " 만원을 내세요");
			
			if (ageType.equals("장년"))
				System.out.println("222당신은 " +ageType +"입니다. 정부 지원금 " + Math.abs(subsidy) + " 만원을 내세요");
			else 
				System.out.println("222당신은 " +ageType +"입니다. 정부 지원금 " + subsidy + " 만원을 받으세요");
		
		
	}

}
