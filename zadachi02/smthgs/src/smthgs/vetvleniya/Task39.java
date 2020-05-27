package smthgs.vetvleniya;

public class Task39 {
	public static void task() {
		double x;
		double a;
		double b;
		double f;
		
		a=-9;
		b=9;
		
		for (x=a; x<=b; x+=3) {
			if (x>=8) {
				f = -x*x+x-9;
				System.out.print(f+" ");
			}
			else {
				f = 1/(Math.pow(x, 4)-6);
				System.out.print(f+" ");
			}
		}
	}
}
