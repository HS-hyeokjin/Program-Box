package eighteen;

import java.util.Scanner;
import java.util.Random;


public class Player {
	Scanner scanner = new Scanner(System.in);
	
	public String name;
	public static int card[] = {0,0,0};

	public Player(String name) {
		this.name = name;
	}
	
	public static int Turnone() {                              //첫번째 턴 메소드
		Random randomValue = new Random();		
		return card[0] = (int) ((Math.random()*8)+1);
		
		
		
	}
	public static int Turntwo() {                              //두번째 턴 메소드
		Random randomValue = new Random();		
		
		return card[1] = ((randomValue.nextInt(8) + 1));
		
		
	}
	public static int Turnthree() {                              //세번째 턴 메소드
		Random randomValue = new Random();		
		
		return card[2] = ((randomValue.nextInt(8) + 1));
		
		
	}
	public static void ShowCard(){
		for (int i = 0; i < card.length; i++) {
			System.out.print(card[i] + "   ");

	}
	}
}

