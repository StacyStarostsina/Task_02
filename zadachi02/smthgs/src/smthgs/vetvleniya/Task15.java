package smthgs.vetvleniya;

public class Task15 {
	public static void task() {
		double x;
		double y;
		double z;
		
		x=17;
		y=23;
		
		if (x<y) {
			z=(x+y)/2;
			y=2*x*y;
			System.out.println("х меньшее число\n"+z);
			System.out.println(y);
		}
		else {
			z=2*x*y;
			y=(x+y)/2;
			System.out.println("x большее число\n"+z);
			System.out.println(y);
		}
		
	}
	
}
