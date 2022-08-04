package Maven_Firsst.Maven_Firsst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo11 {
public static void main(String[] args) throws SQLException {
		
		String host="localhost";
		String port="3306";
		
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/Qadbt","root","root");
		 
		java.sql.Statement s= con.createStatement();
		
		ResultSet rs=s.executeQuery("select * from Credentials where scenario='RewardsCard'");
		
			while(rs.next())
			{
				
				System.out.println(rs.getString("Username"));
				System.out.println(rs.getString("Password"));
			}
		
	}
}
