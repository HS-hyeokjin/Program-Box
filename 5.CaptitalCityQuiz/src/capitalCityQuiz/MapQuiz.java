package capitalCityQuiz;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class MapQuiz {
		Scanner scanner = new Scanner(System.in);
	
		private Vector<City> v;

		public MapQuiz() {
			
			v = new Vector<>();
			v.add(new City("�ѱ�", "����"));
			v.add(new City("�߱�", "����¡"));
			v.add(new City("�ʸ���", "���Ҷ�"));
			v.add(new City("������ī", "�ݷҺ�"));
			v.add(new City("�ε��׽þ�", "��ī��Ÿ"));
			v.add(new City("����ī�Ͻ�ź", "ī��"));
			v.add(new City("����", "�糪"));
			v.add(new City("īŸ��", "����"));
			v.add(new City("Ÿ�̿�", "Ÿ�̺���"));
			v.add(new City("��Ű", "��ī��"));
			v.add(new City("����", "īƮ����"));
			v.add(new City("�ε�", "������"));
			v.add(new City("Ÿ��", "����"));
			v.add(new City("�Ϻ�", "����"));
			v.add(new City("�̱�", "������"));
			v.add(new City("ĳ����", "��Ÿ��"));
			v.add(new City("�ݷҺ��", "����Ÿ"));
			v.add(new City("����Ʈ", "ī�̷�"));
			v.add(new City("����", "����"));
			v.add(new City("��������", "������"));
			v.add(new City("����ũ", "�����ϰ�"));
			v.add(new City("������", "����Ȧ��"));
			v.add(new City("���Ϸ���", "����"));
			v.add(new City("��Ż����", "�θ�"));
			v.add(new City("��������", "������"));
			v.add(new City("����Ʈ���ϸ���", "ĵ����"));
			v.add(new City("�ɶ���", "���Ű"));
	
		}

		public void insert() {
			System.out.println("X�� �Է��ϸ� �Է��� �����մϴ�.");
			while(true) {
				System.out.print("���� ���� �Է� >> ");
				String Contry = scanner.next(); 
				if(Contry.equals("X"))
					break;
				
				String City = scanner.next(); 
				v.add(new City(Contry, City));
			}		
		}
		
		public void StartQuiz() {
			System.out.println("���� " + v.size() + "���� ������ ��� �ֽ��ϴ�. X�� �Է��ϸ� �׽�Ʈ�� �����մϴ�.");
			while(true) { 
				int ex1 = (int)(Math.random()*v.size()); 			
				String contry = v.get(ex1).getContry();				 
				
				int example[] = new int [4];
				
				int answerLoc = makeExample(example, ex1); 
				example[answerLoc] = ex1;

				System.out.println(contry + "?");
				
				for(int i=0; i<example.length; i++)
					System.out.print("(" + (i+1) + ")" + v.get(example[i]).getCity() + " "); // ���� ���
				
				
				System.out.print(":>"); 
				try {
					int in = scanner.nextInt(); 
					if(in == -1) 
						break; 
					
					in--;
					if(in == answerLoc)
						System.out.println("�����Դϴ�.");
					else
						System.out.println("Ʋ�Ƚ��ϴ�.");
				}
				catch(InputMismatchException e) {
					scanner.next(); 
					System.out.println("���ڸ� �Է��ϼ��� !!");
			
				}
			}		
		}
		
		public int makeExample(int ex[], int answerIndex) {
			int n[] = {-1, -1, -1, -1}; 
			int index;
			for(int i=0; i<n.length; i++) {
				do {
					index = (int)(Math.random()*v.size());
				} while(index == answerIndex || exists (n, index)); // �ٽ� �õ�
				n[i] = index;
			}

			for(int i=0; i<n.length; i++) ex[i] = n[i];
			return (int)(Math.random()*n.length); 
		}
		
		private boolean exists(int n[], int index) {
			for(int i=0; i<n.length; i++) {
				if(n[i] == index)
					return true;
			}
			return false;
		}
		public void view() {
			for (int i = 0; i < v.size(); i++) {
				System.out.println(v.get(i));
				}
		}
		
		public void finish() {
			System.out.println("���α׷��� �����մϴ�.");
		}
}