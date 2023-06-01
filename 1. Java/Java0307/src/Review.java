import java.util.Scanner;

class Person{	// 사람(Person) 클래스 생성 
	// 클래스의 구성 :: 필드, 메소드, 생성자
	// 상태(필드, 멤버 변수)
	// 접근 제어자:: private(자기 자신만 접근O), public(외부에서도 접근O)
	public String name;
	public int age;
	public String tel;
	
	// 메소드(멤버 함수)
	// 대표적으로 많이 쓰이는게 get함수(값을 뱉어내는 함수), set함수(값을 설정하는 함수)
	public String getName() {
		return name;	// name값 반환
	}
	public void setName(String n) {	// n: 변경하고자 하는 값
		name=n;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	// this :: 
	
	
}

public class Review {
	public static void main(String[] args) {
		// 객체 :: 실생활에 존재하는 사물/실체, "클래스로 만들어진 것"
		// 클래스 :: 객체를 찍어내는 틀
		
		// 객체 생성
		// [클래스명] [객체명] = new [클래스명]();
		// 클래스는 사실상, 개인이 새로 정의한 자료형이라 생각하면 될듯
		Person lee=new Person();	// lee 객체 생성
	}
}
