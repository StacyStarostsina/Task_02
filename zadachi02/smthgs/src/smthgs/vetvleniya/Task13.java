package smthgs.vetvleniya;

public class Task13 {
	public static void task() {
		double x1;
		double y1;
		double l1;
		double x2;
		double y2;
		double l2;
		
		x1=2;
		x2=-4;
		y1=45;
		y2=-6;
		
		l1=Math.sqrt(x1*x1+y1*y1);
		l2=Math.sqrt(x2*x2+y2*y2);
		
		if(l1>l2) {
			System.out.println("Первая точка ближе к началу координат");
		}
		else {
			System.out.println("Вторая точка ближе к началу координат");
		}
		
	}
}
