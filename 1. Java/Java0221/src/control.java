import java.util.Scanner;

public class control {
	public static void main(String args[]) {
		// ���ǹ� :: if-else if-else, switch
		// �ݺ��� :: while, do-while, for
		
		// ����: ���� �Է¹ް� ���� ����ϱ�
		// A: 90~100 / B: 80~89 / C: 70~79 / D: 60~69 / F: 0~59
		
		// 1. ���� �Է�
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		
		// 2. �� ��쿡 �´� ��� ����
		score/=10;	// ���� ������ ����, ���� �ڸ��� ����
			// ���� ���� 10���� ���� ������ ������ �����϶�.
		//System.out.println(score);
		switch(score) {
		case 10:
		case 9:
			System.out.println("A�����Դϴ�.");
			break;
		case 8:
			System.out.println("B�����Դϴ�.");
			break;
		case 7:
			System.out.println("C�����Դϴ�.");
			break;
		case 6:
			System.out.println("D�����Դϴ�.");
			break;
		default:	// else���� ����
			System.out.println("F�����Դϴ�.");
		}
	}
}
