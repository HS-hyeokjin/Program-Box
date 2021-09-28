package capitalCityQuiz;

import java.util.Scanner;

public class QuizTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MapQuiz quiz = new MapQuiz();
		int select;
		boolean game = true;
		
		System.out.println("수도 맞추기 게임을 시작합니다.");
		System.out.println("원하시는 메뉴를 선택해 주세요.");
		
		while(game) {
		System.out.println("(1)문제 입력 (2)테스트 시작 (3)전체 조회 (4)프로그램 종료");
		
		select = scanner.nextInt();
		
		switch(select) {
		
		case(1):
			quiz.insert();
			break;
		case(2):
			quiz.StartQuiz();
			break;
		case(3):
			quiz.view();
			break;
		case(4):
			quiz.finish();
			game = false;
			break;
			
		}
		
		}
		scanner.close();
	}
	
}