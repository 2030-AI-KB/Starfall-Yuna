
// ���� ������:: private, public, protected(��Ӱ��� ����)

// ��� ������ �������� ������, Ŭ�������� �ƹ��� ���谡 ���� ������ ���� �ȴ�.
class A{	// A Ŭ����: �θ� Ŭ����
	// ��� :: num
	public int num;
	protected int a;	// A Ŭ����, B Ŭ���� ����O / C Ŭ���� ����X
	// protected :: �ڱ� �ڽŰ� �ڽ��� ��ӹ��� Ŭ������ ���ؼ��� ����O
}

class B extends A{	// B Ŭ����: �ڽ� Ŭ����
	// ��� :: num, ch
	public char ch;
}

public class Extends {
	public static void main(String[] args) {
		// ��� :: "�θ��� ���� �ڽĿ��� �����ش�." ��� ���信�� �Ļ�
		// => ������ Ŭ����(�θ� Ŭ����)�� ����� �߰��Ͽ� �������ϴ� ����
		// extends Ű���� ��� (extends :: "Ȯ���ϴ�")
		
		A a=new A();	// a ��ü�� ���: num
		B b=new B();	// b ��ü�� ���: num, ch
		
		a.num=1;
		b.num=10;
		b.ch='A';
		
		System.out.println("a.num="+a.num);
		System.out.println("b.num="+b.num);
		System.out.println("b.ch="+b.ch);
	}
}




