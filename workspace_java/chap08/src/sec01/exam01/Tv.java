package sec01.exam01;

public class Tv implements RemoteControl,Searchable {
	
	
	int volume; 
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("tv를 켭니다.");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("tv를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		
		
		int result = 0;
		if(volume < MIN_VOLUME)
			result = RemoteControl.MIN_VOLUME;
		if(volume > MAX_VOLUME)
			result = RemoteControl.MAX_VOLUME;
		
		this.volume = result;
		
	}
		// TODO Auto-generated method stub
//		if (volume < MIN_VOLUME) {
//			System.out.println("0~10 사이의 값을 입력하세용");
//		} else if (volume > MAX_VOLUME) {
//			System.out.println("0~10 사이의 값을 입력하세용");
//		} else {
//			this.volume= volume;
//			System.out.println(volume + "로 볼륨을 바꿉니다.");
//		}
	
		
	
	@Override
	public void search(String text) {
		System.out.println("TV로 " + text + "를 검색하는 중...");
	}
	
	
	
	
	
	

}
