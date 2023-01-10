package ch02.sec06;

public class StringExample {

	public static void main(String[] args) {
		// 문자열 타입
		
		// 작은따옴표 ' '로 감싼건 유니코드 char
		// 큰따옴표 " " 로 감싼건 문자열 String // ★   S 꼭 대문자
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		//문자열 내부에 이스케이프 문자 사용 가능
/*	★	\" = 큰따옴표 입력      
	★	\' = 작은따옴표 입력    
	★	\\ = 역슬래쉬 입력	    
	★	\ u+16진수 = 유니코드   
	★	\t = 탭(tab)만큼 띄움  
	★	\n = 줄바꿈    		
	★	\r = 캐리지 리턴  */
		
		String str = "나는 \"자바\"를 배웁니다";
		System.out.println(str);
		
		str = "번호\t이름\t직업";
		System.out.println(str);
		
		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다.\n");
		
		System.out.println("나는 \n자바를 \n배웁니다.");
		

	}

}
