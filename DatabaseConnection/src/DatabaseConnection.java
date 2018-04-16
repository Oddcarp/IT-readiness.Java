import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;





public class DatabaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/java_class";
			final String SELECT_QUERY = "SELECT * FROM employee;";
			try (
				Connection connection = DriverManager.getConnection(DATABASE_URL, "root", "changeit");
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(SELECT_QUERY);
						
				)
			{
				System.out.println("Connected!");
			}
			
			catch (SQLException sqlException) {
				sqlException.printStackTrace();
			}
			
			
	}

}
