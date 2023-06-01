
class Phone{	// 스마트폰 클래스 생성
	// 클래스의 구성 :: 필드(멤버 변수), 메소드(멤버 함수), 생성자
	// 멤버 변수 :: 기종이름, 출시년도, OS버전
	private String name;
	private int year;
	private String version;
	
	// 멤버 함수 :: getter setter 3쌍
	// this :: 멤버 함수를 불러온 객체 자신을 지칭하는 포인터
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	// 생성자 :: 객체를 만들어내는 메소드 (특별한 메소드)
	// 메소드명이 클래스명 동일
	// public Phone() {	} -> 생성자를 따로 작성하지 않으면, 기본 생성자 자동으로 실행
	
	// 생성자를 정의해두면, 객체 생성과 동시에 특정 명령을 수행할 수 있다.
	// 오버로딩 :: 
	public Phone() {
		this.name="AnyCall";
		this.year=1990;
		this.version="???";
	}
	public Phone(String n, int y, String v) {
		this.name=n;
		this.year=y;
		this.version=v;
	}
}

public class Ex_phone {
	public static void main(String[] args) {
		// 객체 생성
		// [클래스명] [객체명] = new [생성자명];
		Phone GS=new Phone();		// GS 객체 생성
		// GS 객체 생성과 동시에 name, year, version 값 지정된 정보로 초기화
		Phone Apple=new Phone("Vega", 2012, "?");	// Apple 객체 생성
		// Apple 객체 생성과 동시에 name, year, version 값 지정된 정보로 초기화
		
		System.out.println("Test");
		System.out.println("GS: "+GS.getName());
		System.out.println("Apple: "+Apple.getName());
		System.out.println();
		
		// 멤버 사용
		// [객체명].[멤버변수/멤버함수]
		// * GS -> Galaxy S / 2010 / IceSand
		// * Apple -> Apple / 2015 / 9 
		GS.setName("Galaxy S");
		GS.setYear(2010);
		GS.setVersion("IceSand");
		Apple.setName("Apple");
		Apple.setYear(2015);
		Apple.setVersion("9");
		
		System.out.println("Phone name: "+GS.getName());	// GS에 있는 name의 값 출력
		System.out.println("launch year: "+GS.getYear());
		System.out.println("Version: "+GS.getVersion());
		System.out.println();
		
		System.out.println("Phone name: "+Apple.getName());
		System.out.println("launch year: "+Apple.getYear());
		System.out.println("Version: "+Apple.getVersion());
	}
}





