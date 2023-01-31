package javaMid3.p318.a01;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	Product[] item = new Product[10];
	int i = 0;
	
	void buy(Product p) {
		if(money< p.price) {
			System.out.println("잔액이 부족합니다. 구매하실 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint ;
		item[i++] = p;
		System.out.println(p + "을(를) 구매하셨습니다.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		for(int i = 0; i<item.length; i++) {
			if(item[i]==null)break;
			sum  += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("구입하신 물품 금액의 총 합은 " + sum + "만원 입니다");
		System.out.println("구입하신 제품은 " + itemList + "입니다");
	}
}
