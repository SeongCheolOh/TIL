package javaHeight02.practice;

public class Practice {
	private String date;
	private String code;
	private String area;
	private int sellCnt;
	private int saleAmout;
	private String callNum;
	
	@Override
	public String toString() {
		// ObjectŬ������ �޼ҵ���, �ּҸ� ������ �ڵ����� toString() �ٴ´�.
		// �׷��� ��� Ŭ����ObjectŬ������ �ڽ��̹Ƿ� �̰��� �������ؼ� ����� �� �ִ�
		return date + code + area + sellCnt + saleAmout + callNum;
	}
	
	public Practice(String date, String code, String area, int sellCnt, int saleAmout, String callNum) {
		super();
		this.date = date;
		this.code = code;
		this.area = area;
		this.sellCnt = sellCnt;
		this.saleAmout = saleAmout;
		this.callNum = callNum;
	}
	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getSellCnt() {
		return sellCnt;
	}

	public void setSellCnt(int sellCnt) {
		this.sellCnt = sellCnt;
	}

	public int getSaleAmout() {
		return saleAmout;
	}

	public void setSaleAmout(int saleAmout) {
		this.saleAmout = saleAmout;
	}

	public String getCallNum() {
		return callNum;
	}

	public void setCallNum(String callNum) {
		this.callNum = callNum;
	}
	
	
	

}
