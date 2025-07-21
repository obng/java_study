package day05_book;

public class Book {
	// 필드: field
	private int bookNum;
	private String subject;
	private int price;
	
	
	
	public int getBookNum() {
		return bookNum;
	}



	public String getSubject() {
		return subject;
	}



	public int getPrice() {
		return price;
	}



	// 생성자: constructor
	Book (int bookNum, String subject, int price) {
		this.bookNum = bookNum;
		this.subject = subject;
		this.price = price;
	}
	
	// 메소드: method
	
}
