package smthgs.vetvleniya;

import java.util.Random;

public class Task30 {
	public static void task() {
		int a;
		int b;
		int c;
		
		Random rnd = new Random();
		
		a=rnd.nextInt(20)-10;
		b=rnd.nextInt(20)-10;
		c=rnd.nextInt(20)-10;
		
		if (a<b & b<c) {
			a=a*a;
			b=b*b;
			c=c*c;
			
			System.out.println("Новые значения чисел:\n"+a+" "+b+" "+c);
		}
		else {
			a=Math.abs(a);
			b=Math.abs(b);
			c=Math.abs(c);
			
			System.out.println("Абсолютные значения данных чисел:\n"+a+" "+b+" "+c);
		}
	}
}
