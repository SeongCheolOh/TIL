package javaBasic2.ch05.day02;

import java.util.Scanner;

public class ClassEx01 {

	public static void main(String[] args) {
		// 선물세트 판매
		// 필드 : 상품코드, 상품명, 가격, 갯수
		// 메소드 : 출력하기, 판매금액구하기 (가격* 갯수), 달성(판매금액이>=10만원이면 '잘함', 아니면 '노력'이라 출력
		
	/*	입력화면
		상품코드 >> AC-100
		상품명 >> 사과
		가격 >> 2000원
		갯수 >> 5개
		
		출력화면
		상품코드  상품명    가격      갯수    판매금액     달성
		AC-100  사과     2000원    5개    10000원     노력 
		proID   proName proPrice proCnt salePrice  attainMent
		
		메소드 1) 판매금액 구하기 - 가격, 갯수가 필요
							- 결과는 판매금액이 나와야 함
			 2) 달성 구하기 - 판매금액을 입력하고, 목표금액과 비교를 한다
			 			 - 결과는 잘함 또는 노력 */
		
	/*	ex)
		반찬가게
	필드	 String           int               int              int
		종류(kind)     만든갯수(makeCnt)  판매갯수(saleCnt)  남은갯수(otherCnt)
		조림류jorim          10개              5개             ?
		국류gook
		샐러드salad
	

		남은 갯수 구하고
		제일 잘 팔린 종류와 안팔린 종류 출력하기 */
		
		// 남은 갯수	int (saleCntMethod) =  (makeCnt - saleCnt)
		// 팔린 양 int saleJorim
		// 		 int saleGook
		//		 int saleSalad
		// 잘 팔린 종류 String saleResultMethod = (팔린 양)
		// 안 팔린 종류 String 
		
		//1) 변수에 직접 넣는 방법
		//	클래스의 필드에 직접 값을 넣어준다
		//	여기서 아래의 class랑 연결을 해야 stack에 올라감
		//  	객체 생성(인스턴스화) = heap 메모리에 해당 클래스를 올려준다
		//				  인스턴스 = heap 메모리에 올라가있는 상태
		
		Product product/*Java는 heap에 접근못하니까 변수 생성(stack) 후 인스턴스화 */ = new Product(); /*heap 메모리에 올라감, 주소가 생김*/
		//입력 담당하는 메소드
		Product product1 = new Product();//heap 에 객체 생성!!
		Product product2 = new Product();
		
		inputM(product);
		inputM(product1);
		inputM(product2);
		
		//판매금액 구하기
		int salePrice = product.salePriceMethod(product.proPrice, product.proCnt);
		
		//달성 구하기
		String attainMent = product.attainMentMethod(salePrice);
		
		System.out.println("출력하기");
		System.out.println("상품코드       상품명     가격      갯수    판매금액     달성");
		System.out.println(product.proID + " " +product.proName + " " +product.proPrice + " " + product.proCnt + " " + salePrice + " " + attainMent);
		
		//판매금액 구하기
		salePrice = product1.salePriceMethod(product1.proPrice, product1.proCnt);
				
		//달성 구하기
		attainMent = product.attainMentMethod(salePrice);
		System.out.println(product1.proID + " " +product1.proName + " " +product1.proPrice + " " + product1.proCnt + " " + salePrice + " " + attainMent);
		
		//판매금액 구하기
		salePrice = product2.salePriceMethod(product2.proPrice, product2.proCnt);
				
		//달성 구하기
		attainMent = product.attainMentMethod(salePrice);
		System.out.println(product2.proID + " " +product2.proName + " " +product2.proPrice + " " + product2.proCnt + " " + salePrice + " " + attainMent);
				
		
	}//end main
	static void inputM(Product product) {//객체 생성 후 변수가 주소가 됨
		//입력 담당
		System.out.println("-----------------");
		System.out.println("선물세트 판매");
		System.out.println("-----------------");
		System.out.println();
		System.out.println("입력화면");
		// 언제까지 입력할까? >> 3개까지 받기

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("상품코드>");
		product.proID = sc.next();
		System.out.print("상품명>");
		product.proName = sc.next();
		System.out.print("가격>");
		product.proPrice = sc.nextInt();
		System.out.print("갯수>");
		product.proCnt = sc.nextInt();
			
			
		
	}

}

class Product{
	String proID;
	String proName;
	int proPrice;
	int proCnt;
	
	int salePriceMethod(int proPrice, int proCnt) {//판매 금액 구하기
		int salePrice = proPrice * proCnt;
		return salePrice;
	}
	String attainMentMethod(int salePrice) {//달성 구하기
		if (salePrice >=100000)return "잘함";
		else return "노력";
	}
}