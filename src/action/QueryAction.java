package action;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import assistant.Author;
import assistant.Book;
import mysqlcon.SqlCon;

public class QueryAction {
    private String authorName;  // welcome.jsp
    private List<String> titleLst = new ArrayList<String>();  // showtitle.jsp
    private String titleName; // showtitle.jsp
    private Book book;  // show_detail.jsp
    private Author author;  // show_detail.jsp
    
    public String getAuthorName() { return authorName; }
    public void setAuthorName(String authorName) { this.authorName = authorName; }
    
    public List<String> getTitleLst() { return titleLst; }
    
    public String getTitleName() { return titleName; }
    public void setTitleName(String titleName) { this.titleName = titleName; }
    
    public Book getBook() { return book; }
    public Author getAuthor() { return author; }
    
    public String queryTitle()
    {
        SqlCon mycon = new SqlCon();
        String ret = "FAIL";
        String query = "select book.Title from book inner join author on book.AuthorID=author.AuthorID where author.Name = \""
        		 + getAuthorName() + "\";";
        ResultSet rs = mycon.executeQuery(query);
        try {
			while (rs.next())
			{
				titleLst.add(rs.getString("Title"));
				ret = "SUCCESS";
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("error in excute of QueryAction.queryTitle");
		}
        return ret;
    }
    
    public String queryDetail()
    {
    	SqlCon mycon = new SqlCon();
        String query = "select * from book where book.Title = \""
        		 + getTitleName() + "\";";
        ResultSet bookrs = mycon.executeQuery(query);
        book = new Book();
        author = new Author();
        try {
        	while (bookrs.next())
        	{
        		book.setAuthorID(bookrs.getInt("AuthorID"));
        		book.setIsbn(bookrs.getString("ISBN"));
        		book.setPrice(bookrs.getDouble("Price"));
        		book.setPublishDate(bookrs.getDate("PublishDate"));
        		book.setPublisher(bookrs.getString("Publisher"));
        		book.setTitle(bookrs.getString("Title"));
        	}
			int authorID = book.getAuthorID();
			query = "select * from author where author.AuthorID = " +
		       		 authorID + ";";
			ResultSet authorrs = mycon.executeQuery(query);
			while (authorrs.next())
			{
				author.setAge(authorrs.getInt("Age"));
				author.setAuthorID(authorrs.getInt("AuthorID"));
				author.setCountry(authorrs.getString("Country"));
				author.setName(authorrs.getString("Name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("error in queryDetail");
		}
    	return "SUCCESS";
    }
    
    public String queryAuthor()
    {
    	String ret = "FAIL";
    	SqlCon mycon = new SqlCon();
        String query = "select * from author where author.Name = \""
        		 + authorName + "\";";
        ResultSet authorrs = mycon.executeQuery(query);
        try {
			while (authorrs.next())
			{
				ret = "SUCCESS";
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("error in queryAuthor");
		}
    	return ret;
    }
}