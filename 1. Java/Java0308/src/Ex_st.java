import java.util.Scanner;

// �л� Ŭ����
class Student{
	// ��� ����: �̸�(Sname), �г�(grade)
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

// ���� Ŭ����
class Teacher{
	// ��� ����: �̸�(Tname), ����(age), ����г�(level)
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
			System.out.println("�ش� �л� ��� �����Դϴ�.");	}
		else { System.out.println("�ش� �л� ��� ���簡 �ƴմϴ�."); }
	}
	
	public Teacher(String n, int a, int l) {
		this.Tname=n;
		this.age=a;
		this.level=l;
	}
}

public class Ex_st {	// ��ǥ Ŭ���� :: "���� �ϳ��� �ϳ��� �־����"
	public static void main(String[] args) {
		// (�� ��ü�� ���� ��� �Է��� �޾Ƽ� �����ϵ��� �Ѵ�.)
		Scanner sc=new Scanner(System.in);
		
		// ���� ��ü �ϳ� ����
		String tn=sc.next();
		int a=sc.nextInt();
		int l=sc.nextInt();
		Teacher t=new Teacher(tn, a, l);
		
		// 3���� �л� ��ü ���� (ũ�Ⱑ 3�� �迭�� ����) -> "��ü �迭"
		// (�迭 ���� -> ��ü ���� ����)
		Student stu[]=new Student [3];	// Student Ÿ���� �迭 ����
		for(int i=0;i<3;i++) {
			String sn=sc.next();
			int g=sc.nextInt();
			// [Ŭ������] [��ü��]=new [������ȣ��];
			stu[i]=new Student(sn, g);	// ��ü ���� ���� (������ ����)
		}
		
		// �� ��ü�� ��� ���� ���
		System.out.println("<���� ����>");
		System.out.println("�̸�: "+t.getTname());
		System.out.println("����: "+t.getAge());
		System.out.println("����г�: "+t.getLevel());
		System.out.println();
		
		for(int i=0;i<3;i++) {
			System.out.println("<�л� ����"+(i+1)+">");
			System.out.println("�̸�: "+stu[i].getSname());
			System.out.println("�г�: "+stu[i].getGrade());
		}
		System.out.println();
		
		// �� �л��� ����, �ش� ���簡 ��� �������� Ȯ��
		for(int i=0;i<3;i++) {
			System.out.print(stu[i].getSname()+"�л�: ");
			t.search(stu[i].getGrade());		// ���� Ŭ���� ���� ������ ��ü t�� search() �Լ� ����
		}
	}
}








