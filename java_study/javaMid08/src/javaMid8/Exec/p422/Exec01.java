package javaMid8.Exec.p422; // 9장 확인문제

public class Exec01 {

	public static void main(String[] args) {
		//OutterA 내부의 InnerA 객체생성 하기
		OutterA oa = new OutterA();
		OutterA.InnerA oia = oa.new InnerA();
		oa.localMethod();
		
		//InnerSA를 객체생성하기
		OutterA.InnerSA oisa = new OutterA.InnerSA();

	}

}
