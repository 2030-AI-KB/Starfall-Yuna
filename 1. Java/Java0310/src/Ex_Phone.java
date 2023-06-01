import java.util.Scanner;

// Phone Ŭ����
class Phone{
	// �������:: hour(��), min(��)
	public int hour;
	public int min;
	
	// ������:: hour=0, min=0���� �ʱ�ȭ
	public Phone() {
		this.hour=0;
		this.min=0;
	}
	
	// alarm �Լ� :: "7�ÿ� �˶��� �����մϴ�." ���
	public void alarm() {
		System.out.println("7�ÿ� �˶��� �����մϴ�.");
	}
	
	// clock �Լ� :: "��ٽð��� 9�� 0���Դϴ�." ���
	public void clock() {
		System.out.println("��ٽð��� 9�� 0���Դϴ�.");
	}
}

// App Ŭ����
class App extends Phone{	// (Phone Ŭ���� ��ӹ޴´�.)
	// ��� ����:: hour, min (��ӹ޾���)
	
	// ������:: hour=h, min=m���� �ʱ�ȭ
	public App(int h, int m) {
		this.hour=h;
		this.min=m;
	}
	
	// alarm �Լ� :: "n�ÿ� �˶��� �����մϴ�." ���
	public void alarm(int n) {
		System.out.println(n+"�ÿ� �˶��� �����մϴ�.");
	}
	
	// clock �Լ� :: "��ٽð��� 18�� 0���Դϴ�." ���
	public void clock() {
		System.out.println("��ٽð��� 18�� 0���Դϴ�.");
	}
}

public class Ex_Phone {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// �������̵��� �Լ� :: clock
		// �����ε��� �Լ� :: alarm
		
		// Phone�� ���� ��ü ����
		Phone p=new Phone();
		
		// App�� ���� ��ü ����
		int h=sc.nextInt();
		int m=sc.nextInt();
		App a=new App(h, m);
		
		// ���� alarm �Լ��� clock �Լ� ����ϱ�
		System.out.println("<Phone ��ü �Լ� ����>");
		p.alarm();
		p.clock();
		System.out.println();
		
		System.out.println("<App ��ü �Լ� ����>");
		a.alarm(9);
		a.clock();
		
	}
}





