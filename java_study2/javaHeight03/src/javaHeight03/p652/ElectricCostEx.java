package javaHeight03.p652;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ElectricCostEx {

	public static void main(String[] args) {
		
		//호수 입력하면 전기사용량이 나오게 출력하기
		Set<ElectricCost> ecSet = new HashSet<ElectricCost>();
		ecSet.add(new ElectricCost("502", 1, 423, 25000));
		ecSet.add(new ElectricCost("303", 7, 724, 35000));
		ecSet.add(new ElectricCost("403", 2, 222, 40000));
		ecSet.add(new ElectricCost("503", 2, 483, 25000));
		ecSet.add(new ElectricCost("503", 3, 171, 35000));
		
		System.out.println("set 안에 들어있는 요소는 " + ecSet.size());
		System.out.println("---------------------");
		
		//전체 출력
		Iterator<ElectricCost> itEC= ecSet.iterator();
		while(itEC.hasNext()) {
			ElectricCost ecAddr = itEC.next();
			System.out.println(ecAddr.get호수()+" "+ecAddr.get가족수()+" "+ecAddr.get전기사용량()+" "+ecAddr.get공동요금());
		}System.out.println("---------------------");

		//전기사용량이 제일 많은 가구를 찾아서 호수와 가족수를 출력
		int topRate = 0;
		itEC= ecSet.iterator();
		while(itEC.hasNext()) {
			ElectricCost ecAddr = itEC.next();
			if(topRate < ecAddr.get전기사용량()) {
				topRate = ecAddr.get전기사용량();
			System.out.println("가장 전기사용량이 많은 집의 호수는 "+ecAddr.get호수()+", 가족수는 "+ ecAddr.get가족수());
			}
		}System.out.println("---------------------");
		
		//공동요금이 제일 적게 나온 호수를 찾아서 500원 추가
		itEC= ecSet.iterator();
		int minCost = 99999999;
		while(itEC.hasNext()) {
			ElectricCost ecAddr = itEC.next();
			if(minCost > ecAddr.get공동요금()) {
				minCost = ecAddr.get공동요금();
			System.out.println("가장 공동요금이 적은 호수는 "+ecAddr.get호수());
			}
				
		}System.out.println("---------------------");

		//전기사용량의 평균, 공동요금의 평균을 구해서 전체 출력할 때 아래부분에 추가
		int 공동요금합 = 0;
		int 공동요금평균 = 0;
		int 전기사용량합 = 0;
		int 전기사용량평균 = 0;
		itEC= ecSet.iterator();
		while(itEC.hasNext()) {
			ElectricCost ecAddr = itEC.next();
			공동요금합 += ecAddr.get공동요금();
			전기사용량합 += ecAddr.get전기사용량();
		}공동요금평균 = 공동요금합/ecSet.size();
		전기사용량평균 = 전기사용량합/ecSet.size();
		System.out.println("공동요금 총 합은 " + 공동요금합 + "원 입니다");
		System.out.println("평균 공동요금은 " + 공동요금평균 + "원 입니다");
		System.out.println("전기사용량 총 합은 " + 전기사용량합 + " 입니다");
		System.out.println("평균 전기사용량은 " + 전기사용량평균 + " 입니다");
		System.out.println("---------------------");
			
			
		//호수 입력하면 전기사용량이 나오게 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("검색하실 호수를 입력하세요 > ");
		String 호수 = sc.next();
		itEC= ecSet.iterator();
		while(itEC.hasNext()) {
			ElectricCost ecAddr = itEC.next();
			if(ecAddr.get호수().equals(호수)) {
				System.out.println(호수+"의 전기사용량은 " +ecAddr.전기사용량+" 입니다");
			}
		}
		
	}

}
