package quiz;

public class Warmer {

	// 전원 켜기 기능
	// 전원 끄기 기능
	// 저온 발열 기능 (단, 전원이 켜져 있을 때만)
	// 고온 발열 기능 (단, 전원이 켜져 있을 때만)
	// 발열 중지 기능 (단, 전원이 켜져 있을 때만)
	// 상태 표시 기능 (전원 상태와 발열 상태)
	// 2대 틀어서 하나는 강풍, 하나는 열풍 틀기
	
	// 필드 : power(boolean), 강도(int 0~4),
	// 메소드 : void 전원 온옾 / void 강도 조절(if) / void 상태 표시
	
	boolean power;
	String level;
	
	void powerOn(){
		this.power = true;
		System.out.println("전원을 킵니다.");
	}
	
	void powerOff(){
		this.power = false;
		System.out.println("전원을 끕니다.");
	}
	

	void level(String wind) {
		if (this.power == true) {
			if (wind.equals("저온") || wind.equals("고온")) {
				if (wind.equals("저온")) {
					level = wind;
					System.out.println(wind + "모드를 실행합니다.");
				} else if (wind.equals("고온")) {
					level = wind;
					System.out.println(wind + "모드를 실행합니다.");
				}
			} else {
				System.out.println("제대로 된 값을 입력해 주세요.");
			}
		} else {
			System.out.println("전원을 켜고 실행해 주세요.");
		}
	}
	
}
