package enenim.asukwo.question5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample {
	static Connection connection;

  public static void main(String[] argv) throws SQLException {

	System.out.println("-------- MySQL JDBC Connection Testing ------------");

	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		return;
	}

	System.out.println("MySQL JDBC Driver Registered!");
	

	try {
		connection = DriverManager
		.getConnection("jdbc:mysql://localhost:3306/upperlink_test","root", "computer");
		

	} catch (SQLException e) {
		System.out.println("Connection Failed! Check output console");
		e.printStackTrace();
		return;
	}

	if (connection != null) {
		System.out.println("You made it, take control your database now!");
	} else {
		System.out.println("Failed to make connection!");
	}
	
	updateRecordToTable(connection);
	
	//selectRecordsFromTable();
  }
  
  private static void updateRecordToTable( Connection connection ) throws SQLException {

		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;

		String updateTableSQL = "UPDATE student SET first_name = ? "
				                  + " WHERE id = ?";

		try {
			dbConnection = connection;
			preparedStatement = dbConnection.prepareStatement(updateTableSQL);

			preparedStatement.setString(1, "Asukwo");
			preparedStatement.setInt(2, 1);

			// execute update SQL stetement
			preparedStatement.executeUpdate();

			System.out.println("Record is updated to DBUSER table!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

	}
}