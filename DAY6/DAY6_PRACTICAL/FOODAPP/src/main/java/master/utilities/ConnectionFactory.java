package master.utilities;
import java.sql.*;
public class ConnectionFactory {
	private Connection cn=null;
	public Connection getConn()
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		 cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/FOODSAPPDB","root","arindam");//ESTABLISH THE CONNECTION
		
		 
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		return cn;
	}
}
