package javaHeight03.p652;

public class Animal {

	private String kind; //동물 종류
	private int lifeSpan; //수명
	
	public Animal(String kind, int lifeSpan) { //생성자
		super();
		this.kind = kind;
		this.lifeSpan = lifeSpan;
	}

	public String getKind() { //getter setter
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	//동등객체 만들기
	@Override
	public int hashCode() {
		return kind.hashCode() + lifeSpan;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Animal) {
			Animal target = (Animal) obj;
			return target.kind.equals(this.kind) && target.lifeSpan == this.lifeSpan;
		}
		return false;
	}
	
	
	
	
}
