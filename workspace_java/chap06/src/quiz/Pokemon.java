package quiz;

import java.util.ArrayList;

public class Pokemon {

//	포켓몬Pokemon
//	이름
//	타입
//	2단계
//	공격(){
//		syso('피카~')
//	}
//
//	포켓몬리그League
//	생성할때 무조건 리그 이름
//
//	참가포켓몬배열[10]
//	참가포켓몬ArrayList (add(), get())
//
//	참가정보()
//		모든 참가포켓몬의 이름,타입 출력
//
//	참가(포켓몬)
//		참가포켓몬배열에 추가
	
	ArrayList<String> pokemonName = new ArrayList<>();
	ArrayList<String> pokemonType = new ArrayList<>();
	
	void pokemon(String x) {
	pokemonName.add(x);
	}
	
	void type(String x) {
	pokemonType.add(x);
	}
	
	void league(String x, String y) {
		System.out.println("리그에 새로운 포켓몬을 추가 : "+x);
		pokemon(x);
		type(y);
	}
	
	
	void leagueEntry() {
		System.out.println("모든 포켓몬을 조회합니다.");
		for(int i=0; i<pokemonName.size(); i++) {
			System.out.println("포켓몬 이름 : " + pokemonName.get(i)+", 포켓몬 속성 : "+pokemonType.get(i));
		}
	}
	
	void attack() {
		System.out.println("무엇을 할까?");
		for(int i=0; i<pokemonName.size(); i++) {
			System.out.println(pokemonName.get(i)+"의 공격!");
	}
}
	
}
// 여기엔 포켓만 데이터만 들어감.