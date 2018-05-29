package MyCity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import MyCity.MyCityDBConnector;

public class AccountInfoDB {
	private Statement stmt;
	private String username, password;
	
	public AccountInfoDB() throws Exception {
		MyCityDBConnector dbc = MyCityDBConnector.getInstance();
		Connection conn = dbc.getConnection();
		stmt = conn.createStatement();
	}
	
	/*public static void main(String[] args) throws Exception {
		MyCityDBConnector dbc = MyCityDBConnector.getInstance();
		Connection conn = dbc.getConnection();
		Statement stmt = conn.createStatement();
		createCityDBTable(stmt);
	}*/
	
	public Statement getStatement() {
		return stmt;
	}
	
	public static void createAccountDBTable(Statement stmt) throws SQLException {
		String createTable = "create table Account_Info (First_Name varchar(30), Middled_Name varchar(30), Last_Name varchar(30), "
				+ "Address varchar(70), Email varchar(50), Username varchar(30) primary key, Password varchar(80), "
				+ "Security_Question varchar(100), Security_Answer varchar(100))";
		stmt.executeUpdate(createTable);
		System.out.println("Table has been created");
	}
	
	public static void createResultsDBTable(Statement stmt) throws SQLException {
		String createTable = "create table Results (Username varchar(30) foreign key references Account_Info(Username), Result char(10))";
		stmt.executeUpdate(createTable);
		System.out.println("Table has been created");
	}
	
	public static void createCityDBTable(Statement stmt) throws SQLException {
		String createTable = "create table Cities (City varchar(50), State varchar(30), Code char(10))";
		stmt.executeUpdate(createTable);
		System.out.println("Table has been created");
	}
	
	public void insertAccountRecord(String firstName, String middleName, String lastName, String address, String email, String username, String password, 
			String securityQuestion, String securityAnswer) throws SQLException {
		String insert = "insert into Account_Info values('" + firstName + "', '" + middleName + "', '" + lastName + "', '" + address + "', "
				+ "'" + email + "', '" + username + "', '" + password + "', '" + securityQuestion + "', '" + securityAnswer + "')";
		stmt.executeUpdate(insert);
		System.out.println("Record inserted");
	}
	
	public void insertResultRecord(String username, String result) throws SQLException {
		String insert = "insert into Results values('" + username + "', '" + result + "')";
		stmt.executeUpdate(insert);
		System.out.println("RecordInserted");
	}
	
	public void insertCities() throws SQLException {
		String[][] cities = new String[50][3];
		String insert;
		for (int i = 0; i < cities.length; i++) {
			insert = "insert into Cities values ('" + cities[i][0] + "', '" + cities[i][1] + "', '" + cities[i][2] + "')";
			stmt.executeUpdate(insert);
		}
		System.out.println("Cities inserted");
	}
	
	public String[] getCities() throws SQLException {
		String[] codes = new String[50];
		String select = "select Code from Cities";
		ResultSet rs = stmt.executeQuery(select);
		
		for (int i = 0; rs.next(); i++) {
			codes[i] = rs.getString("Code");
		}
		
		return codes;
	}
	
	public ArrayList<String> getUsernames() throws SQLException {
		ArrayList<String> usernames = new ArrayList<>();
		String selectStatement = "select Username from Account_Info";
		ResultSet rs = stmt.executeQuery(selectStatement);
		
		while (rs.next()) {
			username = rs.getString("Username");
			
			usernames.add(username);
		}
		
		return usernames;
	}
	
	public String getPassword(String username) throws SQLException {
		String selectStatement = "select Password from Account_Info where Username = "
				+ "'" + username + "'";
		ResultSet rs = stmt.executeQuery(selectStatement);
		
		password = rs.getString("Password");
		
		return password;
	}
	
	public boolean exists(String username) throws SQLException {
		ArrayList<String> usernames = getUsernames();
		for (int i = 0; i < usernames.size(); i++) {
			if (username.equals(usernames.get(i))) {
				return true;
			}
		}
		return false;
	}
}
