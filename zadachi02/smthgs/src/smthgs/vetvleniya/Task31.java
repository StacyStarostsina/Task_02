package smthgs.vetvleniya;

public class Task31 {
	public static void task() {
		int x;
		int y;
		int z;
		int a;
		int b;
		int max;
		int min;

		x = 4;
		y = 16;
		z = 23;

		a = 20;
		b = 6;

		if (a > b) {
			max = a;
			min = b;
		} else {
			min = a;
			max = b;
		}

		if ((x < min | y < min | z < min) & ((x < max & y < max) | (x < max & z < max) | (y < max & z < max))) {
			System.out.println("Кирпич влезет");
		} else {
			System.out.println("Кирпич не влезет");
		}

	}
}
