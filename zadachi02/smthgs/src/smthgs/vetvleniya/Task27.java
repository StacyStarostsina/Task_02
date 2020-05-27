package smthgs.vetvleniya;

import java.util.Random;

public class Task27 {
	public static void task() {
		int a;
		int b;
		int c;
		int d;
		int min1;
		int min2;
		int max;
		
		Random rnd = new Random(); 
		
		a=rnd.nextInt(50);
		b=rnd.nextInt(50);
		c=rnd.nextInt(50);
		d=rnd.nextInt(50);
		
		System.out.println("a="+a+" b="+b+" c="+c+" d="+d);
		
		if(a>b) {
			min1=a;
		}
		else {
			min1=b;
		}
		
		if(c>d) {
			min2=c;
		}
		else {
			min2=d;
		}
		
		if(min1>min2) {
			max=min1;
			System.out.println("max = "+max);
		}
		else {
			max=min2;
			System.out.println("max = "+max);
		}
		
	}
}
