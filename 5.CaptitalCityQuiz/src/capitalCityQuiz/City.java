package capitalCityQuiz;

public class City {
	private String contry;			 // 국가
	private String capitalCity; 	// 수도 
	
	public City(String contry, String capitalCity) {
		this.contry = contry;
		this.capitalCity = capitalCity;
	}
	
	
	public String getContry() { return contry; }
	public String getCity() { return capitalCity; }
	
}