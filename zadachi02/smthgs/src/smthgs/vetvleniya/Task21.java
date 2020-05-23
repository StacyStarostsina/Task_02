package smthgs.vetvleniya;

import java.util.Scanner;

public class Task21 {
	public static void task() {
		String d;
		String m;
		String s;

		d = "Д";
		m = "М";

		Scanner sc = new Scanner(System.in);
		System.out.println("Кто ты: мальчик или девочка? Введи Д или М");

		s = sc.next();

		if (s.contentEquals(d)) {
			System.out.println("Мне нравятся девочки");
		} else {
			if (s.contentEquals(m)) {
				System.out.println("Мне нравятся мальчики");
			} else {
				System.out.println("Есть только два гендера");
			}

		}
	}
}
