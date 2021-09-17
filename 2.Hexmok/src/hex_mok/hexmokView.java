package hex_mok;

import java.util.Scanner;

public class hexmokView {
	public static void main(String[] args) {
		
		int gameState = 0; 		
    
		int turn = 0; 			
    
		char x = '\u0000'; 		
    
		int y = 0; 				
		
		hexmokImpl o = new hexmokImpl(); 
		
		Scanner sc = new Scanner(System.in);
		
		while(gameState == 0) {
			o.viewhexmok();		
			
			System.out.println("x 좌표를 입력하세요.");
			x = sc.next().charAt(0);
			System.out.println("y 좌표를 입력하세요.");
			y = sc.nextInt();
			
			if(turn == 1)
				turn = 2;
			else if(turn == 2)
				turn = 3;
			else 
				turn = 1;

			
			gameState = o.hexmokAction(x, y, turn);
		}
		
		o.viewhexmok();			

		System.out.println("게임이 끝났습니다.");
		sc.close();
	}
}