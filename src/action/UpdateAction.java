package action;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import mysqlcon.SqlCon;

public class UpdateAction {
	private String isbn = "";
	private String title = "";
	private String authorName = "";
	private int authorID = 0;
	private String publisher = "";
	@SuppressWarnings("deprecation")
	private Date publishDate = new Date(0,0,0);
	private double price = 0.00; 
	private int age = 0;
	private String country = "";
	public void setIsbn(String isbn) { this.isbn = isbn; }
	public String getIsbn() { return isbn; }
	
	public void setTitle(String title) { this.title = title; }
	public String getTitle() { return title; }
	
	public void setAuthorID(int authorID) { this.authorID = authorID; }
	public int getAuthorID() { return authorID; }
	
	public void setAuthorName(String authorName) { this.authorName = authorName; }
	public String getAuthorName() { return authorName; }
	
	public void setPublisher(String publisher) { this.publisher = publisher; }
	public String getPublisher() { return publisher; }
	
	public void setPublishDate(Date publishDate) { this.publishDate = publishDate; }
	public Date getPublishDate() { return publishDate; }
	
	public void setPrice(double price) { this.price = price; }
	public double getPrice() { return price; }
	
	public void setAge(int age) { this.age = age; }
	public int getAge() { return age; }
	
	public void setCountry(String country) { this.country = country; }
	public String getCountry() { return country; }
	
	public String updateRequirement() { return "SUCCESS"; }
	
	public String updateBook()
	{
		String ret = "FAIL";
		SqlCon mycon = new SqlCon();
		// get authorName, but need to get authorID
		String query = "select * from author where author.Name = \""
       		 + authorName + "\";";
		
		ResultSet idrs = mycon.executeQuery(query);
		try {
			while(idrs.next())
			{
				ret = "SUCCESS";
				authorID = idrs.getInt("authorID");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("error in updateBook");
		}
		
		if (ret.equals("SUCCESS"))
		{
			String upd = "update book set AuthorID=" + authorID + " ";
			if (!publisher.equals(""))
			{
				upd += ", Publisher=\"" + publisher + "\" ";
			}
			if (publishDate != null)
			{
				upd += ", PublishDate=date_format('" +  publishDate + "', '%y-%m-%d') ";
			}
			if (price != 0)
			{
				upd += ", Price=" + price;
			}
			upd += " where ISBN = \"" + isbn + "\";";
			mycon.executeUpdate(upd);
		}
		return ret;
	}
	
	public String addAuthor()
	{
		SqlCon mycon = new SqlCon();
		String query = "select max(AuthorID) from author;";
		ResultSet maxrs = mycon.executeQuery(query);
		try {
			while(maxrs.next())
			{
				authorID = maxrs.getInt("max(AuthorID)") + 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("error in addAuthor");
		}
		String insert = "insert into author (AuthorID, Name, Age, Country) values (" + authorID + ", \"" + authorName
				+ "\", " + age + ", \"" + country + "\");";
		mycon.executeUpdate(insert);
		return "SUCCESS";
	}
	
	public String addBook()
	{
		SqlCon mycon = new SqlCon();
		String query = "select AuthorID from author where Name=\"" + authorName + "\";";
		ResultSet qrs = mycon.executeQuery(query);
		try {
			while(qrs.next())
			{
				authorID = qrs.getInt("AuthorID");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("error in addBook");
		}
		String insert = "insert into book (ISBN, Title, AuthorID, Publisher, PublishDate, Price) "
				+ "values (\"" + isbn + "\", \"" + title + "\", " + authorID + ", \"" + publisher + "\", date_format('"
				+ publishDate + "', '%y-%m-%d'), " + price + ");";
		mycon.executeUpdate(insert);
		return "SUCCESS";
	}
} 
