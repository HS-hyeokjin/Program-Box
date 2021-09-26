package capitalCityQuiz;

import java.util.Scanner;
import java.util.Vector;

public class MapQuiz {
		private String name; 							// CityQuiz 프로그램의 이름
		private Scanner scanner = new Scanner(System.in);
		private Vector<City> v;

		public MapQuiz(String name) {
			this.name = name;
			
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
}