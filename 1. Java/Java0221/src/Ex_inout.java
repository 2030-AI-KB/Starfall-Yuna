import java.util.Scanner;

public class Ex_inout {
	public static void main(String args[]) {
		// 2���� ������ �Է¹ް� 5������ ��Ģ���� ��� ����ϱ�(+,-,*,/,%)
		
		// 1. 2�� ���� �Է¹ޱ�
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		// 2. ����� �ٷ� ����ϱ�
		System.out.println("���� ���: "+(num1+num2));
		System.out.println("���� ���: "+(num1-num2));
		System.out.println("���� ���: "+(num1*num2));
		System.out.println("�� ������ ���: "+(num1/num2));
		System.out.println("������ ������ ���: "+(num1%num2));
	}
}
