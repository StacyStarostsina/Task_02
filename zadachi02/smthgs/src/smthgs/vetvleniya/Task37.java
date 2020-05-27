package smthgs.vetvleniya;

public class Task37 {
	public static void task() {
		double x;
		double a;
		double b;
		double f;
		
		a=-5;
		b=5;
		
		for (x=a; x<=b; x++) {
			if (x>=3) {
				f = -x*x+3*x+9;
				System.out.print(f+" ");
			}
			else {
				f = 1/(Math.pow(x, 3)-6);
				System.out.print(f+" ");
			}
		}
	}
}
