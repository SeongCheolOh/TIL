package javaBasic2.ch05.day03;

public class Ex03 {

	public static void main(String[] args) {
		// Shop class 만들기
		// 필드는 String shopName 가게명
		// 		String shopType 가게종류
		//		int sale 매출액
		//입력값 kt-hand, 핸드폰가게, 1000
		
		Shop s1 = new Shop();
		
		s1.setShopName("kt-hand");
		s1.setShopType("핸드폰가게");
		s1.setSale(1000);
		
		System.out.println(s1.shopName);
		System.out.println(s1.shopType);
		System.out.println(s1.sale);

	}

}
class Shop{
	String shopName;
	String shopType;
	int sale;
	void setShopName(String shopName) {
		this.shopName=shopName;
	}
	void setShopType(String shopType){
		this.shopType=shopType;
	}
	void setSale(int sale){
		this.sale = sale;
	}
}
