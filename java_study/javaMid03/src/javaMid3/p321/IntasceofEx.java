package javaMid3.p321;

public class IntasceofEx {
	public static void personInfo(Person person) {
		System.out.println("name : " + person.name);
		person.walk();
		
		if(person instanceof Student ) { // person객체의 주소가 Student클래스를 가르킬 수 있으면 참
			person.walk();
			//다형성에서 부모객체로 받으면 자식의 객체로 접근을 못 함
			//방법 - ((자식)부모).~~로 다운캐스팅
			System.out.println(((Student) person).studentNo);
			
			Student s = (Student)person;
			System.out.println(s.studentNo);
			s.study();

		}
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1);
		System.out.println();
		
		Person p2 = new Student("김길동", 10);
		personInfo(p2);
	}
}
