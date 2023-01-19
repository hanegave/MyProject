package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadDataFromDataBase {

	public static void main(String[] args) throws SQLException {
		//step1: Create an instance for driver
		//driver should be imported from com.mysql.cj.jdbc.Driver
		//new driver() throes SQLException 
		Driver dbDriver = new Driver();
		
		//step2: register to the dbDriver
		//DriverManager is in the java.sql package
		DriverManager.registerDriver(dbDriver);
		
		//step3: Estanlish database connection
		//connection should be imported from java.sql package
		Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceselenium", "root","root");
		
		//step4: create statement
		//statement should be implemented from java.sql package
		Statement statement = connect.createStatement();
		
		//step5: Execute query to fetch the data
		//resultSet is an interface
		ResultSet result = statement.executeQuery("select * from students;");
		
		//result.nxt() will check whether there is next line or not
		while(result.next())
		{
			System.out.println(result.getInt("id")+"\t"+result.getString("name")+"\t"+result.getString("address"));
		}
		
		connect.close();
				
	}

}
