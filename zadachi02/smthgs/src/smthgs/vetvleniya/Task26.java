package smthgs.vetvleniya;

import java.util.Random;

public class Task26 {
	public static void task() {
		int x;
		int y;
		int z;
		int sum;

		Random rnd = new Random();

		x = rnd.nextInt(10);
		y = rnd.nextInt(10);
		z = rnd.nextInt(10);

		sum = 0;

		if (x > y & x > z) {
			if (y < z) {
				sum = x + y;
				System.out.println("����� ����� �=" + x + " � �=" + y + " ����� " + sum);
			} else {
				sum = x + z;
				System.out.println("����� ����� �=" + x + " � z=" + z + " ����� " + sum);
			}
		} else {
			sum = y + z;
			System.out.println("����� ����� y=" + y + " � z=" + z + " ����� " + sum);
		}
	}
}
