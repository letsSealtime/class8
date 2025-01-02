package sec03.exam01;

public class GimbabExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gimbab 천안역점 = new Gimbab(1000);
		천안역점.order(0);
		
		천안역점.print(0,3);
		천안역점.allMenu();
		
		// 달리는 국비생... 게임... 
		// [지하철, 버스] [신호등 건너기, 달리기] [엘레베이터, 계단]
		// 루트를 선택해서 좟나 달려
		// 확률로 배드 이벤트가 등장? < 구현 가능? 할? 듯?
		// 한 요소를 선택할 때마다 시간이 흐름
		// 9:10까지 도착해야함. 
		// 9:11에 도착하면 너는 지각에 3일을 지각하면 1일 결석이 된다.
		
	}

}
