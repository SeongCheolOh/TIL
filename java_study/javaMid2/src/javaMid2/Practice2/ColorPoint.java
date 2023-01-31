package javaMid2.Practice2;

public class ColorPoint extends Point{

	String color = "red";
	
	@Override
	void printAll() {
		// TODO Auto-generated method stub
		
		px = 3;
		px = 4;
		System.out.println(color + " (" + px + "," + py + ")");
	}
}
