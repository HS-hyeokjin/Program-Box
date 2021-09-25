package eighteen;

import java.util.Scanner;

public class EighteenTest {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		Player User = new Player("User");
		Player Jack = new Player("Jack");
		Player Dale = new Player("Dale");
		Player Hana = new Player("Hana");
		int temp;
		int	Usersum = 0;
		int Jacksum = 0;
		int Dalesum = 0;
		int Hanasum = 0;
		boolean one = true;
		boolean two = true;

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
		
		while(one) {
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
	        	break;
			}
			System.out.println("카드를 교환을 완료 하였습니다,");
			User.ShowCard();
			Jack.ShowCard();
			Dale.ShowCard();
			Hana.ShowCard();

		}
		else
			one = false;
		
		}
		
		
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
		
		while(two) {

		System.out.println("카드를 교환하시겠습니까?\n(Y/N)");
		
		String select = scanner.next();
		

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
        	break;
			}
			System.out.println("카드를 교환을 완료 하였습니다,");
			User.ShowCard();
			Jack.ShowCard();
			Dale.ShowCard();
			Hana.ShowCard();
		}
		else
			two = false;
		}
		System.out.println("마지막 카드를 오픈합니다.");
		
		User.Turnthree();
		User.ShowCard();
		
		Jack.Turnthree();
		Jack.ShowCard();
		
		Dale.Turnthree();
		Dale.ShowCard();
		
		Hana.Turnthree();
		Hana.ShowCard();
		
    	System.out.println("\n\n\n\n 결과는... \n.\n.\n.\n");

		for (int i = 0; i < User.card.length; i++) {
			Usersum += User.card[i];
			}
		for (int i = 0; i < Jack.card.length; i++) {
			Jacksum += Jack.card[i];
			}
		for (int i = 0; i < Dale.card.length; i++) {
			Dalesum += Dale.card[i];
			}
		for (int i = 0; i < Hana.card.length; i++) {
			Hanasum += Hana.card[i];
			}
		System.out.println("User       " + Usersum);
		System.out.println("Jack       " + Jacksum);
		System.out.println("Dale       " + Dalesum);
		System.out.println("Hana       " + Hanasum+"\n\n\n\n");
		
		Usersum = Usersum - 18;
		Jacksum = Jacksum - 18;
		Dalesum = Dalesum - 18;
		Hanasum = Hanasum - 18;
		
		if(Usersum > 0) {
			System.out.println("패배 하였습니다.");
		}
		else if(Usersum > Jacksum && Usersum > Dalesum && Usersum > Hanasum) {
			System.out.println("승리 하였습니다.");
		}
			else
				System.out.println("비겼습니다.");
		}
	}


