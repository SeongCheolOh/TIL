package javaBasic2.ch05.day02;

import java.util.Scanner;

public class ProjectEx01 {

	public static void main(String[] args) {
		// 실습
		//1) 변수에 직접 넣는 방법
		//	클래스의 필드에 직접 값을 넣어준다
		//	여기서 아래의 class랑 연결을 해야 stack에 올라감
		//  	객체 생성(인스턴스화) = heap 메모리에 해당 클래스를 올려준다
		//				  인스턴스 = heap 메모리에 올라가있는 상태
		
		SideDish product = new SideDish();
		inputM(product);		
		SideDish product1 = new SideDish();
		inputM(product1);		
		SideDish product2 = new SideDish();
		inputM(product2);

		//남은 갯수 구하기
		product.otherCnt = product.otherCntMethod(product.makeCnt, product.saleCnt);
		product1.otherCnt = product1.otherCntMethod(product1.makeCnt, product1.saleCnt);
		product2.otherCnt = product2.otherCntMethod(product2.makeCnt, product2.saleCnt);
		//판매율 구하기
		product.saleRate = product.saleRateMethod(product.saleCnt, product.makeCnt);
		product1.saleRate = product1.saleRateMethod(product1.saleCnt, product1.makeCnt);
		product2.saleRate = product2.saleRateMethod(product2.saleCnt, product2.makeCnt);
		
		System.out.println("출력하기");
		System.out.println("[반찬종류] [만든갯수] [팔은갯수] [남은갯수] [판매율]");

		System.out.println(product.kind + " " + product.makeCnt + " " +product.saleCnt + " " +product.otherCnt + " " + product.saleRate);
		System.out.println(product1.kind + " " + product1.makeCnt + " " +product1.saleCnt + " " +product1.otherCnt + " " + product1.saleRate);
		System.out.println(product2.kind + " " + product2.makeCnt + " " +product2.saleCnt + " " +product2.otherCnt + " " + product2.saleRate);
		
		product.bestPickMethod(product, product1, product2) ;
		if(product.saleRate >= product1.saleRate && product.saleRate>=product2.saleRate) {
			System.out.println("제일 잘 팔린 반찬은 >" + product.kind);
		}else if(product1.saleRate >= product.saleRate && product1.saleRate>=product2.saleRate) {
			System.out.println("제일 잘 팔린 반찬은 >" + product1.kind);
		}else if(product2.saleRate >= product.saleRate && product2.saleRate>=product1.saleRate) {
			System.out.println("제일 잘 팔린 반찬은 >" + product2.kind);
		}
		
		product.worstPickMethod(product,product1,product2);
		if(product.saleRate <= product1.saleRate && product.saleRate<=product2.saleRate) {
			System.out.println("제일 안 팔린 반찬은 >" + product.kind);
		}else if(product1.saleRate <= product.saleRate && product1.saleRate<=product2.saleRate) {
			System.out.println("제일 안 팔린 반찬은 >" + product1.kind);
		}else if(product2.saleRate <= product.saleRate && product2.saleRate<=product1.saleRate) {
			System.out.println("제일 안 팔린 반찬은 >" + product2.kind);
		}
		
	}//end main

	static void inputM(SideDish product) {
		System.out.println("-----------------");
		System.out.println("반찬가게 판매량 조사");
		System.out.println("-----------------");
		System.out.println();
		System.out.println("입력화면");

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("반찬 종류>");
		product.kind = sc.next();
		System.out.print("만든 갯수>");
		product.makeCnt = sc.nextInt();
		System.out.print("팔은 갯수>");
		product.saleCnt = sc.nextInt();
		System.out.print("남은 갯수>");
		product.otherCnt = sc.nextInt();
		
	}
}//end class

class SideDish{
	
	//필드(field)
	String kind; // 반찬 종류
	int makeCnt; // 만든 갯수
	int saleCnt; // 팔은 갯수
	int otherCnt; // 남은 갯수
	double saleRate; // 판매율
	
	//메소드(method)
	int otherCntMethod ( int makeCnt, int saleCnt) {//남은 갯수 구하는 메소드
		int otherCnt = makeCnt - saleCnt;
		return otherCnt;
	}
	double saleRateMethod ( double makeCnt , double saleCnt) {
		double saleRate =  makeCnt/saleCnt;
		return saleRate;
	}
	String bestPickMethod (SideDish saleRate, SideDish saleRate1, SideDish saleRate2) { 

		
		return null;
	}
	String worstPickMethod (SideDish saleRate, SideDish saleRate1, SideDish saleRate2) {


		return null;
	}
}

// 생년월일 잘라서 년도 구하기 월 구하기 일 구하기