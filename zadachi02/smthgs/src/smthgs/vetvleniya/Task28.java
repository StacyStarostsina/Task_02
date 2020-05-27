package smthgs.vetvleniya;

public class Task28 {
	public static void task() {
		int a;
		int b;
		int c;
		int d;
		
		a=6;
		b=7;
		c=8;
		d=7;
		
		if (a==d) {
			System.out.println("a=d");
		}
		if (b==d) {
			System.out.println("b=d");
		}
		if (c==d) {
			System.out.println("c=d");
		}
		
		if (a!=d & b!=d & c!=d) {
			if(a<b & a<c) {
				if (c>b) {
					System.out.println("Наибольшее число с="+c);
				}
				else {
					System.out.println("Наибольшее число b="+b);
				}
			}
			else {
				System.out.println("Наибольшее число а="+a);
			}
		}
	}
}
