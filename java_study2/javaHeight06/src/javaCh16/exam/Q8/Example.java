package javaCh16.exam.Q8;

public class Example {
	
	private static Student[] std = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};
	
	//avg() 메소드 작성
static double avg(Funtion<Student> function) {//Funtion<Student> function =  s-> s.getEngScore()
		//평균 구하는 코드 작성 후 리턴
		int sum = 0;
		for(Student st : std) {
			sum += function.apply(st);
		}
		return (double)sum/std.length;
	}

	public static void main(String[] args) {
		double engAvg = avg(Student :: getEngScore);
		System.out.println("영어 평균 점수 : " + engAvg);
		
		double mathAvg = avg( s -> s.getMathScore());
		System.out.println("수학 평균 점수 : " + mathAvg);

	}

	

}
interface Funtion<T>{
	public double apply(T t);
}