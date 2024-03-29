package databaseConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		try (Connection connection = DatabaseConnection.getConnection()) {
			System.out.println("Database connection successful!");
		} catch (SQLException e) {
			System.err.println("Error connecting to the database: " + e.getMessage());
		}
	}

}
