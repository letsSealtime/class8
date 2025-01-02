package quiz;

import java.util.Scanner;

public class Tv {

	// 전원 기능
	// 볼륨 기능 (0~10)
	// 볼륨은 up, down만 가능
	// 채널 기능 up, down, 직접 입력
	// 현재 정보 보기(전원, 채널, 볼륨)
	
	// 필드 : (boolean)power, (int)volume, (int)channel
	// 메소드 : powerOn, String volumeChg, int channel & String channel
	
	boolean power;
	int volume; 
	int channel;
	
	
	void powerOn(){
		this.power = true;
		System.out.println("전원을 킵니다.");
	}
	
	void powerOff(){
		this.power = false;
		System.out.println("전원을 끕니다.");
	}
	
	
	void volumeChg(String button) {
		if (this.power = true) {
			// 전원이 켜짐 : UP, DOWN
			// UP : if volume > 10 = 10;
			if (button.equals("UP")) {
				this.volume += 1;
				if (this.volume > 10) {
					this.volume = 10;
				}
				System.out.println("현재 볼륨 : " + this.volume);
			} else if (button.equals("DOWN")) {
				this.volume -= 1;
				if (this.volume < 0) {
					this.volume = 0;
				}
				System.out.println("현재 볼륨 : " + this.volume);
			}
			// 이상한 거 입력
			else {
				System.out.println("제대로 된 값을 입력해 주세요.");
			}
		} else {
			System.out.println("전원을 키고 실행해 주세요.");
		}
	}
	
	void channelChg(int channel) {
		// 전원 켜져 있어야함.
		// 입력한 숫자로 채널 이동.
		// 이상한 거 입력하면 채널 범위 안으로 입력하세요.
		if (this.power == true) {
			if (this.channel >= 0 || this.channel < 1000) {
				this.channel = channel;
				System.out.println("채널 " + this.channel + "번으로 이동합니다.");	
				}
			else {
				System.out.println("채널 범위 안의 값을 입력해 주세요.");
			}
		}
		if (this.power == false) {
			System.out.println("전원을 키고 실행해 주세요.");
		}
	}
	
	void channelChg(String channel) {
		// 전원 켜져 있어야함.
		// 업다운으로 +- 1
		// -1이 되면 1000번으로 이동 / 1001이 되면 0번으로 이동
		if (this.power == true) {
			if (channel.equals("UP")) {
				this.channel += 1;
				if (this.channel == 1000) {
					this.channel = 0;
				}
				System.out.println("채널 " + this.channel + "번으로 이동합니다.");
			} else if (channel.equals("DOWN")) {
				this.channel -= 1;
				if (this.channel == 0) {
					this.channel = 1000;
				}
				System.out.println("채널 " + this.channel + "번으로 이동합니다.");
			} else {
				System.out.println("채널 범위 안의 값을 입력해 주세요.");
			}
		}
		if (this.power == false) {
			System.out.println("전원을 키고 실행해 주세요.");
		}
	}
	
	
	void tvnow() {
		System.out.println("--------------");
		System.out.println("현재 상태 출력");
		System.out.println("현재 볼륨은 : " + this.volume);
		System.out.println("현재 채널은 : " + this.channel);
		System.out.println("--------------");
	}
	
	/*
	 * UP / DOWN 게임 
	 * 생성시에 임의의 숫자 정하기 (1~10)
	 * 정답 시도시 감이 오는 숫자 넣기
	 * 결과 : 정답, UP, DOWN
	 * 정답 맞출 때까지, 또는 기회 5번 안에 맞추기
	 * 몰래 정답 보기
	 *  */
	
	// random.math로 1~10의 숫자 생성 > 변수 answer
	// opt -1 = 0 out of 
	// try(try) answer > try DOWN 
	// answer == try 정답~
	// 정답은? answer
	
	// 필드 : answer, opt
	// 메소드 : 게임 시작, 추라이, 정답은?, 기회 다씀 > 정답은?
	
	int answer;
	int opt; 
	
	
	void start() {
		this.answer = (int)((Math.random()*10)+1);
		this.opt = 5;
		System.out.println("게임을 시작합니다. 1~10의 수를 입력해 주세요. 기회는 5번.");
		Scanner scan = new Scanner(System.in);
		int updown = scan.nextInt();
		trytry(updown);
	}
	
	
	
	void trytry(int updown) {
		if (updown > 0 && updown < 10) {
			if (this.answer < updown) {
				System.out.println("DOWN");
				this.again();
			} else if (this.answer > updown) {
				System.out.println("UP");
				this.again();
			} else if (this.answer == updown) {
				System.out.println("정답! 맞췄어요!");
			}
		} else {
			System.out.println("범위 안의 숫자를 입력해 주세요.");
			this.again();
		}
	}

	void again() {
		this.opt -= 1;
		if (this.opt == 0) {
			this.loser();
			}
		System.out.println("남은 기회는 : " + this.opt + "번");
		Scanner scan = new Scanner(System.in);
		int updown = scan.nextInt();
		trytry(updown);
			
	}
	
	
	void givehint() {
		System.out.println("정답은... " + this.answer + "이었지롱~");
	}

	void loser() {
		System.out.println("기회를 다 써버렸어요!");
		this.givehint();
	}
	
	
}
