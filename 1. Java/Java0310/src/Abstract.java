
// �߻� Ŭ���� :: "�� ���ǵ� Ŭ����"
// �߻� �޼ҵ带 �ϳ� �̻� ������ Ŭ����
abstract class Alarm{
	// �߻� �޼ҵ� (�߻� <-> ��ü��)
	// Ű���� :: abstract
	abstract public void bip();
	// "bip()�̶�� �Լ��� �����Ѵ�." (���� �ص�)
	// (�������̵�) "��ü���� ������ �ڽ� Ŭ�������� �����Ѵ�." (������)
	
	public void SetTime(int h, int m) {	// ��üȭ�� �޼ҵ�
		System.out.println("���� �ð�: "+h+"�� "+m+"��");
	}
}

// ������ Ŭ����
class Alert extends Alarm{
	// ���: bip(), SetTime()
	public void bip() {		// �θ� Ŭ������ �߻� �޼ҵ� ����
		System.out.println("bippppp");
	}
}

// Ŭ����, ���, "�������̵�", super
public class Abstract {
	public static void main(String[] args) {
		// "�߻� Ŭ���� ���ؼ� ��ü ����X"
		// ��ü������ ���ǰ� �� Ŭ���� ���ؼ��� ��ü ����O
		
		// Alarm al=new Alarm();	-> ����
		Alert al=new Alert();
		
		al.SetTime(14, 19);
		al.bip();
	}
}



