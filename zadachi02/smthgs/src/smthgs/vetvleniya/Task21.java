package smthgs.vetvleniya;

import java.util.Scanner;

public class Task21 {
	public static void task() {
		String d;
		String m;
		String s;

		d = "�";
		m = "�";

		Scanner sc = new Scanner(System.in);
		System.out.println("��� ��: ������� ��� �������? ����� � ��� �");

		s = sc.next();

		if (s.contentEquals(d)) {
			System.out.println("��� �������� �������");
		} else {
			if (s.contentEquals(m)) {
				System.out.println("��� �������� ��������");
			} else {
				System.out.println("���� ������ ��� �������");
			}

		}
	}
}
