package quiz;

public class Character implements CharaBasic {

	@Override
	public void makeChara(String nickname) {
		String nick = nickname;
		System.out.println("캐릭터를 생성합니다. 닉네임 : " + nick);
	}

	@Override
	public void attack() {
		System.out.println("기본 공격");
	}

	@Override
	public void defense() {
		System.out.println("기본 방어");
	}

}
