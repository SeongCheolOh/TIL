package ch06.day1;

public class ClassEx03 {

	public static void main(String[] args) {
		// 생성자끼리 호출하기
		Book book = new Book();

		System.out.println(book.getTitle());
		System.out.println(book.getPrice());
	}

}

class Book{
	String title;
	int price;
	
	public Book() {//기본생성자 호출
		this(30000);
		System.out.println("이 곳은 기본 생성자이다");
	}
	public Book(String title) {
		this.title = title;
	}
	public Book(int price) {
		this.price = price;  // 왜 29번 생성자로 가는건가
	}
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}