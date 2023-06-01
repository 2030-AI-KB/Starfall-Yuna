
// 접근 제어자:: private, public, protected(상속개념 포함)

// 상속 개념을 주입하지 않으면, 클래스들은 아무런 관계가 없는 별개의 것이 된다.
class A{	// A 클래스: 부모 클래스
	// 멤버 :: num
	public int num;
	protected int a;	// A 클래스, B 클래스 접근O / C 클래스 접근X
	// protected :: 자기 자신과 자신을 상속받은 클래스에 한해서만 접근O
}

class B extends A{	// B 클래스: 자식 클래스
	// 멤버 :: num, ch
	public char ch;
}

public class Extends {
	public static void main(String[] args) {
		// 상속 :: "부모의 것을 자식에게 물려준다." 라는 개념에서 파생
		// => 기존의 클래스(부모 클래스)에 기능을 추가하여 재정의하는 행위
		// extends 키워드 사용 (extends :: "확장하다")
		
		A a=new A();	// a 객체의 멤버: num
		B b=new B();	// b 객체의 멤버: num, ch
		
		a.num=1;
		b.num=10;
		b.ch='A';
		
		System.out.println("a.num="+a.num);
		System.out.println("b.num="+b.num);
		System.out.println("b.ch="+b.ch);
	}
}




