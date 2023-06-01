package java0228_;
import java.util.Scanner;

// * 계산기 클래스
class Calc{
	// 필드(멤버 변수) :: 2개의 정수
	private int n1;
	private int n2;
	
	// 메소드(멤버 함수) :: 5가지 사칙연산 결과 각각 뱉어내는 함수
	public int sum() {	// 덧셈 메소드
		return this.n1+this.n2;
	}
	public int sub() {	// 뺄셈 메소드
		return this.n1-this.n2;
	}
	public int mul() {	// 곱셈 메소드
		return this.n1*this.n2;
	}
	public int div1() {	// 몫 나눗셈 메소드
		return this.n1/this.n2;
	}
	public int div2() {	// 나머지 나눗셈 메소드
		return this.n1%this.n2;
	}
	
	// 생성자 :: 2개 멤버 변수의 값 초기화하며 객체 생성 (매개변수 2개)
	// -> 반환형이 없는 함수, 클래스명과 반드시 이름이 동일해야함
	// 생성자를 사용자가 이미 임의로 선언해놓으면, 기본 생성자 사용X
	public Calc(int num1, int num2) {
		this.n1=num1;		// 멤버 변수 값 초기화
		this.n2=num2;
	}// 위 생성자 구문 다 실행하면, 바로 객체 생성됨
}

public class Ex_calc {
	public static void main(String[] args) {
		// - 2개의 정수 입력받기
		Scanner sc=new Scanner(System.in);	// Scanner 객체 생성(sc)
		int a,b;
		while(true) {	// 무한 반복문
			a=sc.nextInt();
			b=sc.nextInt();
			if(b!=0) {break;}	// b가 0이라면 break문 수행X -> 다시 입력
								// b가 0이 아니라면 break문 수행 -> 무한 반복문 탈출
		}
		
		// - 입력값들을 매개변수로 받아 객체 생성
		// 입력값 a,b의 값을 각각 Calc 클래스의 n1, n2에 초기화하면서
		// c라는 이름의 객체가 생성됨 (객체 생성+setter의 역할 같이 수행)
		Calc c=new Calc(a,b);	
		
		// => +, -, *, /, % 결과값을 메소드 호출하여 출력
		System.out.println("plus: "+c.sum());	// 덧셈 결과 출력
		System.out.println("minus: "+c.sub());	// 뺄셈 결과 출력
		System.out.println("multi: "+c.mul());	// 곱셈 결과 출력
		System.out.println("quota: "+c.div1());	// 몫 나눗셈 결과 출력
		System.out.println("rest: "+c.div2());	// 나머지 나눗셈 결과 출력
	}
}





