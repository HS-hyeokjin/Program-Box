package capitalCityQuiz;

import java.util.Scanner;

public class QuizTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MapQuiz quiz = new MapQuiz();
		int select;
		boolean game = true;
		
		System.out.println("���� ���߱� ������ �����մϴ�.");
		System.out.println("���Ͻô� �޴��� ������ �ּ���.");
		
		while(game) {
		System.out.println("(1)���� �Է� (2)�׽�Ʈ ���� (3)��ü ��ȸ (4)���α׷� ����");
		
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