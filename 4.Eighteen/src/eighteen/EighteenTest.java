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
		
		System.out.println("������ �����մϴ�..\n.\n.\n.\n");
		
		System.out.println("ù��° ī��");
		
		User.Turnone();
		User.ShowCard();
		
		Jack.Turnone();
		Jack.ShowCard();
		
		Dale.Turnone();
		Dale.ShowCard();
		
		Hana.Turnone();
		Hana.ShowCard();
		
		System.out.println("ī�带 ��ȯ�Ͻðڽ��ϱ�?\n(Y/N)");
		
		String select = scanner.next();
		
		if (select.equals("Y")) {
			System.out.println("������ ī�带 ��ȯ�Ͻðڽ��ϱ�?");
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
        	System.out.println("���� �÷��̾��Դϴ�. \n\n\n");
			}
		}
		else
			game = false;
		
		
		System.out.println("�ι��� ī�带 �����մϴ�..\n.\n.\n.\n");
		System.out.println("�ι�° ī��");
		
		User.Turntwo();
		User.ShowCard();
		
		Jack.Turntwo();
		Jack.ShowCard();
		
		Dale.Turntwo();
		Dale.ShowCard();
		
		Hana.Turntwo();
		Hana.ShowCard();
		
		if (select.equals("Y")) {
			System.out.println("������ ī�带 ��ȯ�Ͻðڽ��ϱ�?");
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
        	System.out.println("���� �÷��̾��Դϴ�. \n\n\n");
			}
		}
		
		System.out.println("����° ī��");
		
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


