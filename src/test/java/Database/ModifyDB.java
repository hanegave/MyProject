package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ModifyDB {

	public static void main(String[] args) throws SQLException {
		Driver DbDriver= new Driver();
		DriverManager.registerDriver(DbDriver);
		Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceselenium", "root","root");
		Statement statement = connect.createStatement();
		int result=statement.executeUpdate("insert into students(id,name,address) values(106,'vh','hav');");
		
		if(result==1)
		{
			System.out.println("Db Updated sucessfully");
		}
		else
		{
			System.out.println("Bd not updated");
		}
	}

}
