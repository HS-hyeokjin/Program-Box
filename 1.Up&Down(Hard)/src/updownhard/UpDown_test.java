package updownhard;

import java.util.Scanner;

public class UpDown_test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str[] = {"가위","바위","보"};          
		int comRand = (int)(Math.random()*3);	//컴퓨터 랜덤 0,1,2
		int comRandNumber = (int)(Math.random()*99);
		String userStr, comStr;
		int userNumber;
		
		comStr = str[comRand];		
		
		boolean terminer = true;
		
		System.out.println("게임 설명\n먼저, 가위바위보를 시작합니다\n게임에서 이길경우 2번\n게임에서 비길경우 1번\n게임에서 질 경우 패배합니다.\n기회가 주워지면 UP&DOWN 게임을 시작합니다.");
		
		while(terminer) {
		System.out.print("가위 바위 보!\n>>");
		
		userStr = scanner.next();
		
		if(userStr.equals(comStr)) {
			System.out.print("비겼습니다 한번에 기회를 드리겠습니다.\n숫자를 입력하세요.\n>>");
			userNumber = scanner.nextInt();
			if(userNumber == comRandNumber) {
				System.out.println("저의 숫자는" + comRandNumber + "입니다.\n대단하군요! 게임에서 이겼습니다");
				break;
				}
			else if(userNumber > comRandNumber) {
				System.out.println("Down!"); 
				}
			else if(userNumber < comRandNumber) {
				System.out.println("UP!");
				}
			} 
		
		else if((userStr.equals("바위") && comStr.equals("가위")) || 
				(userStr.equals("가위") && comStr.equals("보")) || 
				(userStr.equals("보") && comStr.equals("바위"))) {
			
			System.out.print("당신이 이겼습니다.\n두번에 기회를 드리겠습니다.\n숫자를 입력하세요.\\n>>");
			for(int i=0; i<=1; i++) 
				{
			userNumber = scanner.nextInt();
			if(userNumber == comRandNumber) {
				System.out.println("저의 숫자는" + comRandNumber + "입니다\n대단하군요! 게임에서 이겼습니다");
				terminer = false;
				break;
				}
			else if(userNumber > comRandNumber) {
				System.out.println("Down!");}
			else if(userNumber < comRandNumber) {
				System.out.println("UP!");}
				}
			} 
			
			else if((userStr.equals("바위") && comStr.equals("보")) || (userStr.equals("가위") && comStr.equals("바위")) || (userStr.equals("보") && comStr.equals("가위"))) {
			System.out.println("당신이 졌습니다.\n 당장 내 눈앞에서 사라지세요");
			break;}

		}
	}
}
