package study03;

public class Book {
	private String bookName;
	private String author;

	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	//게터
	public String getBookName() {
		return bookName;
	}
	
	//세터
	public void setBookName( ) {
		this.bookName = bookName;
	}


	public String getAuthor() {
		return author;
	}
	
	
}
