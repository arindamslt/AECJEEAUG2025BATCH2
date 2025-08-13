package master.dao;
import java.sql.*;

import master.dto.FoodDto;
import master.utilities.ConnectionFactory;
public class FoodDao {
	private Connection cn=null;
	//private Statement st=null;
	private PreparedStatement ps=null;
	//private ResultSet rs=null;
	//private String select_sql="select * from product";
	private String insert_sql="insert into food values(?,?,?)";
	//private String delete_sql="delete from product where pid=?";
	//private String update_sql="update product set pname=?,pqty=?,price=? where pid=?";
	//private String search_pname_sql="select * from product where pname=?";
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
}
