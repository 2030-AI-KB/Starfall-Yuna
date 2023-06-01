import java.util.Scanner;

// 학생 클래스
class Student{
	// 멤버 변수: 이름(Sname), 학년(grade)
	private String Sname;
	private int grade;
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public Student(String n, int g) {
		this.Sname=n;
		this.grade=g;
	}
}

// 교사 클래스
class Teacher{
	// 멤버 변수: 이름(Tname), 나이(age), 담당학년(level)
	private String Tname;
	private int age;
	private int level;
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public void search(int grade) {
		if(this.level==grade){
			System.out.println("해당 학생 담당 교사입니다.");	}
		else { System.out.println("해당 학생 담당 교사가 아닙니다."); }
	}
	
	public Teacher(String n, int a, int l) {
		this.Tname=n;
		this.age=a;
		this.level=l;
	}
}

public class Ex_st {	// 대표 클래스 :: "파일 하나에 하나만 있어야함"
	public static void main(String[] args) {
		// (각 객체의 값은 모두 입력을 받아서 저장하도록 한다.)
		Scanner sc=new Scanner(System.in);
		
		// 교사 객체 하나 생성
		String tn=sc.next();
		int a=sc.nextInt();
		int l=sc.nextInt();
		Teacher t=new Teacher(tn, a, l);
		
		// 3명의 학생 객체 생성 (크기가 3인 배열로 구성) -> "객체 배열"
		// (배열 생성 -> 객체 생성 수행)
		Student stu[]=new Student [3];	// Student 타입의 배열 생성
		for(int i=0;i<3;i++) {
			String sn=sc.next();
			int g=sc.nextInt();
			// [클래스명] [객체명]=new [생성자호출];
			stu[i]=new Student(sn, g);	// 객체 생성 수행 (생성자 실행)
		}
		
		// 각 객체의 모든 정보 출력
		System.out.println("<교사 정보>");
		System.out.println("이름: "+t.getTname());
		System.out.println("나이: "+t.getAge());
		System.out.println("담당학년: "+t.getLevel());
		System.out.println();
		
		for(int i=0;i<3;i++) {
			System.out.println("<학생 정보"+(i+1)+">");
			System.out.println("이름: "+stu[i].getSname());
			System.out.println("학년: "+stu[i].getGrade());
		}
		System.out.println();
		
		// 각 학생에 대해, 해당 교사가 담당 교사인지 확인
		for(int i=0;i<3;i++) {
			System.out.print(stu[i].getSname()+"학생: ");
			t.search(stu[i].getGrade());		// 교사 클래스 통해 생성된 객체 t의 search() 함수 실행
		}
	}
}








