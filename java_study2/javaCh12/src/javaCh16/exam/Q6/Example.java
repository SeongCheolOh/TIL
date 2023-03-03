package javaCh16.exam.Q6;

public class Example {
	public static double calc(Funtion fun) {
		double x = 10;
		double y = 4;
		return fun.apply(x,y);
	}

	public static void main(String[] args) {
		double result = calc( (x,y) -> (x/y));
		System.out.println("result : " + result);
		

	}

}
