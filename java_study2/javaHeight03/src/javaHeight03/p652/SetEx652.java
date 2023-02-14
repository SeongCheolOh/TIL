package javaHeight03.p652;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx652 {

	public static void main(String[] args) {
		
		Set<Shop> shopSet = new HashSet<Shop>();
		shopSet.add(new Shop("이기쁨", "1234", 100));
		shopSet.add(new Shop("김행복", "2345", 90));
		shopSet.add(new Shop("박수진", "1467", 320));
		shopSet.add(new Shop("정기쁨", "1234", 100));
		shopSet.add(new Shop("최기쁨", "1234", 200));
		shopSet.add(new Shop("이기쁨", "1234", 300));
		shopSet.add(new Shop("이기쁨", "1234", 200));
		
		//전체 출력하기
		//전화번호와 이름이 같으면 동등객체로 판단
		System.out.println("set 안에 들어있는 요소는 > " + shopSet.size());
		Iterator<Shop> itS = shopSet.iterator();
		while(itS.hasNext()) {
			Shop shopAddr = itS.next();
			System.out.println(shopAddr.getCustName() +" "+ shopAddr.getCustPhone() +" "+ shopAddr.getPoint());
		}
		
		//이름과 전화번호 입력하면 포인트 나오게
		String searchName = "김행복";
		String searchPhone = "2345";
		//90이 출력되게 만들어보세요
		itS = shopSet.iterator();
		boolean searchOK = false;
		while(itS.hasNext()) {
			Shop shopAddr = itS.next();
			if(shopAddr.getCustName().equals(searchName) && shopAddr.getCustPhone().equals(searchPhone))
				System.out.println(shopAddr.getPoint());
			searchOK = true;
		}
		if(!searchOK)System.out.println(searchName+ "과 "+searchPhone+" 고객은 없습니다");
		
		
		
		Set<Member> memberSet = new HashSet<Member>();
		memberSet.add(new Member("홍길동", 30));
		memberSet.add(new Member("이순신", 25));
		memberSet.add(new Member("최기쁨", 10));
		memberSet.add(new Member("최기쁨", 10));
		System.out.println("set 안에 들어있는 요소는 > " + memberSet.size());
		
		Iterator<Member> it = memberSet.iterator();
		while(it.hasNext()) {
			Member memberAddr = it.next();
			System.out.println(memberAddr.getName() +" "+ memberAddr.getAge());
		}

		//강아지 15년, 고양이 10년, 토끼 7년, 닭 3년
		
		Set<Animal> animalSet = new HashSet<Animal>();
		animalSet.add(new Animal("강아지", 15));
		animalSet.add(new Animal("고양이", 10));
		animalSet.add(new Animal("토끼", 7));
		animalSet.add(new Animal("닭", 3));
		animalSet.add(new Animal("닭", 3));
		animalSet.add(new Animal("닭", 3));
		animalSet.add(new Animal("닭", 3));
		System.out.println("set 안에 들어이쓴 요소는 > " + animalSet.size());
		
		Iterator<Animal> itA = animalSet.iterator();
		while(itA.hasNext()) {
			Animal animalAddr = itA.next();
			System.out.println(animalAddr.getKind() +" "+ animalAddr.getLifeSpan());
		}
	}

}
