package master.dao;
import java.sql.*;

import master.dto.FoodDto;
import master.utilities.ConnectionFactory;
public class FoodDao {
	private Connection cn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private String select_sql="select * from food";
	private String insert_sql="insert into food values(?,?,?)";
	private String delete_sql="delete from food where fid=?";
	private String update_sql="update food set fname=?,price=? where fid=?";
	private String search_fid_sql="select * from food where fid=?";
	public ResultSet searchFid(String fid)
	{
		try
		{
		
		ConnectionFactory con=new ConnectionFactory();
		cn=con.getConn();
	    ps=cn.prepareStatement(search_fid_sql);
	    ps.setString(1,fid);
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
	public void insertData(FoodDto fdto)
	{
		try
		{
		
		 ConnectionFactory con=new ConnectionFactory();
		 cn=con.getConn();
		ps=cn.prepareStatement(insert_sql);
		 ps.setString(1,fdto.getFid());
		 ps.setString(2,fdto.getFname());
		ps.setDouble(3,fdto.getPrice());
		 ps.executeUpdate();//storing data
		 
		}
	
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void updateData(FoodDto fdto)
	{
		try
		{
		
		 ConnectionFactory con=new ConnectionFactory();
		 cn=con.getConn();
		ps=cn.prepareStatement(update_sql);
		 ps.setString(3,fdto.getFid());
		 ps.setString(1,fdto.getFname());
		ps.setDouble(2,fdto.getPrice());
		 ps.executeUpdate();//storing data
		 
		}
	
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void deleteData(FoodDto fdto)
	{
		try
		{
		
		 ConnectionFactory con=new ConnectionFactory();
		 cn=con.getConn();
		ps=cn.prepareStatement(delete_sql);
		 ps.setString(1,fdto.getFid());
		 ps.executeUpdate();//storing data
		 
		}
	
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}
