package literature;

public class Magazine implements Literature {
	
	private String author;
	private String title;
	private int year;
	private int numbersPerYear;
	
	public Magazine() {
		
	};
	
	public Magazine(String author, String title, int year, int numbersPerYear) {
		this.author = author;
		this.title = title;
		this.year = year;
		this.numbersPerYear = numbersPerYear;
	}

	@Override
	public String toString() {
		return "Magazine [author=" + author + ", title=" + title + ", year=" + year + ", numbersPerYear="
				+ numbersPerYear + "]";
	}
	
	

}
