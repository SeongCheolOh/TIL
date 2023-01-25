package javaBasic2.ch05.day05;

import java.util.Calendar;
import java.util.Scanner;

public class Library {
   
   
   
   public static void main(String[] args) {
      Book book = new Book();
      Scanner sc = new Scanner(System.in);
      boolean flage = true;
      
      while(flage) {
         System.out.println("-------------------------------------------------------------------");
         System.out.println("1. 신규 서적 등록 | 2. 대출 가능 여부 | 3. 대출 등록 | 4. 연체 도서 | 5. 종료");
         System.out.println("-------------------------------------------------------------------");
         System.out.print("선택 > ");
         String choice = sc.nextLine();
         
         switch(choice) {
            case "1": book.newBookM(); break;
            case "2": book.loanAvaM(); break;
            case "3": book.loanM(); break;
            case "4": book.overdue(); break;
            case "5": System.out.println("프로그램 종료"); flage = false; break;
            default: System.out.println("숫자를 잘못 입력하였습니다.");
         } 
      }


      
      

   }   
}



class Book{
   Calendar cal = Calendar.getInstance();
   // cal.add(Calendar.DATE, 2); 날짜 더하는 코드, 필요에 따라 지워도 상관 없음
   // CalculationDate(date, 0, 0, 1); String으로 더하는 코드, 필요에 따라 지워도 상관 없음
   
   int a; // 입고되는 책 수, 변동 가능 // x번째 책 이름 받는 필드
   String bName; // 책 제목 받는 필드
   String pName; // 대출자 성함
   String loanDate; // 대출일
   
   public void newBookM() {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("입고되는 책 수를 입력하세요 > ");
	   int a = sc.nextInt();
	   String[] b1 = new String[a]; // 책 이름 받을 배열 생성
	   for(int i = 0; i < a; i++) {
		   System.out.print(i+1 + "번째 책 제목 > ");
		   String bName = sc.next(); // 책 제목 입력
		   sc.nextLine();
	   } 
   } 
   
      public void loanAvaM() {
    	  System.out.println("찾고자 하는 책 제목을 입력하세요 > ");
    	  
    			    		  
    	  }
      
      public void loanM() {
         // TODO Auto-generated method stub
      }
      
      public void overdue() {
         // TODO Auto-generated method stub   
      }

}