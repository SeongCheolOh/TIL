package javaCh17.sec12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;


public class CollectEx01 {

	public static void main(String[] args) {
		// p.761
		
		List<Student> totalList = new ArrayList<Student>();
		totalList.add(new Student("ȫ�浿", "��", 92));
		totalList.add(new Student("�����", "��", 87));
		totalList.add(new Student("���ڹ�", "��", 95));
		totalList.add(new Student("���ؿ�", "��", 93));
		
		//���л��� ���� list ����
		List<Student> maleList = totalList.stream()
											.filter(s->s.getSex().equals("��"))
											.collect(Collectors.toList());
		for(Student s : maleList) {
			System.out.println(s.getName()+" "+s.getSex());
		}
		
		//������ 90�� �̻��� ����� �̾Ƽ� set ����
		Set<Student> upto90 = totalList.stream()
				.filter(s->s.getScore()>=90)
				.collect(Collectors.toSet());
		for(Student s : upto90) {
			System.out.println(s.getName()+ " "+s.getScore());
		}
		
		//Map - Ű �л��̸�, �� - Student ��ü
		Map<String, Integer> map 
				= totalList.stream()
						   .collect(Collectors.toMap(s->s.getName(), s->s.getScore()));
		System.out.println(map);
		Set<String> keySets = map.keySet();
		Iterator<String> it = keySets.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " " + map.get(key));
		}
		
		//Ű - ���ڹ� // �� - �� 95 // entrySet ����ؼ�
		Map<String, Student> map2 = totalList.stream()
											.collect(Collectors.toMap(s->s.getName(), s->s));
		System.out.println(map2);
		Set<Entry<String, Student>> es = map2.entrySet();
		Iterator<Entry<String, Student>> it2 = es.iterator();
		while(it2.hasNext()) {
			Entry<String, Student> itt = it2.next();
			System.out.println(itt.getKey()+" "+itt.getValue().getSex()+" "+itt.getValue().getScore());
		}
	}

}
