
class Animal{	// ���� Ŭ����
	// �ɹ�:: species(), cry()
	public void species() {	// Cat Ŭ�������� ��� ����
		System.out.println("����� ������ �����ϴ�.");
	}
	public void cry() {
		System.out.println("����� �����Ҹ��� �����ϴ�.");
	}
}

class Cat extends Animal{	// ����� Ŭ����
	// �������̵� :: �θ� Ŭ������ �ִ� ���(�Լ�)�� "������"�ϴ� ����
	// "�����"�� ������ ���Ե�
	
	// ���:: species(), cry()
	// �ٸ�, species �Լ��� �Ű������� ���� ���·ε� ��� �����ϸ�
	// �Ű������� String �ϳ� �ִ� ���ε� ��� �����ϴ�.
	public void species(String sp) {	// �Ű����� ���� �޸� ��
		System.out.println("�� ������� ���� "+sp);
	}
	public void cry() {
		System.out.println("�߿���");
	}
}

public class OverRiding {
	public static void main(String[] args) {
		// �����ε�, �������̵�
		// �Լ��̸� ���� ��ȯ��, �Ű����� ������ �ٸ��� "�����ε�"
		//		�����ε��� ��쿣, �Լ����� <����>�Ͽ� ����� �� �ִ�.
		// �Լ��̸�, ��ȯ��, �Ű����� ������ ��� ������ "�������̵�"
		//		�������̵��� ��쿣, �θ� Ŭ������ ������ �����ϰ�
		//		�ڽ� Ŭ���� �ڽ��� ������ �켱����
		
		Cat c=new Cat();	// ����� Ŭ������ ��ü ����
		c.cry();
	}
}
