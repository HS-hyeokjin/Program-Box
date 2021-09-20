package eighteen;

public class EigteenTest {

	public static void main(String[] args) {
		
		Player User = new Player("User");
		Player Jack = new Player("Jack");
		Player Daniel = new Player("Daniel");
		Player House = new Player("House");

		
		
		
		System.out.println("게임을 시작합니다..\n.\n.\n.\n");
		
		Player.Turnone();
		User.ShowCard();
		Jack.ShowCard();
		Daniel.ShowCard();
		House.ShowCard();

	}
}