package eighteen;

import java.util.Scanner;

public class EigteenTest {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		Player User = new Player("User");
		Player Jack = new Player("Jack");
		Player Dale = new Player("Dale");
		Player Hana = new Player("Hana");
		int temp;
		boolean game = true;
		
		System.out.println("게임을 시작합니다..\n.\n.\n.\n");
		
		System.out.println("첫번째 카드");
		
		User.Turnone();
		User.ShowCard();
		
		Jack.Turnone();
		Jack.ShowCard();
		
		Dale.Turnone();
		Dale.ShowCard();
		
		Hana.Turnone();
		Hana.ShowCard();
		
		System.out.println("카드를 교환하시겠습니까?\n(Y/N)");
		
		String select = scanner.next();
		
		if (select.equals("Y")) {
			System.out.println("누구와 카드를 교환하시겠습니까?");
			String selectName = scanner.next();
			 
			switch(selectName) {
			
			case("Jack"):
			
				temp = User.card[0];
				User.card[0] = Jack.card[0];
				Jack.card[0] = temp;
				break;
				
			case("Dale"):
			
				temp = User.card[0];
				User.card[0] = Dale.card[0];
				Dale.card[0] = temp;
				break;
				
			case("Hana"): 
			
				temp = User.card[0];
				User.card[0] = Hana.card[0];
				Hana.card[0] = temp;
				break;
				
			default:
        	System.out.println("없는 플레이어입니다. \n\n\n");
			}
		}
		else
			game = false;
		
		
		System.out.println("두번쨰 카드를 오픈합니다..\n.\n.\n.\n");
		System.out.println("두번째 카드");
		
		User.Turntwo();
		User.ShowCard();
		
		Jack.Turntwo();
		Jack.ShowCard();
		
		Dale.Turntwo();
		Dale.ShowCard();
		
		Hana.Turntwo();
		Hana.ShowCard();
		
		if (select.equals("Y")) {
			System.out.println("누구와 카드를 교환하시겠습니까?");
			String selectName = scanner.next();
			 
			switch(selectName) {
			
			case("Jack"):
			
				temp = User.card[1];
				User.card[1] = Jack.card[1];
				Jack.card[1] = temp;
				break;
				
			case("Dale"):
			
				temp = User.card[1];
				User.card[1] = Dale.card[1];
				Dale.card[1] = temp;
				break;
				
			case("Hana"): 
			
				temp = User.card[1];
				User.card[1] = Hana.card[1];
				Hana.card[1] = temp;
				break;
				
			default:
        	System.out.println("없는 플레이어입니다. \n\n\n");
			}
		}
		
		System.out.println("세번째 카드");
		
		User.Turnthree();
		User.ShowCard();
		
		Jack.Turnthree();
		Jack.ShowCard();
		
		Dale.Turnthree();
		Dale.ShowCard();
		
		Hana.Turnthree();
		Hana.ShowCard();
		}
	}


