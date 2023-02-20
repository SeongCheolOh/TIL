package checkEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Ex10 {

	public static void main(String[] args) {
		
		//TreeSet에 Ex10Class 객체를 저장할 때, score 필드값을 기준으로 자동정렬되도록 구현하고싶음
		//TreeSet의 last() 메소드를 호출했을 때 가장 높은 score의 Ex10class 객체가 리턴되도록 class에 코드 작성
		
		TreeSet<Ex10class> tS = new TreeSet<Ex10class>();
		tS.add(new Ex10class("blue", 96));
		tS.add(new Ex10class("hong", 86));
		tS.add(new Ex10class("white", 92));
		
		Ex10class ec = tS.last();
		System.out.println("최고 점수 : " + ec.score);
		System.out.println("최고 점수를 받은 아이디 : " + ec.id);

		TreeSet<Ex10class2> tS2 = new TreeSet<Ex10class2>(new Ex10class2Comparator());
		tS2.add(new Ex10class2("blue", 96));
		tS2.add(new Ex10class2("hong", 86));
		tS2.add(new Ex10class2("white", 92));
		
		Ex10class2 ec2 = tS2.first();
		System.out.println("최저 점수 : " + ec2.getScore());
		System.out.println("최저 점수를 받은 아이디 : " + ec2.getId());
		
		int[]a = new int[5];
		a[0] = 10;
		
		int [] a2 = {1,2,3};
		List<Integer> list = new ArrayList<Integer>();
		list.add(a2[0]);
		list.add(a2[1]);
		list.add(a2[2]);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		List list2 = Arrays.asList(10,20,30,40,50);
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));
		System.out.println(list2.get(3));
		System.out.println(list2.get(4));
		
		//문자열 배열 5개 이름 넣기
		//1단계 배열만들고 값을 넣는다
		//2단계 ArrayList 만든다
		//3단계 ArrayList 안의 배열 값을 모두 add한다
		List list3 = Arrays.asList("홍길동","정현희","이명수","최진영","이순신");
		
		//김경미 있나요? > n
		if(list3.contains("김경미")) {
			System.out.println("있습니다");
		}else {
			System.out.println("없습니다");
		}
	}

}
