package smthgs.vetvleniya;

public class Task34 {
	public static void task() {
		int cost;
		int payment;
		int rez;
		
		cost = 12;
		payment = 20;
		
		System.out.println("Стоимость книги 'Цветы для Элджернона': "+cost+"\nВы внесли: "+payment);
		
		if (payment<cost) {
			rez=Math.abs(cost-payment);
			System.out.println("Внесите ещё: "+rez);
		}
		else {
			rez=payment-cost;
			System.out.println("Ваша сдача: "+rez);
		}
		
		if (payment == cost) {
			System.out.println("Спасибо за покупку!");
		}
		
	}
}
