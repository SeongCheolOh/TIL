package javaMid6.p376.example5;

public class Tv implements Remocon{
	
	public static void main(String[] args) {
		Remocon r = new Tv();
		r.powerOn();
		
	}

	@Override
	public void powerOn() {
		System.out.println("Tv를 켰습니다");
		
	}
}
