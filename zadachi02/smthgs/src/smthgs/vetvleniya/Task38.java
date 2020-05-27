package smthgs.vetvleniya;

public class Task38 {
	public static void task() {
		int x;
		int a;
		int b;
		int f;
		
		a=-5;
		b=5;
		
		for (x=a; x<=b; x++) {
			if (x>=0 & x<=3) {
				f=x*x;
				System.out.print(f+" ");
			}
			if (x>3 | x<0) {
				f=4;
				System.out.print(f+" ");
			}
		}
	}
}
