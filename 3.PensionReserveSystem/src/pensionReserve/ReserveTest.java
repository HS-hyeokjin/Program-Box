package pensionReserve;

import java.util.Scanner;

public class ReserveTest {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Pension pension = new Pension();
		boolean exit = true;
		while(exit) {
		System.out.println("원하시는 메뉴를 선택해 주세요");
		System.out.println("(1)예약 (2)조회 (3)예약취소 (4)종료");

		String select = scanner.next();
		
		
		switch(select){
			case("예약"):
				Pension.selectPension();
			break;
			case("조회"):
				Pension.viewReserve();
			break;
			case("예약취소"):
				Pension.cancelReserve();
			break;
			case("종료"):	
				System.out.println("시스템을 종료합니다.");
				exit = false;
			break;
			
	        
			default:
	        	System.out.println("다시 입력해 주세요.");
		}	
		
	}
}
}