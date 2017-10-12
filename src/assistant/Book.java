package assistant;

import java.sql.Date;

public class Book {
	private String isbn;
	private String title;
	private int authorID;
	private String publisher;
	private Date publishDate;
	private double price;
	
	@SuppressWarnings("deprecation")
	public Book()
	{
		isbn = "";
		title = "";
		authorID = 0;
		publisher = "";
		publishDate = new Date(0, 0, 0);
		price = 0.00;
	}
	
	public void setIsbn(String isbn) { this.isbn = isbn; }
	public String getIsbn() { return isbn; }
	
	public void setTitle(String title) { this.title = title; }
	public String getTitle() { return title; }
	
	public void setAuthorID(int authorID) { this.authorID = authorID; }
	public int getAuthorID() { return authorID; }
	
	public void setPublisher(String publisher) { this.publisher = publisher; }
	public String getPublisher() { return publisher; }
	
	public void setPublishDate(Date publishDate) { this.publishDate = publishDate; }
	public Date getPublishDate() { return publishDate; }
	
	public void setPrice(double price) { this.price = price; }
	public double getPrice() { return price; }
}
