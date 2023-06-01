import java.util.Scanner;

// Phone 클래스
class Phone{
	// 멤버변수:: hour(시), min(분)
	public int hour;
	public int min;
	
	// 생성자:: hour=0, min=0으로 초기화
	public Phone() {
		this.hour=0;
		this.min=0;
	}
	
	// alarm 함수 :: "7시에 알람을 설정합니다." 출력
	public void alarm() {
		System.out.println("7시에 알람을 설정합니다.");
	}
	
	// clock 함수 :: "출근시간은 9시 0분입니다." 출력
	public void clock() {
		System.out.println("출근시간은 9시 0분입니다.");
	}
}

// App 클래스
class App extends Phone{	// (Phone 클래스 상속받는다.)
	// 멤버 변수:: hour, min (상속받아짐)
	
	// 생성자:: hour=h, min=m으로 초기화
	public App(int h, int m) {
		this.hour=h;
		this.min=m;
	}
	
	// alarm 함수 :: "n시에 알람을 설정합니다." 출력
	public void alarm(int n) {
		System.out.println(n+"시에 알람을 설정합니다.");
	}
	
	// clock 함수 :: "퇴근시간은 18시 0분입니다." 출력
	public void clock() {
		System.out.println("퇴근시간은 18시 0분입니다.");
	}
}

public class Ex_Phone {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// 오버라이딩된 함수 :: clock
		// 오버로딩된 함수 :: alarm
		
		// Phone에 대한 객체 생성
		Phone p=new Phone();
		
		// App에 대한 객체 생성
		int h=sc.nextInt();
		int m=sc.nextInt();
		App a=new App(h, m);
		
		// 각각 alarm 함수와 clock 함수 사용하기
		System.out.println("<Phone 객체 함수 실행>");
		p.alarm();
		p.clock();
		System.out.println();
		
		System.out.println("<App 객체 함수 실행>");
		a.alarm(9);
		a.clock();
		
	}
}





