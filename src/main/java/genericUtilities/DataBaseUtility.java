package genericUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

/**
 * This class contains reusable methods to perform operations on Database
 * 
 * @author Vaibhav
 *
 */

public class DataBaseUtility {
	private Connection connection;

	public void databaseInitialization(String url, String user, String passward) {
		Driver dbDriver = null;
		try {
			dbDriver = new Driver();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			DriverManager.registerDriver(dbDriver);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(url, user, passward);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<String> readDataFromDatabase(String query, String collumnName) throws SQLException {
		Statement statement = null;
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();

		}
		ResultSet result = null;
		try {
			result = statement.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		List<String> collumnData = new ArrayList<>();
		while (result.next()) {
			collumnData.add(result.getString(collumnName));
		}
		return collumnData;
	}

	/**
	 * This method is used to modify the data in database
	 */
	public int modifyDatabase(String query) {
		Statement statement = null;
		try {
			statement = connection.createStatement();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		int result = 0;
		try {
			result = statement.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * This method closes database connection
	 */
	public void closeDatabase() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
