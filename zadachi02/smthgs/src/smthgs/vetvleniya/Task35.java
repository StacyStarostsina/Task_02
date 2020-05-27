package smthgs.vetvleniya;

public class Task35 {
	public static void task() {
		int day;
		int month;
		int n = 148;

		if (n <= 31) {
			day = n;
			month = 1;
			System.out.println(day + "." + month);
		}

		if (n <= 59) {
			day = n - 31;
			month = 2;
			System.out.println(day + "." + month);
		}
		if (n <= 90) {
			day = n - 59;
			month = 3;
			System.out.println(day + "." + month);
		}
		if (n <= 120) {
			day = n - 90;
			month = 4;
			System.out.println(day + "." + month);
		}
		if (n <= 151) {
			day = n - 120;
			month = 5;
			System.out.println(day + "." + month);
		}
		if (n <= 181) {
			day = n - 151;
			month = 6;
			System.out.println(day + "." + month);
		}
		if (n <= 212) {
			day = n - 181;
			month = 7;
			System.out.println(day + "." + month);
		}
		if (n <= 243) {
			day = n - 212;
			month = 8;
			System.out.println(day + "." + month);
		}
		if (n <= 273) {
			day = n - 243;
			month = 9;
			System.out.println(day + "." + month);
		}
		if (n <= 304) {
			day = n - 273;
			month = 10;
			System.out.println(day + "." + month);
		}
		if (n <= 335) {
			day = n - 304;
			month = 11;
			System.out.println(day + "." + month);
		}
		if (n <= 365) {
			day = n - 335;
			month = 12;
			System.out.println(day + "." + month);
		}
	}
}