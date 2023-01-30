package javaMid2.Practice4;

public class Output {

	public static void main(String[] args) {

		Marine m = new Marine();
		Tank t = new Tank();
		Dropship d = new Dropship();
		Unit u = new Unit();

		m.printAll();
		System.out.println();
		t.printAll();
		System.out.println();
		d.printAll();
		System.out.println(d.job+"은 ("+m.x+","+m.y+")에서 "+m.job+"을(를) 태웁니다");
		System.out.println(d.job+"은 ("+t.x+","+t.y+")에서 "+t.job+"을(를) 태웁니다");
		System.out.println();
	}

}
