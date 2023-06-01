
// 2중 상속 가능
class Book{
	public String name;
	public String writer;
	
	public Book(String n, String w){	// Book 생성자
		this.name=n;
		this.writer=w;
		System.out.println("책 이름: "+this.name);
		System.out.println("저자 이름: "+this.writer);
	}
}

class Pbook extends Book{	// Book 클래스 상속
	// 멤버:: name, writer, paper
	public int paper;	// 종이 사이즈
	
	// " 자식 클래스의 객체 생성할때, 반드시 부모 생성자부터 실행을 한다. "
	// super() :: 부모 클래스의 생성자 실행
	public Pbook(String n, String w, int p) {
		super(n, w);	// n, w 전송 -> Book 생성자 실행
		this.paper=p;
		System.out.println("종이 사이즈: "+this.paper);
	}
}


class Ebook extends Pbook{
	// 멤버:: name, writer, os, paper
	public String os;	// 호환 os
	
	public Ebook(String n, String w, int p, String o) {
		super(n, w, p);
		this.os=o;
		System.out.println("호환 Os: "+this.os);
	}
}


public class Review0308 {
	public static void main(String[] args) {
		// 상속 (extends) :: 상위 클래스에 새로운 기능을 추가하여 확장한 클래스
		Pbook p1=new Pbook("Java", "Lee", 1500);
		System.out.println();
		Ebook e1=new Ebook("React", "Park", 2000, "IceSand");
	}
}








