package capitalCityQuiz;

import java.util.Scanner;

public class QuizTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MapQuiz quiz = new MapQuiz();
		int select;
		
		System.out.println("수도 맞추기 게임을 시작합니다.");
		System.out.println("원하시는 메뉴를 선택해 주세요.");
		System.out.println("(1)문제 입력 (2)테스트 시작(3)시스템 종료");
		
		select = scanner.nextInt();
		
		switch(select) {
		
		case(1):
			quiz.insert();
		
		case(2):
			quiz.StartQuiz();
			break;
		case(3):
			break;
		}
	}
}