package capitalCityQuiz;

import java.util.Scanner;
import java.util.Vector;

public class MapQuiz {
		private String name; 							// CityQuiz ���α׷��� �̸�
		private Scanner scanner = new Scanner(System.in);
		private Vector<City> v;

		public MapQuiz(String name) {
			this.name = name;
			
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
}