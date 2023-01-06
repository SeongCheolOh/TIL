package javaBasic1;

public class OperlandEx01 {

	public static void main(String[] args) {
		// 연산자1 // 교재3장
		//++a 전위 단항 연산자 
		//a-- 후위 단항 연산자
		
		int a=10;
		//11을 출력하세요
		System.out.println(a+1);
		a=a+1;
		System.out.println(a);
		System.out.println(11);
		//a++;
		//++a;
		System.out.println(a++);
		System.out.println(++a);
				
		
		int b= 10;
		//9를 출력하기
		System.out.println(9);
		System.out.println(b-1);
		b=b-1;
		System.out.println(b);
		//b--;
		//--b;
		System.out.println(b--);
		System.out.println(--b);
		
		b=++a; //a=a+1  b=a >> 11 11이 출력됨
		System.out.println(a + " " + b);
		b=a++; //b=a  a=a+1 >> 10 11이 출력됨
		System.out.println(a + " " + b);
		
		int d=20;
		System.out.println(++d);//21 d=d+1 덧셈 후 d 출력
		System.out.println(d++);//d=d+1 출력 후 덧셈
		
		//연산자2
		//(a=a+1 a+=1)  // (a=a+2 a+=2)  // a=a+b = a+=b)
		int e=10;
		e=e-8;
		e-=8;
		System.out.println(e);
		
		//연산자3
		//나누기 // 25/5=5 // 25/4=6.25
		int v1=25;
		int v2=4;
		System.out.println(v1/v2); // 6이 나온다 >> 정수/정수=정수 >> 실수/실수=실수로 바꿔야함
		//Q1) 자료형을 실수로 바꾸기
		System.out.println(v1/(double)v2);
		//Q2) 자료형은 정수 그대로, 2500/400=6.25 를 구하고 6.25*100을 출력한다
		v1=v1*100;
		//= v1*=100;
		System.out.println(v1/(double)v2/100);
		
		// 우측 쉬프트 연산자 >>, >>>
		// 좌측 쉬프트 연산자 <<, <<<
		int v3= 0b1011; // 10진수 변환 >> 11
		v3 = v3<<2; // 화살표 방향으로 2bit 밀어준다 >> 0b1011을 좌측으로 0b101100 = 44
		System.out.println(v3);
		int v4= 0b1111;
		v4 = v4>>3; // 우측으로 3bit 밀기(2^3승 나누기) >> 15/2의3승 *단 정수로 출력 됨
		System.out.println((double)v4);
		
		//관계연산자 >초과 >=이상 <미만 <=이하 ==같다 !=같지않다
		int v5= 100;
		System.out.println(v5>=200);
		
		//비트 연산자 이용 - 과학, 전자분야에서 주로 사용
		int v6 = 0b01011; // 1 true 0 false
		int v7 = 0b10111;
		System.out.println(v6 & v7); // =0b00011=3
		System.out.println(Integer.toBinaryString(v6 & v7)); //= 00011
		System.out.println(Integer.toBinaryString(v6 | v7)); //= 11111
		System.out.println(Integer.toBinaryString(v6 ^ v7)); //= 11100
		
		//대입연산자 = >>우변과 좌변이 같다가 아닌, 우변을 좌변에 대입해라
		int v8=200;
		
		//삼항연산자 >>(조건) ? 참:거짓; >> 조건이 true면 참의 값, false면 거짓값을 출력
		int v9 = 10;
		System.out.println((v9==10)?"합격" : "불합격");
		
		String type="A";
		String result;
		result = (type.equals("A"))?"vip고객입니다":"일반고객입니다";
		System.out.println(result);
		
		//문제) 숫자 변수에 50을 입력하고 25이상이면 "포인트 적립 대상" 아니면 "포인트 적립 대상 아님"
		int point=50;
		System.out.println((25<=point)?"포인트적립대상":"포인트적립대상아님");

		//문제) 문자형 변수에 "자바"라고 입력하고, 자바가 아니면 B교실,C교실 입니다 // 자바이면 A교실 입니다
		String word="자바";
		String result1;
		result1=(word.equals("자바")?"A교실입니다":"B,C교실입니다");
		System.out.println(result1);
		
		//문제) 숫자 2개를 입력받아서 큰 숫자를 삼항연산자 사용하여 출력하기 

		//문제) 숫자 3개를 입력받아서 큰 숫자를 삼항연산자 사용하여 출력하기
		
		//진도는 3장까지 나감
		//숙제로 git에 업로드
		//email 전송 hee0075@hanmail.net [이름] git주소
		//제목: 웹개발자B반 [이름]
		/* 1. 전공 : 없음
		 * 2. 2022년 했던 분야 : 
		 * 3. 수강목적 : 1차 취업
		 * 4. 이해도 : 70%
		 * 5. 실습하는 것 : 50%(본인 스스로 완성하는 경우)
		 * 6. 수업 속도 : 빠름
		 * 7. 하고싶은 말 :
		 * 8. 깃주소: https://github.com/SeongCheolOh/TIL.git
		 */
		
		
		
	}

}
