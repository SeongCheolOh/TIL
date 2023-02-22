package javaMid2.p293;

public /*final 자식없음*/ class Dog extends Animal{
	
	private String Characteristic;

	public String getCharacteristic() {
		return Characteristic;
	}

	public void setCharacteristic(String characteristic) {
		Characteristic = characteristic;
	}
	
	//부모에게 있는 메소드명과 리턴타입이 동일하지만, 내용은 다른 것
	@Override
	//@Override >> "부모에게도 동일하게 있는 메소드 이지만 [재정의] 합니다"
	public void printAll() {
		System.out.println("음식은? " + getFood());
		System.out.println("소리는? " + getSound());
		System.out.println("특징은? " + getCharacteristic());
	}
	
	//@Override >> 컴파일에러 >> 부모에게는 없는 메소드ppAA
	public void ppAA() {
		
	}

}
