package hjw;

import java.sql.*;


public class CDatabaseUser {
	
	public Connection conn = null;
	public  Statement stmt = null;
	public ResultSet rs = null;
	
	public CDatabaseUser()
	{
		if (conn == null)
			getConn();
	}
	
	public void Close()
	{
		if(rs != null )
		{
			try 
			{
				rs.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			rs =null;
		}
		
		if(stmt != null )
		{
			try 
			{
				stmt.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			stmt =null;
		}
		
		if(conn != null )
		{
			try 
			{
				conn.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			conn =null;
		}
		
	}

	private   void getConn()
	{
		
		
		try
		{
			//Class.forName("com.mariadb.jdbc.Driver");
			Class.forName("org.mariadb.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mariadb://localhost/mysql?user=root&password=");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	
		
	}
	
	public  String getResultSet(String sql)
	{	
		String res = "";
		
		try
		{
			if(conn == null)
				getConn();
			
			if(stmt == null)
				stmt = conn.createStatement();
			
			if(stmt != null)
			{
				rs = stmt.executeQuery(sql);		
				
			}
			
			if (rs != null)
			{
				while(rs.next())
				{
					res += "\r\n";
					res += rs.getString("Host") + "|";
					res += rs.getString("User")+ "|";
					res += rs.getString("Password")+ "|";
					res += "\r\n";
				}
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return res;
	}
}
