package javaHeight03.p652;

public class ElectricCost {

	String ȣ��;
	int ������;
	int �����뷮;
	int �������;
	public String getȣ��() {
		return ȣ��;
	}
	public void setȣ��(String ȣ��) {
		this.ȣ�� = ȣ��;
	}
	public int get������() {
		return ������;
	}
	public void set������(int ������) {
		this.������ = ������;
	}
	public int get�����뷮() {
		return �����뷮;
	}
	public void set�����뷮(int �����뷮) {
		this.�����뷮 = �����뷮;
	}
	public int get�������() {
		return �������;
	}
	public void set�������(int �������) {
		this.������� = �������;
	}
	public ElectricCost(String ȣ��, int ������, int �����뷮, int �������) {
		super();
		this.ȣ�� = ȣ��;
		this.������ = ������;
		this.�����뷮 = �����뷮;
		this.������� = �������;
	}
	
	//ȣ���� �����ϸ� ���ü�� �Ǵ�
	@Override
	public int hashCode() {
		return ȣ��.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ElectricCost) {
			ElectricCost ec = (ElectricCost) obj;
			return ec.getȣ��().equals(ȣ��);
		}return false;
	}
	
	
	
}
