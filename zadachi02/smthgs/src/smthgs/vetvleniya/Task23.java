package smthgs.vetvleniya;

import java.util.Scanner;

public class Task23 {
	public static void task() {
		int d;
		int m;
		d=0;
		m=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите cегодн€шнее число: ");
		while (sc.hasNextInt() == false) {
			sc.next();
			System.out.println("¬ведите cегодн€шнее число: ");
		}
		d = sc.nextInt();

		Scanner tm = new Scanner(System.in);
		System.out.println("¬ведите номер текущего мес€ца: ");
		while (tm.hasNextInt() == false) {
			tm.next();
			System.out.println("¬ведите номер текущего мес€ца: ");
		}
		m=tm.nextInt();
		
		System.out.println("—егодн€ "+d+" число "+m+" мес€ца");
	}
}
