package comparator;

public class Fruit {

	private String name;
	private Integer price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public Fruit(String name, Integer price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
}
