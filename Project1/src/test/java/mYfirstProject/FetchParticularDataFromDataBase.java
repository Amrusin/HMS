package mYfirstProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class FetchParticularDataFromDataBase {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//Step 1: Register the Driver
				Driver driver=new Driver();
				DriverManager.registerDriver(driver);
				
				
				//Step 2: Get the connection for database
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/trainingpgm", "root", "root");
				
				//Step 3: Create statement
				Statement state=conn.createStatement();
				
				//String query = "select * from Trainee;";
				String data= "select * from Trainee where Name='Client';";
				
				//Step 4: Execute Query
				ResultSet client = state.executeQuery(data); 
				
				while(client.next())
				{
					System.out.println(client.getString(1)+" "+client.getString(2)+" "+client.getString(3)+" "+client.getString(4)+" "+client.getString(5));
				}
				
				//Step 5: Close database
				conn.close();
	}

}
