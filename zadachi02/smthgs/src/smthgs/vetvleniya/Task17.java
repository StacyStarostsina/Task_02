package smthgs.vetvleniya;

public class Task17 {
	public static void task() {
		int x;
		int y;
		
		x=17;
		y=18;
		
		if (x!=y) {
			if(x>y) {
				y=x;
				System.out.println("Числа не равны. Теперь им присвоенно значение большего: "+x);
			}
			else {
				x=y;
				System.out.println("Числа не равны. Теперь им присвоенно значение большего: "+y);
			}
		}
		else {
			x=0;
			y=0;
			System.out.println("Числа равны. Теперь им присвоенно значение "+x);
		}
		
	}
}
