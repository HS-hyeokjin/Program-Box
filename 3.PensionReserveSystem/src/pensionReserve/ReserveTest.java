package pensionReserve;

import java.util.Scanner;

public class ReserveTest {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Pension pension = new Pension();
		boolean exit = true;
		while(exit) {
		System.out.println("���Ͻô� �޴��� ������ �ּ���");
		System.out.println("(1)���� (2)��ȸ (3)������� (4)����");

		String select = scanner.next();
		
		
		switch(select){
			case("����"):
				Pension.selectPension();
			break;
			case("��ȸ"):
				Pension.viewReserve();
			break;
			case("�������"):
				Pension.cancelReserve();
			break;
			case("����"):	
				System.out.println("�ý����� �����մϴ�.");
				exit = false;
			break;
			
	        
			default:
	        	System.out.println("�ٽ� �Է��� �ּ���.");
		}	
		
	}
}
}