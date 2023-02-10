package javaHeight02.p641;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("홍길동");//0번 인덱스
		list1.add("이순신");//1번 인덱스
		list1.add("김유신");//2번 인덱스
		list1.add(1, "최영");//1번 인덱스에 "~"입력해라 >> 1번을 수정하는게 아닌 0번~1번 사이 삽입 개념이다
		
		for(int i = 0 ; i < list1.size() ; i++) {
			System.out.println(list1.get(i));	
		}
		
		//우리반에 홍길동이 있습니까?
		System.out.println(list1.contains("홍길동"));
		
		//전학 간 최영 삭제
		list1.remove(1);
		list1.remove("최영");
		//둘 다 가능하다
		System.out.println("-----------------");
		for(int i = 0 ; i < list1.size() ; i++) {
			System.out.println(list1.get(i));	
		}
		
		//김유신 지우기
		list1.remove(2);
		list1.remove("김유신");
		System.out.println("------------------");
		for(int i = 0 ; i < list1.size() ; i++) {
			System.out.println(list1.get(i));	
		}
		
		//전부 다 지우기
		list1.clear();
		System.out.println("------------------");
		for(int i = 0 ; i < list1.size() ; i++) {
			System.out.println(list1.get(i));	
		}
		System.out.println(list1.isEmpty());
		
	}

}
