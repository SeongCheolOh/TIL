package javaHeight02.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PracticeEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Practice> list = new ArrayList<Practice>();
		Practice prtc = new Practice(null, null, null, 0, 0, null);
		
		//입력
		list.add(new Practice("4/3", "BC103", "강남구", 230, 276000, "3470-1234"));
		list.add(new Practice("4/5", "BL203", "서초구", 150, 180000, "3470-2200"));
		list.add(new Practice("4/8", "AC205", "송파구", 270, 324000, "3470-3300"));
		list.add(new Practice("4/12", "DU103", "용산구", 350, 420000, "3709-4321"));
		
		//출력
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
			System.out.println("-----------------");
			System.out.print(list.get(i).getDate());
			System.out.print(list.get(i).getCode());
			System.out.print(list.get(i).getArea());
			System.out.print(list.get(i).getSellCnt());
			System.out.print(list.get(i).getSaleAmout());
			System.out.println(list.get(i).getCallNum());
			System.out.println("=================");
		}
		
		//거래처 코드를 입력하면 매출 지역과 연락처를 출력하세요
		System.out.print("찾으실 거래처의 코드를 입력하세요 > ");
		String searchCode = sc.next();
		for(int i = 0 ; i < list.size(); i++) {
			if(list.get(i).getCode().equals(searchCode)){
				System.out.print(list.get(i).getArea());
				System.out.println(list.get(i).getCallNum());
			}
		}System.out.println("==================");
	
		//매출액이 가장 높은 거래처 코드를 출력하세요
		int max = 0;
		int maxIndex = 0;//매출액이 제일 높은 거래처의 인덱스 입력
		for(int i = 0 ; i < list.size(); i++) {
				if(list.get(i).getSaleAmout() > max) {
					max = list.get(i).getSaleAmout();
					maxIndex = i;
			}
		}
		System.out.println("최대 매출을 발생시킨 "+ list.get(maxIndex).getCode() + "(은)는 " + max + "원을 판매하였습니다 ");
		System.out.println("================");
		
		//매출액이 가장 낮은날의 매출일자, 거래처 코드, 판매량을 출력하세요
		int min = 999999999;
		int minIndex = 0;//매출액이 제일 높은 거래처의 인덱스 입력
		for(int i = 0 ; i < list.size(); i++) {
				if(list.get(i).getSaleAmout() < min) {
					min = list.get(i).getSaleAmout();
					minIndex = i;
			}
		}System.out.println("가장 매출이 낮은 날짜는 "+ list.get(minIndex).getDate());
		System.out.println("가장 매출이 낮은 거래처 코드는 "+ list.get(minIndex).getCode());
		System.out.println("가장 매출이 낮은 판매량은 "+ list.get(minIndex).getSellCnt());
		
	}

}
