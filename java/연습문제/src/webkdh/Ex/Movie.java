package webkdh.Ex;

public class Movie extends Product {
	private String director;
	private String rate;
	
	public Movie (String name, int price, String director, String rate) {
		super(name, price);
		this.director = director;
		this.rate = rate;		
	}
	
	public String display () {
		return super.display() + " 감독 : " + director + ", 관람등급 : " + rate;
	}
}