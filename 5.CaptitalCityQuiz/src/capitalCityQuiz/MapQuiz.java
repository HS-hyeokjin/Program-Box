package capitalCityQuiz;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class MapQuiz {
		Scanner scanner = new Scanner(System.in);
	
		private Vector<City> v;

		public MapQuiz() {
			
			v = new Vector<>();
			v.add(new City("한국", "서울"));
			v.add(new City("중국", "베이징"));
			v.add(new City("필리핀", "마닐라"));
			v.add(new City("스리랑카", "콜롬보"));
			v.add(new City("인도네시아", "자카르타"));
			v.add(new City("아프카니스탄", "카불"));
			v.add(new City("예멘", "사나"));
			v.add(new City("카타르", "도하"));
			v.add(new City("타이완", "타이베이"));
			v.add(new City("터키", "앙카라"));
			v.add(new City("네팔", "카트만두"));
			v.add(new City("인도", "뉴델리"));
			v.add(new City("타이", "방콕"));
			v.add(new City("일본", "도쿄"));
			v.add(new City("미국", "워싱턴"));
			v.add(new City("캐나다", "오타와"));
			v.add(new City("콜롬비아", "보고타"));
			v.add(new City("이집트", "카이로"));
			v.add(new City("영국", "런던"));
			v.add(new City("포르투갈", "리스본"));
			v.add(new City("덴마크", "코펜하겐"));
			v.add(new City("스웨덴", "스톡홀름"));
			v.add(new City("아일랜드", "더블린"));
			v.add(new City("이탈리아", "로마"));
			v.add(new City("뉴질랜드", "웰링턴"));
			v.add(new City("오스트레일리아", "캔버라"));
			v.add(new City("핀란드", "헬싱키"));
	
		}

		public void insert() {
			System.out.println("X를 입력하면 입력을 종료합니다.");
			while(true) {
				System.out.print("국가 수도 입력 >> ");
				String Contry = scanner.next(); 
				if(Contry.equals("X"))
					break;
				
				String City = scanner.next(); 
				v.add(new City(Contry, City));
			}		
		}
		
		public void StartQuiz() {
			System.out.println("현재 " + v.size() + "개의 국가가 들어 있습니다. X를 입력하면 테스트를 종료합니다.");
			while(true) { 
				int ex1 = (int)(Math.random()*v.size()); 			
				String contry = v.get(ex1).getContry();				 
				
				int example[] = new int [4];
				
				int answerLoc = makeExample(example, ex1); 
				example[answerLoc] = ex1;

				System.out.println(contry + "?");
				
				for(int i=0; i<example.length; i++)
					System.out.print("(" + (i+1) + ")" + v.get(example[i]).getCity() + " "); // 보기 출력
				
				
				System.out.print(":>"); 
				try {
					int in = scanner.nextInt(); 
					if(in == -1) 
						break; 
					
					in--;
					if(in == answerLoc)
						System.out.println("정답입니다.");
					else
						System.out.println("틀렸습니다.");
				}
				catch(InputMismatchException e) {
					scanner.next(); 
					System.out.println("숫자를 입력하세요 !!");
			
				}
			}		
		}
		
		public int makeExample(int ex[], int answerIndex) {
			int n[] = {-1, -1, -1, -1}; 
			int index;
			for(int i=0; i<n.length; i++) {
				do {
					index = (int)(Math.random()*v.size());
				} while(index == answerIndex || exists (n, index)); // 다시 시도
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
			System.out.println("프로그램을 종료합니다.");
		}
}