package quiz;

public class SongExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 음원을 관리하는 
		// Song 클래스를 제작
		// 제목과 가수명, 좋아요 수를 넣고 출력한다.
		Song song = new Song();
		song.title = "HOME SWEET HOME";
		song.singer = "G-DRAGON";
		song.like = 119900;
	
		
		System.out.println(song.title + song.singer + song.like);
		
		song.setTitle("지드래곤 들어가");
		System.out.println("song 출력 : " + song.title);
		
		Song song3 = new Song();
		song3.setTitle("Whiplash");
		System.out.println("song3 출력 : " + song3.title);
		
		Song method = new Song();
		method.plus(1,2);
	       	
	}

}
