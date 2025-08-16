package master.dao;
import java.sql.*;


import master.dto.RegisterDto;
import master.utilities.ConnectionFactory;
public class RegisterDao {
	private Connection cn=null;
	//private Statement st=null;
	private PreparedStatement ps=null;
	//private ResultSet rs=null;
	//private String select_sql="select * from food";
	private String check_login_sql="select * from register where uname=? and pass=?";
	private String insert_sql="insert into register values(?,?,?)";
	//private String delete_sql="delete from food where fid=?";
	//private String update_sql="update food set fname=?,price=? where fid=?";
	//private String search_fid_sql="select * from food where fid=?";
	public void insertData(RegisterDto fdto)
	{
		try
		{
		
		 ConnectionFactory con=new ConnectionFactory();
		 cn=con.getConn();
		ps=cn.prepareStatement(insert_sql);
		 ps.setString(1,fdto.getUname());
		 ps.setString(2,fdto.getPass());
		ps.setString(3,fdto.getNm());
		 ps.executeUpdate();//storing data
		 
		}
	
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}
