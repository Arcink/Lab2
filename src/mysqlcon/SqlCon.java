package mysqlcon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlCon {
    Connection con =null;
    Statement stat=null;
    ResultSet rs=null;
    
    public SqlCon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");//连接驱动
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdb","root","ls1150310202");//连接数据库
            stat=con.createStatement();
            
        }
        
        catch(Exception e)
        {
            con=null;
            System.out.println("error in sqlcon");
        }
    
    }
    
    public ResultSet executeQuery(String sql)
    {
        try
        {
            rs=stat.executeQuery(sql);
        }
        
        catch(Exception e)
        {
            rs=null;
            System.out.println("error in executeQuery");
        }
        return rs;
    }
    
    public void executeUpdate(String del)
    {
    	try {
			stat.executeUpdate(del);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("error in executeUpdate");
		}
    }
}
