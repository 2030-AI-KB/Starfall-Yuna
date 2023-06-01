import java.util.Scanner;

public class control {
	public static void main(String args[]) {
		// 조건문 :: if-else if-else, switch
		// 반복문 :: while, do-while, for
		
		// 예제: 평점 입력받고 학점 출력하기
		// A: 90~100 / B: 80~89 / C: 70~79 / D: 60~69 / F: 0~59
		
		// 1. 평점 입력
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		
		// 2. 각 경우에 맞는 출력 수행
		score/=10;	// 편리한 연산을 위한, 일의 자리수 제거
			// 현재 값을 10으로 나눈 몫으로 변수를 갱신하라.
		//System.out.println(score);
		switch(score) {
		case 10:
		case 9:
			System.out.println("A학점입니다.");
			break;
		case 8:
			System.out.println("B학점입니다.");
			break;
		case 7:
			System.out.println("C학점입니다.");
			break;
		case 6:
			System.out.println("D학점입니다.");
			break;
		default:	// else문과 유사
			System.out.println("F학점입니다.");
		}
	}
}
