// import : 라이브러리를 해당 파일에 포함할 때 사용
//import java.util.*;	// java.util의 모든 라이브러리 및 명령어 포함
import java.util.Scanner;	// 입력을 받으려할 때 무조건 있어야 함

public class HelloJava {
	public static void main(String args[]) {
		// 출력문: print, printf, println
		// print와 println의 차이는 "\n"의 유무 차이
		System.out.println("println :: Hello World!!!");
		System.out.print("print :: Hello World!!!\n");
		System.out.printf("printf :: %s\n", "Hello World!!!");
		System.out.print("으헹");
		
		// 입력문
		Scanner sc=new Scanner(System.in);	// Scanner 정의(선언)
		int i=sc.nextInt();			// int형 입력문
		double d=sc.nextDouble();	// double형 입력문
		char c=sc.next().charAt(0);	// char형 입력문
		String s=sc.next();  		// String형 입력문
		boolean b=sc.nextBoolean(); // Boolean형 입력문
		
		// 2개의 정수를 입력받고 5가지의 사칙연산 결과 출력하기(+,-,*,/,%)
		
	}
}






