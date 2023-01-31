package javaMid2.p293;

public class Animal {
	//부모 클래스
	private String food;
	private String sound;
	
	public void printAll() {//필드 생성
		System.out.println("먹은 것은? " + food);
		System.out.println("소리는? " + sound);
	}
	
	public /* final 자식이 수정 불가능 */void ppAA() {
		
	}
	
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
}
