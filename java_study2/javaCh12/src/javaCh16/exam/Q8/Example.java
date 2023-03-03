package javaCh16.exam.Q8;

public class Example {
	
	private static Student[] std = {
			new Student("ȫ�浿", 90, 96),
			new Student("�ſ��", 95, 93)
	};
	
	//avg() �޼ҵ� �ۼ�
static double avg(Funtion<Student> function) {//Funtion<Student> function =  s-> s.getEngScore()
		//��� ���ϴ� �ڵ� �ۼ� �� ����
		int sum = 0;
		for(Student st : std) {
			sum += function.apply(st);
		}
		return (double)sum/std.length;
	}

	public static void main(String[] args) {
		double engAvg = avg(Student :: getEngScore);
		System.out.println("���� ��� ���� : " + engAvg);
		
		double mathAvg = avg( s -> s.getMathScore());
		System.out.println("���� ��� ���� : " + mathAvg);

	}

	

}
interface Funtion<T>{
	public double apply(T t);
}