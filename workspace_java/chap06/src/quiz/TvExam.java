package quiz;

import java.util.Scanner;

public class TvExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv = new Tv();
		tv.powerOn();
		tv.volumeChg("UP");
		tv.channelChg(58);
		tv.channelChg("DOWN");
		tv.tvnow();
		
		tv.start();
		
	
	}

}
