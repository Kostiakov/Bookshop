package literature;

public class Book implements Literature {
	
	private String author;
	private String title;
	private String publisher;
	private int year;
	
	
	public static class Builder {
		
		private Book book;
		
		public Builder() {
			book = new Book();
		}
		
		public Builder withAuthor(String author) {
			book.author=author;
			return this;
		}
		
		public Builder withTitle(String title) {
			book.title=title;
			return this;
		}
		
		public Builder withPublisher(String publisher) {
			book.publisher=publisher;
			return this;
		}
		
		public Builder withYear(int year) {
			book.year=year;
			return this;
		}
		
		public Book build() {
			return book;
		}
		
	}
	
	
	public Book() {
		
	};
	
	public Book(String author, String title, String publisher, int year) {
		this.author = author;
		this.title = title;
		this.publisher = publisher;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", publisher=" + publisher + ", year=" + year + "]";
	}
	
	

}
