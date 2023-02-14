package javaHeight03.p652;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx652 {

	public static void main(String[] args) {
		
		Set<Shop> shopSet = new HashSet<Shop>();
		shopSet.add(new Shop("�̱��", "1234", 100));
		shopSet.add(new Shop("���ູ", "2345", 90));
		shopSet.add(new Shop("�ڼ���", "1467", 320));
		shopSet.add(new Shop("�����", "1234", 100));
		shopSet.add(new Shop("�ֱ��", "1234", 200));
		shopSet.add(new Shop("�̱��", "1234", 300));
		shopSet.add(new Shop("�̱��", "1234", 200));
		
		//��ü ����ϱ�
		//��ȭ��ȣ�� �̸��� ������ ���ü�� �Ǵ�
		System.out.println("set �ȿ� ����ִ� ��Ҵ� > " + shopSet.size());
		Iterator<Shop> itS = shopSet.iterator();
		while(itS.hasNext()) {
			Shop shopAddr = itS.next();
			System.out.println(shopAddr.getCustName() +" "+ shopAddr.getCustPhone() +" "+ shopAddr.getPoint());
		}
		
		//�̸��� ��ȭ��ȣ �Է��ϸ� ����Ʈ ������
		String searchName = "���ູ";
		String searchPhone = "2345";
		//90�� ��µǰ� ��������
		itS = shopSet.iterator();
		boolean searchOK = false;
		while(itS.hasNext()) {
			Shop shopAddr = itS.next();
			if(shopAddr.getCustName().equals(searchName) && shopAddr.getCustPhone().equals(searchPhone))
				System.out.println(shopAddr.getPoint());
			searchOK = true;
		}
		if(!searchOK)System.out.println(searchName+ "�� "+searchPhone+" ���� �����ϴ�");
		
		
		
		Set<Member> memberSet = new HashSet<Member>();
		memberSet.add(new Member("ȫ�浿", 30));
		memberSet.add(new Member("�̼���", 25));
		memberSet.add(new Member("�ֱ��", 10));
		memberSet.add(new Member("�ֱ��", 10));
		System.out.println("set �ȿ� ����ִ� ��Ҵ� > " + memberSet.size());
		
		Iterator<Member> it = memberSet.iterator();
		while(it.hasNext()) {
			Member memberAddr = it.next();
			System.out.println(memberAddr.getName() +" "+ memberAddr.getAge());
		}

		//������ 15��, ����� 10��, �䳢 7��, �� 3��
		
		Set<Animal> animalSet = new HashSet<Animal>();
		animalSet.add(new Animal("������", 15));
		animalSet.add(new Animal("�����", 10));
		animalSet.add(new Animal("�䳢", 7));
		animalSet.add(new Animal("��", 3));
		animalSet.add(new Animal("��", 3));
		animalSet.add(new Animal("��", 3));
		animalSet.add(new Animal("��", 3));
		System.out.println("set �ȿ� ����̾� ��Ҵ� > " + animalSet.size());
		
		Iterator<Animal> itA = animalSet.iterator();
		while(itA.hasNext()) {
			Animal animalAddr = itA.next();
			System.out.println(animalAddr.getKind() +" "+ animalAddr.getLifeSpan());
		}
	}

}
