package eighteen;

import java.util.Scanner;

public class EigteenTest {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		Player User = new Player("User");
		Player Jack = new Player("Jack");
		Player Dale = new Player("Dale");
		Player Hana = new Player("Hana");

		
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
		
		changeCard();

		System.out.println("�ι�° ī��");
		
		User.Turntwo();
		User.ShowCard();
		
		Jack.Turntwo();
		Jack.ShowCard();
		
		Dale.Turntwo();
		Dale.ShowCard();
		
		Hana.Turntwo();
		Hana.ShowCard();
		
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
	
	public static void changeCard() {
		System.out.println("ī�带 ��ȯ�Ͻðڽ��ϱ�?\n(Y/N)");
		String select = scanner.next();
		if (select.equals("Y")) {
			System.out.println("������ ī�带 ��ȯ�Ͻðڽ��ϱ�?");
			String selectName = scanner.next();
			if(selectName.equals("Jack")) {
				
				
			}

		}
	}
}