
// 2�� ��� ����
class Book{
	public String name;
	public String writer;
	
	public Book(String n, String w){	// Book ������
		this.name=n;
		this.writer=w;
		System.out.println("å �̸�: "+this.name);
		System.out.println("���� �̸�: "+this.writer);
	}
}

class Pbook extends Book{	// Book Ŭ���� ���
	// ���:: name, writer, paper
	public int paper;	// ���� ������
	
	// " �ڽ� Ŭ������ ��ü �����Ҷ�, �ݵ�� �θ� �����ں��� ������ �Ѵ�. "
	// super() :: �θ� Ŭ������ ������ ����
	public Pbook(String n, String w, int p) {
		super(n, w);	// n, w ���� -> Book ������ ����
		this.paper=p;
		System.out.println("���� ������: "+this.paper);
	}
}


class Ebook extends Pbook{
	// ���:: name, writer, os, paper
	public String os;	// ȣȯ os
	
	public Ebook(String n, String w, int p, String o) {
		super(n, w, p);
		this.os=o;
		System.out.println("ȣȯ Os: "+this.os);
	}
}


public class Review0308 {
	public static void main(String[] args) {
		// ��� (extends) :: ���� Ŭ������ ���ο� ����� �߰��Ͽ� Ȯ���� Ŭ����
		Pbook p1=new Pbook("Java", "Lee", 1500);
		System.out.println();
		Ebook e1=new Ebook("React", "Park", 2000, "IceSand");
	}
}








