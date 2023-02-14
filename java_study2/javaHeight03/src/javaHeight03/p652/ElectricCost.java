package javaHeight03.p652;

public class ElectricCost {

	String 호수;
	int 가족수;
	int 전기사용량;
	int 공동요금;
	public String get호수() {
		return 호수;
	}
	public void set호수(String 호수) {
		this.호수 = 호수;
	}
	public int get가족수() {
		return 가족수;
	}
	public void set가족수(int 가족수) {
		this.가족수 = 가족수;
	}
	public int get전기사용량() {
		return 전기사용량;
	}
	public void set전기사용량(int 전기사용량) {
		this.전기사용량 = 전기사용량;
	}
	public int get공동요금() {
		return 공동요금;
	}
	public void set공동요금(int 공동요금) {
		this.공동요금 = 공동요금;
	}
	public ElectricCost(String 호수, int 가족수, int 전기사용량, int 공동요금) {
		super();
		this.호수 = 호수;
		this.가족수 = 가족수;
		this.전기사용량 = 전기사용량;
		this.공동요금 = 공동요금;
	}
	
	//호수가 동일하면 동등객체로 판단
	@Override
	public int hashCode() {
		return 호수.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ElectricCost) {
			ElectricCost ec = (ElectricCost) obj;
			return ec.get호수().equals(호수);
		}return false;
	}
	
	
	
}
