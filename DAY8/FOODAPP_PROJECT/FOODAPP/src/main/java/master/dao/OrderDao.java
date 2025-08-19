package master.dao;
import java.sql.*;


import master.dto.OrderDto;
import master.utilities.ConnectionFactory;
public class OrderDao {
	private Connection cn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private String select_sql="select * from orderdtls";
	private String insert_sql="insert into orderdtls(fid,qty,uname) values(?,?,?)";
	private String billing_sql="select * from billing where uname=?";
	
	public ResultSet billing(String uname)
	{
		try
		{
		
		ConnectionFactory con=new ConnectionFactory();
		cn=con.getConn();
	    ps=cn.prepareStatement(billing_sql);
	    ps.setString(1,uname);
		 rs=ps.executeQuery();//execute the query and store the data into resultset
		 		 
		}
		
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		return rs;
	}
	public ResultSet getData()
	{
		try
		{
		
		 ConnectionFactory con=new ConnectionFactory();
		 cn=con.getConn();
		 st=cn.createStatement();
		 rs=st.executeQuery(select_sql);
		 
		}
	
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		return rs;
	}
	public void insertData(OrderDto fdto)
	{
		try
		{
		
		 ConnectionFactory con=new ConnectionFactory();
		 cn=con.getConn();
		ps=cn.prepareStatement(insert_sql);
		 ps.setString(1,fdto.getFid());
		 ps.setInt(2,fdto.getQty());
		ps.setString(3,fdto.getUname());
		 ps.executeUpdate();//storing data
		 
		}
	
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}
