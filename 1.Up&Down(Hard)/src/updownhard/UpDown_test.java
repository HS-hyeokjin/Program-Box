package updownhard;

import java.util.Scanner;

public class UpDown_test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str[] = {"����","����","��"};          
		int comRand = (int)(Math.random()*3);	//��ǻ�� ���� 0,1,2
		int comRandNumber = (int)(Math.random()*99);
		String userStr, comStr;
		int userNumber;
		
		comStr = str[comRand];		
		
		boolean terminer = true;
		
		System.out.println("���� ����\n����, ������������ �����մϴ�\n���ӿ��� �̱��� 2��\n���ӿ��� ����� 1��\n���ӿ��� �� ��� �й��մϴ�.\n��ȸ�� �ֿ����� UP&DOWN ������ �����մϴ�.");
		
		while(terminer) {
		System.out.print("���� ���� ��!\n>>");
		
		userStr = scanner.next();
		
		if(userStr.equals(comStr)) {
			System.out.print("�����ϴ� �ѹ��� ��ȸ�� �帮�ڽ��ϴ�.\n���ڸ� �Է��ϼ���.\n>>");
			userNumber = scanner.nextInt();
			if(userNumber == comRandNumber) {
				System.out.println("���� ���ڴ�" + comRandNumber + "�Դϴ�.\n����ϱ���! ���ӿ��� �̰���ϴ�");
				break;
				}
			else if(userNumber > comRandNumber) {
				System.out.println("Down!"); 
				}
			else if(userNumber < comRandNumber) {
				System.out.println("UP!");
				}
			} 
		
		else if((userStr.equals("����") && comStr.equals("����")) || 
				(userStr.equals("����") && comStr.equals("��")) || 
				(userStr.equals("��") && comStr.equals("����"))) {
			
			System.out.print("����� �̰���ϴ�.\n�ι��� ��ȸ�� �帮�ڽ��ϴ�.\n���ڸ� �Է��ϼ���.\\n>>");
			for(int i=0; i<=1; i++) 
				{
			userNumber = scanner.nextInt();
			if(userNumber == comRandNumber) {
				System.out.println("���� ���ڴ�" + comRandNumber + "�Դϴ�\n����ϱ���! ���ӿ��� �̰���ϴ�");
				terminer = false;
				break;
				}
			else if(userNumber > comRandNumber) {
				System.out.println("Down!");}
			else if(userNumber < comRandNumber) {
				System.out.println("UP!");}
				}
			} 
			
			else if((userStr.equals("����") && comStr.equals("��")) || (userStr.equals("����") && comStr.equals("����")) || (userStr.equals("��") && comStr.equals("����"))) {
			System.out.println("����� �����ϴ�.\n ���� �� ���տ��� ���������");
			break;}

		}
	}
}
