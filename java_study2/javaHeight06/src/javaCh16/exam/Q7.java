package javaCh16.exam;

public class Q7 {
	
	private static int[] scores = {10,50,3};
	
	public static int maxOrMin(Operator op) {
		int result = scores[0];
		for(int score : scores) {
			result = op.apply(result,score);
		}
		return result;
	}

	public static void main(String[] args) {
		// 최대값 얻기
		int max = maxOrMin((int x, int y)->{//x = result, y = score
				if(x<y) {
					return y;
				}else {
					return x;
				}
		});
		System.out.println("최대값 : " + max);
		
		// 최소값 얻기
		int min = maxOrMin((x, y)-> (x>y) ? y : x); //람다식ver2 + 삼항연산자
		System.out.println("최소값 : " + min);

	}

}

@FunctionalInterface
interface Operator{
	public int apply(int x, int y);
}