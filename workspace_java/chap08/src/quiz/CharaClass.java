package quiz;

public class CharaClass extends CharaSkill {

	void classChange() {
		System.out.println("전직합니당");
	}
	
	void warrior() {
		defenseSkill();
	}
	
	void mage() {
		attackSkill();
	}
	
	void priest() {
		healSkill();
	}
	
	void paladin() {
		defenseSkill();
		healSkill();
	}
	
	
}
