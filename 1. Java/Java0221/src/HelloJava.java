// import : ���̺귯���� �ش� ���Ͽ� ������ �� ���
//import java.util.*;	// java.util�� ��� ���̺귯�� �� ��ɾ� ����
import java.util.Scanner;	// �Է��� �������� �� ������ �־�� ��

public class HelloJava {
	public static void main(String args[]) {
		// ��¹�: print, printf, println
		// print�� println�� ���̴� "\n"�� ���� ����
		System.out.println("println :: Hello World!!!");
		System.out.print("print :: Hello World!!!\n");
		System.out.printf("printf :: %s\n", "Hello World!!!");
		System.out.print("����");
		
		// �Է¹�
		Scanner sc=new Scanner(System.in);	// Scanner ����(����)
		int i=sc.nextInt();			// int�� �Է¹�
		double d=sc.nextDouble();	// double�� �Է¹�
		char c=sc.next().charAt(0);	// char�� �Է¹�
		String s=sc.next();  		// String�� �Է¹�
		boolean b=sc.nextBoolean(); // Boolean�� �Է¹�
		
		// 2���� ������ �Է¹ް� 5������ ��Ģ���� ��� ����ϱ�(+,-,*,/,%)
		
	}
}






