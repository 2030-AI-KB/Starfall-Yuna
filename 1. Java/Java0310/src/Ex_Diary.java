
// Diary 클래스 
// 추상 클래스 :: 추상 메소드를 하나 이상 갖는 클래스
abstract class Diary{
	// 멤버 변수: 할일(td), 남은기한(date)
	public String td;
	public int date;
	
	// 멤버 함수: (추상)bip(), alert()
	// 추상 클래스 -> 키워드 abstract
	// 함수의 형태만 선언해놓고, 정확한 명령문이나 연산은 나중에 정의
	abstract public void bip();
	abstract public void alert();
}

// Todo 클래스 -> Diary 클래스 상속받기
class Todo extends Diary{
	// alert() -> td와 date의 정보 출력
	public void alert() {
		System.out.println("할일: "+this.td);
		System.out.println("남은 기한: "+this.date);
	}
	// bip() -> 남은기한(date)이 일주일(7일) 이하라면, 경고 주기
	public void bip() {
		if(this.date<=7) {	// "date의 값이 7 이하라면,"
			System.out.println("마감기한이 얼마 남지 않았습니다.");
		}
	}
	
	public Todo(String t, int d) {
		this.td=t;		// 할일 정보 저장
		this.date=d;	// 남은기한 정보 저장
	}
}

public class Ex_Diary {
	public static void main(String[] args) {
		// 추상 클래스로는 객체 생성X
		
		//Todo 클래스에 대한 객체 2개 만들기
		Todo t1=new Todo("과제하기", 5);
		Todo t2=new Todo("시험 공부하기", 30);	
		
		// 각 객체의 함수 실행
		t1.alert();
		t1.bip();
		System.out.println();
		t2.alert();
		t2.bip();
	}
}




