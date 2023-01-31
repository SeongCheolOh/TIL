package javaMid3.p318.a01;

public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Phone());
		b.buy(new Ipad());
		b.summary();
		
		//품목 - 팬드폰 150만원, 아이패드 170만원

	}

}
