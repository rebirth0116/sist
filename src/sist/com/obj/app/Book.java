package sist.com.obj.app;
//생성자, this
public class Book {
	private String author; //null
	private int price; //0
	private String bookName;
	private String publisher;
	private String isbn;
	
	public String toString() { 
		return this.author+" "+this.price+" "+this.bookName+" "+this.publisher+" "+this.isbn;  //this. 은 생략가능
	}
	public Book() {
	}
	public Book(String author) {
		this(author, "");
	}
	public Book(String author, String bookName) {
		this(author,0, bookName, "");
	}
	public Book(String author, int price, String bookName) {
		this.author = author;
		this.price = price;
		this.bookName = bookName;
	}
	public Book(String author, int price, String bookName, String isbn) {
		this.author = author;
		this.price = price;
		this.bookName = bookName;
		this.isbn = isbn;
	}
	public Book(Book book) { //복사 생성자
		this.author = book.author;
		this.price = book.price;
		this.bookName = book.bookName;
		this.isbn = book.isbn;
	}
	public Book(String author, int price, String bookName, String isbn, String publisher) {
		this.author = author;
		this.price = price;
		this.bookName = bookName;
		this.isbn = isbn;
		this.publisher = publisher;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public static void main(String[] args) {
		Book book1 = new Book("author1"); //author|price|bookName|publisher|isbn
		Book book2 = new Book("author2", 5000, "title2");
		Book book3 = new Book("author3", 8000, "title3", "is1521");
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		Book book4 = new Book(book3);
		System.out.println(book4.toString());
		Book book5 = new Book(book4);
		book5.setPublisher("publisher1");
		book5.setAuthor("author4");
		System.out.println(book5.toString());
		Book book6 = new Book("author", "bookName");
		System.out.println(book6.toString());
	}
}
