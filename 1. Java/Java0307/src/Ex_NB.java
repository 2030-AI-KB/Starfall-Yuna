
// * 노트북 클래스
class NoteBook{
	// 멤버 변수 :: 노트북기종, 출시년도, 구입년도
	private String name;
	private int Lyear;
	private int Byear;
	
	// 멤버 함수 :: getter, setter 함수
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLyear() {
		return Lyear;
	}
	public void setLyear(int lyear) {
		Lyear = lyear;
	}
	public int getByear() {
		return Byear;
	}
	public void setByear(int byear) {
		Byear = byear;
	}
	
	// 멤버 함수 :: 무료 A/S 가능 여부 출력
	public void As() {
		int tf=2023-Byear;	// 현재년도 - 구매년도
		
		if(tf<=1) {	// -> 1년 이내 :: 무료 A/S가 가능하다
			System.out.println("해당 제품은 무료 A/S가 가능합니다.");
		}
		else {	// -> 1년 초과 :: 무료 A/S가 불가능하다
			System.out.println("해당 제품은 무료 A/S가 불가능합니다.");
		}
	}
	
	// 생성자
	public NoteBook(String n, int l, int b) {
		this.name=n;
		this.Lyear=l;
		this.Byear=b;
	}
}


public class Ex_NB {
	public static void main(String[] args) {
		// 객체 생성 :: Asus, LG
		// 객체 Asus	=> "Vivo", 2000, 2020
		NoteBook Asus=new NoteBook("Vivo", 2000, 2020);
		// 객체 LG		=> "Gram", 2018, 2022
		NoteBook LG=new NoteBook("Gram", 2018, 2022);
		
		// 1) 각 객체의 정보 출력하기
		// 2) 무료 A/S가 가능한지 파악하는 멤버 함수 생성하고 각 객체에 적용
		// (무료 A/S는 구입한지 1년 이내로 가능하다고 전제)
		System.out.println("Asus");
		System.out.println("NoteBook Name: "+Asus.getName());
		System.out.println("NoteBook Launch at: "+Asus.getLyear());
		System.out.println("NoteBook Buy at: "+Asus.getByear());
		Asus.As();
		System.out.println();
		
		System.out.println("LG");
		System.out.println("NoteBook Name: "+LG.getName());
		System.out.println("NoteBook Launch at: "+LG.getLyear());
		System.out.println("NoteBook Buy at: "+LG.getByear());
		LG.As();
		System.out.println();
	}
}









