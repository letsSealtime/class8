package sec01.exam01;

public interface RemoteControl {

	int MIN_VOLUME = 0;
	int MAX_VOLUME = 10;
	// 상수. (= 변경되지 않는 변수 static final)
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	void search(String text);
	
	default void mic (String text) {
		
	}
	// default 는 구현 메서드
	// 자식들에게 오버라이드를 강제하지 않는다. 
	
}
