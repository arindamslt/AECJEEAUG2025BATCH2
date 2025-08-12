package master;
import java.sql.*;
class TestConnection{
	private Connection cn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private String select_sql="select * from product";
	private String insert_sql="insert into product values(?,?,?,?)";
	private String delete_sql="delete from product where pid=?";
	private String update_sql="update product set pname=?,pqty=?,price=? where pid=?";
	private String search_pname_sql="select * from product where pname=?";
	public void searchPname(String pname)
	{
		try
		{
		
		ConnectionFactory con=new ConnectionFactory();
		cn=con.getConn();
	    ps=cn.prepareStatement(search_pname_sql);
	    ps.setString(1,pname);
		 rs=ps.executeQuery();//execute the query and store the data into resultset
		 while(rs.next())
		 {
		
			 System.out.println(rs.getString(1)+"==>"+rs.getString(2)+"==>"+rs.getInt(3)+"===>"+rs.getDouble(4));
		 }
		 
		}
		
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void updateData()
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		 cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/JEEDBS","root","arindam");//ESTABLISH THE CONNECTION
		 ps=cn.prepareStatement(update_sql);
		 ps.setString(4,"P2");
		 ps.setString(1,"TAB");
		 ps.setInt(2, 10);
		 ps.setDouble(3,22000.00);
		 ps.executeUpdate();//storing data
		 
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void deleteData()
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		 cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/JEEDBS","root","arindam");//ESTABLISH THE CONNECTION
		 ps=cn.prepareStatement(delete_sql);
		 ps.setString(1,"P3");
		 ps.executeUpdate();//storing data
		 
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void insertData()
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		 cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/JEEDBS","root","arindam");//ESTABLISH THE CONNECTION
		 ps=cn.prepareStatement(insert_sql);
		 ps.setString(1,"P3");
		 ps.setString(2,"TAB");
		 ps.setInt(3, 10);
		 ps.setDouble(4,22000.00);
		 ps.executeUpdate();//storing data
		 
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void getData()
	{
		try
		{
		//Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		 //cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/JEEDBS","root","arindam");//ESTABLISH THE CONNECTION
		ConnectionFactory con=new ConnectionFactory();
		cn=con.getConn();
	    st=cn.createStatement();//CREATING THE STATEMENT
		 rs=st.executeQuery(select_sql);//execute the query and store the data into resultset
		 while(rs.next())
		 {
			// System.out.println(rs.getString(1));
			 //System.out.println(rs.getString(2));
			 //System.out.println(rs.getInt(3));
			// System.out.println(rs.getDouble(4));
			 System.out.println(rs.getString(1)+"==>"+rs.getString(2)+"==>"+rs.getInt(3)+"===>"+rs.getDouble(4));
		 }
		 
		}
		/*catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}*/
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	
}
public class Java_Mysql_Connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  TestConnection ts=new TestConnection();
  //ts.insertData();
  //ts.deleteData();
  //ts.updateData();
  //ts.getData();
  ts.searchPname("TV");
	}

}
