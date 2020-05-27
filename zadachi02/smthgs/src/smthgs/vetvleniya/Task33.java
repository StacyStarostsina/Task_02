package smthgs.vetvleniya;

public class Task33 {
	public static void task() {
		int a = 9583;
		int a1 = 1747;
		int b = 3331;
		int b1 = 7922;
		int c = 9455;
		int c1 = 8997;
		
		int password;
		
		password = 3331;
		
		if (password == a | password == a1 ) {
			System.out.println("Доступны модули баз A, B, C");
		}
		
		if (password == b | password == b1) {
			System.out.println("Доступны модули баз B, C");
		}
		
		if (password == c | password == c1) {
			System.out.println("Доступен модуль базы C");
		}
	}
}
