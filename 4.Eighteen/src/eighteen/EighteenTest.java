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
		
		while(one) {
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
	        	break;
			}
			System.out.println("ī�带 ��ȯ�� �Ϸ� �Ͽ����ϴ�,");
			User.ShowCard();
			Jack.ShowCard();
			Dale.ShowCard();
			Hana.ShowCard();

		}
		else
			one = false;
		
		}
		
		
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
		
		while(two) {

		System.out.println("ī�带 ��ȯ�Ͻðڽ��ϱ�?\n(Y/N)");
		
		String select = scanner.next();
		

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
        	break;
			}
			System.out.println("ī�带 ��ȯ�� �Ϸ� �Ͽ����ϴ�,");
			User.ShowCard();
			Jack.ShowCard();
			Dale.ShowCard();
			Hana.ShowCard();
		}
		else
			two = false;
		}
		System.out.println("������ ī�带 �����մϴ�.");
		
		User.Turnthree();
		User.ShowCard();
		
		Jack.Turnthree();
		Jack.ShowCard();
		
		Dale.Turnthree();
		Dale.ShowCard();
		
		Hana.Turnthree();
		Hana.ShowCard();
		
    	System.out.println("\n\n\n\n �����... \n.\n.\n.\n");

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
			System.out.println("�й� �Ͽ����ϴ�.");
		}
		else if(Usersum > Jacksum && Usersum > Dalesum && Usersum > Hanasum) {
			System.out.println("�¸� �Ͽ����ϴ�.");
		}
			else
				System.out.println("�����ϴ�.");
		}
	}


