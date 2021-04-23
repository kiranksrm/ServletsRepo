import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDao {
//1. get Connection()
	
	
	public static Connection getConnection()
	{
		Connection con=null;
		try
		{
			//1. load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver"); //if you are using JDBC4.0 this is optional
			  //TRY with Resources
			
			//2. Get The Connection Obj by using DriverManager.getConnection();
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb", "root", "admin");
			
		}
		catch(Exception e)
		{
			System.out.println(e.getCause());
		}
		return con;
	}
	
	public static int save(Emp e)
	{
		int count=0;
		Connection con=getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("insert into user(name, password, email, country) values (?,?,?,?)");
			ps.setString(1, e.getName());
			ps.setString(2, e.getPassword());
			ps.setString(3, e.getEmail());
			ps.setString(4, e.getCountry());
			
			count=ps.executeUpdate();
			con.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return count;
	}
	
	public static List<Emp> getAllEmployees()
	{
		Connection con = getConnection();
		List<Emp> empList= new ArrayList<Emp>();
		try {
			PreparedStatement ps =con.prepareStatement("select * from user");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				Emp e= new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPassword(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setCountry(rs.getString(5));
				empList.add(e);
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empList;
	}
//	
//	public static int update(Emp e)
//	{
//		
//	}
	
	public static List<Emp> search(String queryStr)
	{
		Connection con= getConnection();
		List<Emp> empList= new ArrayList<Emp>();
		try {
			//con.prepareStatement("select * from user where name like '%"+queryStr+"%'");
			//PreparedStatement ps=con.prepareStatement("select * from user where name= ?");
			PreparedStatement ps=con.prepareStatement("select * from user where email like ? OR id like ?");
			ps.setString(1, "%"+queryStr+"%");
			ps.setString(2, queryStr);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Emp e= new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPassword(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setCountry(rs.getString(5));
				empList.add(e);
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empList;
		
	}
}
