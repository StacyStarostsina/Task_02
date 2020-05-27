package smthgs.vetvleniya;

public class Task29 {
	public static void task() {
		int x1;
		int x2;
		int x3;
		int y1;
		int y2;
		int y3;

		x1 = 3;
		x2 = 5;
		x3 = 2;
		y1 = 15;
		y2 = 19;
		y3 = 23;

		if ((x3 - x1) / (x2 - x1) == (y3 - y1) / y2 - y1) {
			System.out.println("Точки расположены на одной прямой");
		} else {
			System.out.println("Точки НЕ расположены на одной прямой");
		}
	}
}
