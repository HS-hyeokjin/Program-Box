package capitalCityQuiz;

import java.util.Scanner;

public class QuizTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MapQuiz quiz = new MapQuiz();
		int select;
		
		System.out.println("���� ���߱� ������ �����մϴ�.");
		System.out.println("���Ͻô� �޴��� ������ �ּ���.");
		System.out.println("(1)���� �Է� (2)�׽�Ʈ ����(3)�ý��� ����");
		
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