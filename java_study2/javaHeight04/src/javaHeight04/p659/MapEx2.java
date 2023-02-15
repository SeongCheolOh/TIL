package javaHeight04.p659;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx2 {

	public static void main(String[] args) {
		Map<String, Data2> shopMap2 = new HashMap<String, Data2>();
		
		KeySet kS1 = new KeySet("정현희", new Data2("3학년 1반", 30));
		KeySet kS2 = new KeySet("홍길동", new Data2("2학년 2반", 27));
		KeySet kS3 = new KeySet("이순신", new Data2("1학년 1반", 25));
		
		shopMap2.put(kS1.getTeacher(), kS1.getData2());
		shopMap2.put(kS2.getTeacher(), kS2.getData2());
		shopMap2.put(kS3.getTeacher(), kS3.getData2());
		
		Data2 kS1Addr = shopMap2.get(kS1.getTeacher());
		System.out.println("선생님 성함은 > " + kS1.getTeacher());
		System.out.println("선생님 담당 학년반 > " + kS1Addr.getGradeClass());
		System.out.println("선생님 담당 학생수 > " + kS1Addr.getStudentCnt());
		
		Data2 kS2Addr = shopMap2.get(kS2.getTeacher());
		System.out.println("선생님 성함은 > " + kS2.getTeacher());
		System.out.println("선생님 담당 학년반 > " + kS2Addr.getGradeClass());
		System.out.println("선생님 담당 학생수 > " + kS2Addr.getStudentCnt());
		
		//선생님 이름만 출력
		Set<String> keys = shopMap2.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//학교 선생님 인원수는?
		System.out.println(shopMap2.size());
		
		//선생님별로 학급인원 출력하기
		it = keys.iterator();
		while(it.hasNext()) {
			String addr = it.next();
			shopMap2.get(addr);//value가 출력 됨
			Data2 kSValue = shopMap2.get(addr);
			System.out.println("선생님 이름은 "+ addr);
			System.out.println("학년반은 " + kSValue.getGradeClass());
			System.out.println("학생수는 " + kSValue.getStudentCnt());
		}
	}

}
