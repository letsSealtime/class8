package sec01.exam01;

public interface RemoteControl2 {

	int MIN_VOLUME = 0;
	int MAX_VOLUME = 100;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}
