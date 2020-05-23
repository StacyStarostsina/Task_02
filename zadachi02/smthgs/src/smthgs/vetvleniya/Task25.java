package smthgs.vetvleniya;

import java.util.Random;

public class Task25 {
	public static void task() {
		int n;

		Random rnd = new Random();
		n = rnd.nextInt(2 * 273) - 273;

		if (n > 60) {
			System.out.println("ГАРЫМ! +" + n);
		} else {
			if (n < 0) {
				System.out.println("Кажется, мимо идут белые ходоки " + n);
			} else {
				System.out.println("Нормальная температура +" + n);
			}
		}
	}
}
