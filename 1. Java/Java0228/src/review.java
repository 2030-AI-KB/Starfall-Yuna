
class Book{	// 책 클래스
	// 필드(멤버 변수) 선언
	// private으로 선언된 멤버는 자기 자신(book) 외의 클래스에선 접근X
	private String name;	
	private int year;
	private String writter;
	
	// 메소드(멤버 함수) 선언 -> 주로 get, set함수 사용
	// get함수(특정 값을 뱉어내는 함수), set함수(특정 값을 수정하는 함수)
	// public으로 선언된 멤버는 모든 클래스에서 접근O
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}
	
	// this :: 포인터의 개념을 가지고 있음
	// "이 메소드를 호출한 객체를 가리키는 포인터"
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getWritter() {
		return writter;
	}
	public void setWritter(String writter) {
		this.writter = writter;
	}
}

public class review {
	public static void main(String[] args) {
		// 객체 :: 우리 주변에서 발견할 수 있는 실체들 (클래스로 만들어진 것)
		// 클래스 :: 객체를 만들어내는/찍어내는 틀
		// (자료형을 사용자 임의로 정의하고 사용하는 개념으로 접근)
		
		// 클래스의 구성 :: 필드, 메소드, 생성자
		// 객체 생성
		// [클래스명] [객체명]=new [클래스명]();
		Book java=new Book();	// java라는 객체 생성 (객체명: java)
		
		// 객체의 멤버 호출 :: [객체명].[멤버 변수/함수]
		// getter, setter 이용해서 값 변경 및 출력
		// name: "Java", year: 1999, writter: "Lee"
		
		// 값 설정 (setter)
		java.setName("Java");
		java.setYear(1999);
		java.setWritter("Lee");
		
		// 값을 가져와서 출력
		System.out.println("책의 이름은 "+java.getName());
		System.out.println("책의 발간년도는 "+java.getYear());
		System.out.println("책의 저자는 "+java.getWritter());
	}
}




