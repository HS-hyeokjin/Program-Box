package eighteen;

import java.util.Scanner;
import java.util.Random;


public class Player {
	static Scanner scanner = new Scanner(System.in);
	
	public String name;
	public int card[] = {0,0,0};

	public Player(String name) {
		this.name = name;
	}
	
	public int Turnone() {                             //첫번째 턴 메소드
		
		return card[0] = (int) ((Math.random()*8)+1);
		
	}
	public int Turntwo() {                              //두번째 턴 메소드		
		
		return card[1] = (int) ((Math.random()*8)+1);
		
	}
	public int Turnthree() {                             //세번째 턴 메소드	
		
		return card[2] = (int) ((Math.random()*8)+1);
		
	}
	public void ShowCard(){		//카드 출력 메소드
		
		System.out.print(name + "     ");

		for (int i = 0; i < card.length; i++) {
			System.out.print(card[i] + "   ");
		}
		System.out.println();
	}
	
}

