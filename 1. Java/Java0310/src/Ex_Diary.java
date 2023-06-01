
// Diary Ŭ���� 
// �߻� Ŭ���� :: �߻� �޼ҵ带 �ϳ� �̻� ���� Ŭ����
abstract class Diary{
	// ��� ����: ����(td), ��������(date)
	public String td;
	public int date;
	
	// ��� �Լ�: (�߻�)bip(), alert()
	// �߻� Ŭ���� -> Ű���� abstract
	// �Լ��� ���¸� �����س���, ��Ȯ�� ��ɹ��̳� ������ ���߿� ����
	abstract public void bip();
	abstract public void alert();
}

// Todo Ŭ���� -> Diary Ŭ���� ��ӹޱ�
class Todo extends Diary{
	// alert() -> td�� date�� ���� ���
	public void alert() {
		System.out.println("����: "+this.td);
		System.out.println("���� ����: "+this.date);
	}
	// bip() -> ��������(date)�� ������(7��) ���϶��, ��� �ֱ�
	public void bip() {
		if(this.date<=7) {	// "date�� ���� 7 ���϶��,"
			System.out.println("���������� �� ���� �ʾҽ��ϴ�.");
		}
	}
	
	public Todo(String t, int d) {
		this.td=t;		// ���� ���� ����
		this.date=d;	// �������� ���� ����
	}
}

public class Ex_Diary {
	public static void main(String[] args) {
		// �߻� Ŭ�����δ� ��ü ����X
		
		//Todo Ŭ������ ���� ��ü 2�� �����
		Todo t1=new Todo("�����ϱ�", 5);
		Todo t2=new Todo("���� �����ϱ�", 30);	
		
		// �� ��ü�� �Լ� ����
		t1.alert();
		t1.bip();
		System.out.println();
		t2.alert();
		t2.bip();
	}
}




