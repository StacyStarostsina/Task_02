package smthgs.vetvleniya;

public class Task34 {
	public static void task() {
		int cost;
		int payment;
		int rez;
		
		cost = 12;
		payment = 20;
		
		System.out.println("��������� ����� '����� ��� ����������': "+cost+"\n�� ������: "+payment);
		
		if (payment<cost) {
			rez=Math.abs(cost-payment);
			System.out.println("������� ���: "+rez);
		}
		else {
			rez=payment-cost;
			System.out.println("���� �����: "+rez);
		}
		
		if (payment == cost) {
			System.out.println("������� �� �������!");
		}
		
	}
}
