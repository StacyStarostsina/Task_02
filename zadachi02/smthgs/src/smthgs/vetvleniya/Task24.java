package smthgs.vetvleniya;

import java.util.Random;

public class Task24 {
	public static void task() {
		int n;

		Random rnd = new Random();
		n = rnd.nextInt(20)+1;

		if (n % 2 == 0) {
			System.out.println("�� �����:(");
		} else {
			System.out.println("�����!!!");
		}
		System.out.println("���������� ��������� � ������� ����: "+n);
	}
}
