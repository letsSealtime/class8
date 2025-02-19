package sec01.exam01;

public class Radio implements RemoteControl2 {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		int vol = volume;
		
		if(vol > MAX_VOLUME) vol = MAX_VOLUME;
		if(vol < MIN_VOLUME) vol = MIN_VOLUME;
		
		System.out.println(volume + "로 볼륨을 바꾼다.");
		
	}

	
	
	
}
