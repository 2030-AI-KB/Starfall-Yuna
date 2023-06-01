import java.util.Scanner;

public class Ex_inout {
	public static void main(String args[]) {
		// 2개의 정수를 입력받고 5가지의 사칙연산 결과 출력하기(+,-,*,/,%)
		
		// 1. 2개 정수 입력받기
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		// 2. 결과값 바로 출력하기
		System.out.println("덧셈 결과: "+(num1+num2));
		System.out.println("뺄셈 결과: "+(num1-num2));
		System.out.println("곱셈 결과: "+(num1*num2));
		System.out.println("몫 나누기 결과: "+(num1/num2));
		System.out.println("나머지 나누기 결과: "+(num1%num2));
	}
}
