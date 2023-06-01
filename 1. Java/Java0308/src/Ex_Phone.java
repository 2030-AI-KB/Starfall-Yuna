
// Phone 클래스(부모) -> SmartPhone 클래스, CellPhone 클래스(자식)
class Phone{
	// 멤버 변수 :: 전화번호, 기종
	private String tel;
	private String name;
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Phone(String t, String n) {
		this.tel=t;
		this.name=n;
	}
}

class SmartPhone extends Phone{	// 상속 통해서, 전화번호와 기종 멤버는 받아온 상태
	// 멤버 변수 :: 전화번호, 기종, OS버전
	private int os;
	public int getOs() {
		return os;
	}
	public void setOs(int os) {
		this.os = os;
	}
	
	// Phone 클래스를 상속받았기 때문에
	// 생성자의 실행이, 부모 클래스 생성자->자기 자신의 생성자
	// super() :: 이 함수를 통해, 부모 클래스의 생성자를 실행
	public SmartPhone(String t, String n, int o) {
		super(t, n);	// 부모 클래스인 Phone의 생성자 실행
		this.os=o;
	}
}
class CellPhone extends Phone{	// 상속 통해서, 전화번호와 기종 멤버는 받아온 상태
	// 멤버 변수 :: 전화번호, 기종, 제조회사
	private String com;
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
		// super.setTel("010-2272-6311"); -> super는 이렇게도 사용할 수 있긴 하다.
	}
	
	public CellPhone(String t, String n, String c) {
		super(t, n);	// 부모 클래스인 Phone의 생성자 실행
		this.com=c;
	}
}

public class Ex_Phone {
	public static void main(String[] args) {
		// 객체 생성
		SmartPhone sp=new SmartPhone("01022726311", "Vega", 9);
		CellPhone cp=new CellPhone("01066596311", "Lolipop", "Show");
		
		System.out.println("sp 기종: "+sp.getName());
		System.out.println("sp 전화번호: "+sp.getTel());
		System.out.println("sp os버전: "+sp.getOs());
		System.out.println();
		System.out.println("cp 기종: "+cp.getName());
		System.out.println("cp 전화번호: "+cp.getTel());
		System.out.println("cp 제조회사: "+cp.getCom());
	}
}




