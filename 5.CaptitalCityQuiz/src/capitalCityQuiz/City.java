package capitalCityQuiz;

public class City {
	private String contry;			 // ����
	private String capitalCity; 	// ���� 
	
	public City(String contry, String capitalCity) {
		this.contry = contry;
		this.capitalCity = capitalCity;
	}
	
	
	public String getContry() { return contry; }
	public String getCity() { return capitalCity; }
	
}