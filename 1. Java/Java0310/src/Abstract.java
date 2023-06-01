
// 추상 클래스 :: "덜 정의된 클래스"
// 추상 메소드를 하나 이상 보유한 클래스
abstract class Alarm{
	// 추상 메소드 (추상 <-> 구체적)
	// 키워드 :: abstract
	abstract public void bip();
	// "bip()이라는 함수가 존재한다." (선언만 해둠)
	// (오버라이딩) "구체적인 내용은 자식 클래스에서 정의한다." (후정의)
	
	public void SetTime(int h, int m) {	// 구체화된 메소드
		System.out.println("현재 시각: "+h+"시 "+m+"분");
	}
}

// 완전한 클래스
class Alert extends Alarm{
	// 멤버: bip(), SetTime()
	public void bip() {		// 부모 클래스의 추상 메소드 정의
		System.out.println("bippppp");
	}
}

// 클래스, 상속, "오버라이딩", super
public class Abstract {
	public static void main(String[] args) {
		// "추상 클래스 통해서 객체 생성X"
		// 구체적으로 정의가 된 클래스 통해서만 객체 생성O
		
		// Alarm al=new Alarm();	-> 오류
		Alert al=new Alert();
		
		al.SetTime(14, 19);
		al.bip();
	}
}



