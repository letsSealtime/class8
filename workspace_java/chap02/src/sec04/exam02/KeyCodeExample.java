package sec04.exam02;

import java.io.IOException;
import java.util.Scanner;

public class KeyCodeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int KeyCode;
//		try {
//			KeyCode = System.in.read();
//			System.out.println(KeyCode);
//			
//			KeyCode = System.in.read();
//			System.out.println(KeyCode);
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Scanner scanner = new Scanner(System.in);
		
		String inputDate = scanner.nextLine();
		System.out.println(inputDate);
		
	}

}
