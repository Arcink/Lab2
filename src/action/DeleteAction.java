package action;
// change?
import mysqlcon.SqlCon;

public class DeleteAction {
	private String isbn;
	
	public void setIsbn(String isbn) { this.isbn = isbn; }
	
	public String deleteBook()
	{
		SqlCon mycon = new SqlCon();
		String del = "delete from book where book.ISBN = \""
       		 + isbn + "\";";
		mycon.executeUpdate(del);
		return "SUCCESS";
	}
}
