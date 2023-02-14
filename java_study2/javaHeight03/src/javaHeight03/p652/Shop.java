package javaHeight03.p652;

public class Shop {

	private String custName; //고객명
	private String custPhone; //고객전화번호
	private int point; //포인트
	
	public Shop(String custName, String custPhone, int point) {
		super();
		this.custName = custName;
		this.custPhone = custPhone;
		this.point = point;
		
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	@Override
	public int hashCode() {
		return custPhone.hashCode() + custName.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Shop) {
			Shop shop = (Shop) obj;
			return shop.getCustPhone().equals(this.custPhone) && shop.getCustName().equals(this.custName);
		}
		return false;
	}
	
	
}
