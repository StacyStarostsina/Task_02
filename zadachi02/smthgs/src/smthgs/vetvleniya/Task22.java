package smthgs.vetvleniya;

public class Task22 {
	public static void task() {
		int x;
		int y;
		int z;
		
		x=9;
		y=7;
		z=x;
		
		if (x>y) {
			x=y;
			y=z;
			System.out.println("x>y x="+x+" y="+y);
		}
		else {
			x=y;
			y=z;
			System.out.println("y>x x="+x+" y="+y);
		}
	}
}
