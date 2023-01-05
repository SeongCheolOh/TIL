package ch02.sec01;

import java.util.Scanner;

public class VarEx2 {

	public static void main(String[] args) {
		char aWord='a'; //97-?=65
		System.out.println((char)(aWord - 32));
		
		// 문제 대문자 k를 변수로 넣기 >> 소문자 s를 출력하기
		char kWord='K';
		System.out.println((char)(kWord+40));
		
		// 문제)나의 이름의 유니코드 숫자 알아보기
		char name1='오';
		char name2='성';
		char name3='철';
		System.out.println((int)(name1)+ " "+ (int)name2+ " "+ (int)(name3));
		
		//여러글자 문자열 "" 문자열 객체인 string을 사용
		String name="오성철"; //1 3바이트 2 6바이트 3 9바이트
		
		String hakbun="220221"; //문자열 >> 정수로 바꾸기
	    System.out.println(Integer.valueOf(hakbun)); // 1byte = 8bit

	    //위의 학번의 다음 사람의 학번을 구하시오
	    int hakbun1 = 221208;
	    // System.out.println("다음 사람의 학번을 구하시오")
	    
	    
	    
	    String avgS = "52.3"; // 52.2 + 100 = 152.2
	    //문자열은 계산되지 않으니 문자열을 실수형으로 치환 필요.
	    //and +100 후 출력
	    //
	    float convAvg=Float.parseFloat(avgS); //"52.3" --> 52.3
	    convAvg = convAvg + 100;
	    System.out.println(convAvg);
	    
	    double convAvg1 = Double.parseDouble(avgS);
	    convAvg1 = convAvg1 + 100;
	    System.out.println(convAvg1+"~~");

	    
	    String 성별="false"; // "true" >> true
	    					// "false" >> false
	    //문자열 "true"를 불린형(논리)으로 변환하세요
	    boolean 변환한성별 = Boolean.parseBoolean(성별);
	    System.out.println(변환한성별);
	    if (변환한성별)
	    	System.out.println("남자");
	    else
	    	System.out.println("여자");
	    
	    //자동타입변환
	    byte v1=10; //1byte
	    int v2=20; //4byte
	    
	    v2= v1; //v2=10 byte형의 값이 int형으로 들어간다
	            //작은곳 >> 큰 곳으로 들어가니까 오류 없음
	    
	    //강제형 변환
	    //v1 = v2; 	//v2의 값을 v1에 넣는다
	      		 	//int형이 byte형으로 들어간다
	    			//큰 값이 작은값으로 들어가서 오류
	    v1=(byte)v2;
	    
	    int v3=50; //정수형
	    double v4=10.0; //8byte 실수형
	    float v5=20.5f; //4byte 실수형
	    
	    v4 = v3;
	    v4 = v5;
	    //오류 v3 = v4;
	    v3 = (int)v4;
	    //오류 v3 = v5;
	    v3 = (int)v5;
	    //오류 v5 = v4;
	    v5 = (float)v4;
	    
	    //문제) 숫자2개를 입력받아서 사칙연산 해 보시오
	    Scanner sc = new Scanner(System.in); //키보드 입력을 담당하는 Scanner class를 사용
	    
     /* int x = sc.nextInt();
        System.out.println("입력값" + x);
	    int y = sc.nextInt();
	    System.out.println("입력값" + y); */
	    
//	    //double형으로 실수 2개를 입력 받으세요
//	    double z = sc.nextDouble();
//	    System.out.println("실수입력값1" +z);
//	    double z1 = sc.nextDouble();
//	    System.out.println("실수입력값2" +z1);
	    
	    //boolean형 2개를 입력받으세요 입력은 true false로 해줍니다
//	    boolean b1 = sc.nextBoolean();
//	    System.out.println("불린형1 ==>" +b1);
//	    boolean b2 = sc.nextBoolean();
//	    System.out.println("불린형2 ==>" +b2);
	    
	    //문자열형 2개를 입력받으세요 입력은 "자바" "재미있다"로 해줍니다
	    //nextLine() - 입력받고 한줄 내림
	    //또는 next()을 사용하세요
	    String s1 = sc.nextLine();
	    System.out.println("문자형1==>" +s1);

	    String s2 = sc.nextLine();
	    System.out.println("문자형2==>" +s2);

	}

}
