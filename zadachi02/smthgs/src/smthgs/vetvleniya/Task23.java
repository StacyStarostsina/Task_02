package smthgs.vetvleniya;

import java.util.Scanner;

public class Task23 {
	public static void task() {
		int d;
		int m;
		d=0;
		m=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("������� c���������� �����: ");
		while (sc.hasNextInt() == false) {
			sc.next();
			System.out.println("������� c���������� �����: ");
		}
		d = sc.nextInt();

		Scanner tm = new Scanner(System.in);
		System.out.println("������� ����� �������� ������: ");
		while (tm.hasNextInt() == false) {
			tm.next();
			System.out.println("������� ����� �������� ������: ");
		}
		m=tm.nextInt();
		
		System.out.println("������� "+d+" ����� "+m+" ������");
	}
}
