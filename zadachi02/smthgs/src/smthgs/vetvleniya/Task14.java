package smthgs.vetvleniya;

public class Task14 {
	public static void task() {
		int x;
		int y;
		int t;
		
		x=30;
		y=60;
		
		t=x+y;
		
		if(t>180) {
			System.out.println("����� ����������� �� ����������");
		}
		else {
			if(t == 90) {
				System.out.println("���� ����������� �������������");
			}
			else {
				t=180-t;
				System.out.println("������ ������� �����: "+t);
			}
		}
	}
}
