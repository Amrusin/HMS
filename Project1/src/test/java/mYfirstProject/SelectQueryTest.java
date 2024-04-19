package mYfirstProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SelectQueryTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		//Step 1: Register the Driver
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		
		//Step 2: Get the connection for database
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "root");
		
		//Step 3: Create statement
		Statement state=conn.createStatement();
		String query = "select * from hospital;";
		
		//Step 4: Execute Query
		ResultSet result= state.executeQuery(query);
		/*result.next();
		System.out.println(result.getString(1));*/
		
		while(result.next())
		{
			System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4)+" "+result.getString(5));
		}
		
		//Step 5: Close database
		conn.close();
	}

}
