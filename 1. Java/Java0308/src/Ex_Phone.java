
// Phone Ŭ����(�θ�) -> SmartPhone Ŭ����, CellPhone Ŭ����(�ڽ�)
class Phone{
	// ��� ���� :: ��ȭ��ȣ, ����
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

class SmartPhone extends Phone{	// ��� ���ؼ�, ��ȭ��ȣ�� ���� ����� �޾ƿ� ����
	// ��� ���� :: ��ȭ��ȣ, ����, OS����
	private int os;
	public int getOs() {
		return os;
	}
	public void setOs(int os) {
		this.os = os;
	}
	
	// Phone Ŭ������ ��ӹ޾ұ� ������
	// �������� ������, �θ� Ŭ���� ������->�ڱ� �ڽ��� ������
	// super() :: �� �Լ��� ����, �θ� Ŭ������ �����ڸ� ����
	public SmartPhone(String t, String n, int o) {
		super(t, n);	// �θ� Ŭ������ Phone�� ������ ����
		this.os=o;
	}
}
class CellPhone extends Phone{	// ��� ���ؼ�, ��ȭ��ȣ�� ���� ����� �޾ƿ� ����
	// ��� ���� :: ��ȭ��ȣ, ����, ����ȸ��
	private String com;
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
		// super.setTel("010-2272-6311"); -> super�� �̷��Ե� ����� �� �ֱ� �ϴ�.
	}
	
	public CellPhone(String t, String n, String c) {
		super(t, n);	// �θ� Ŭ������ Phone�� ������ ����
		this.com=c;
	}
}

public class Ex_Phone {
	public static void main(String[] args) {
		// ��ü ����
		SmartPhone sp=new SmartPhone("01022726311", "Vega", 9);
		CellPhone cp=new CellPhone("01066596311", "Lolipop", "Show");
		
		System.out.println("sp ����: "+sp.getName());
		System.out.println("sp ��ȭ��ȣ: "+sp.getTel());
		System.out.println("sp os����: "+sp.getOs());
		System.out.println();
		System.out.println("cp ����: "+cp.getName());
		System.out.println("cp ��ȭ��ȣ: "+cp.getTel());
		System.out.println("cp ����ȸ��: "+cp.getCom());
	}
}




