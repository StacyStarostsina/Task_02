package smthgs.vetvleniya;

public class Task32 {
	public static void task() {
		int a;
		int b;
		int c;
		
		a=-3;
		b=-7;
		c=10;
		
		if ((a+b)>0 | (a+c)>0 | (b+c)>0) {
			System.out.println("Сумма двух чисел является положительной");
		}
		else {
			System.out.println("Ни одна из сумм не является положительной");
		}
	}
}
