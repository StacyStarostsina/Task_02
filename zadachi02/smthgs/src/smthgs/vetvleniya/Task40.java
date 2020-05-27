package smthgs.vetvleniya;

public class Task40 {
	public static void task() {
		double x;
		double a;
		double b;
		double f;

		a = -14;
		b = 14;

		for (x = a; x <= b; x += 5) {
			if (x <= 13) {
				f = -x * x * x + 9;
				System.out.print(f + " ");
			} else {
				f = -(1 / (x + 1));
				System.out.print(f + " ");
			}
		}
	}
}
