package javaMid3.p318.a01;

public class Product {
	
	String name; // 제품명
	int price; // 제품 가격
	int bonusPoint; //
	
	public Product() {
		
	}
	public Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
		}
	
}
