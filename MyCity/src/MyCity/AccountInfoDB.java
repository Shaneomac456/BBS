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
		String createTable = "create table Cities (City varchar(50), State varchar(30), Abbreviation char(2), Code char(10))";
		stmt.executeUpdate(createTable);
		System.out.println("Table has been created");
	}
	
	public void insertAccountRecord(String firstName, String middleName, String lastName, String address, String email, String username, String password, 
			String securityQuestion, String securityAnswer) throws SQLException {
		String insert = "INSERT INTO Account_Info VALUES ('" + firstName + "', '" + middleName + "', '" + lastName + "', '" + address + "', '"
				+ email + "', '" + username + "', '" + password + "', '" + securityQuestion + "', '" + securityAnswer + "');";
		stmt.executeUpdate(insert);
		System.out.println("Record inserted");
	}
	
	public void insertResultRecord(String username, String[] result) throws SQLException {
		String insert = "insert into Results values('" + username + "', '" + result + "')";
		stmt.executeUpdate(insert);
		System.out.println("RecordInserted");
	}
	
	public static void insertCities(Statement stmt) throws SQLException {
		String[][] cities = {{"Miami", "Florida", "FL", "AAAFEAACAC"}, {"Los Angeles", "California", "CA", "FAACDBAFCA"},
		{"New York City", "New York", "NY", "CAAFFCCCDB"}, {"Dallas", "Texas", "TX", "BBAFEDBEBC"}, {"San Francisco", "California", "CA", "ECABDBAECD"},
		{"Chicago", "Illinois", "IL", "DBACFCCEDB"}, {"Atlanta", "Georgia", "GA", "ACAFEDBEBF"}, {"Seattle", "Washington", "WA", "ECAFACBAEE"},
		{"Denver", "Colorado", "CO", "BCAFCEBBFA"}, {"Houston", "Texas", "TX", "BBABECBEAC"}, {"Portland", "Oregon", "OR", "ECACDDCACE"},
		{"Boston", "Massachusetts", "MA", "CCAFFBBEDD"}, {"Philadelphia", "Pennsylvania", "PA", "CBAEFCCEDA"}, {"Charlotte", "North Carolina", "NC", "ACADEDBAAF"},
		{"Indianapolis", "Indiana", "IN", "DCACEEBABF"}, {"Baltimore", "Maryland", "MD", "CCAEEDBEAD"}, {"Nashville", "Tennessee", "TN", "ACADEEBEBF"},
		{"Raleigh", "North Carolina", "NC", "ACEEEDBAAA"}, {"Columbus", "Ohio", "OH", "DCACFEAADA"}, {"Detroit", "Michigan", "MI", "DCACFCBEBA"},
		{"New Orleans", "Louisiana", "LA", "ACADECBEAF"}, {"Kansas City", "Kansas", "KS", "DDEDEEBABF"}, {"Oklahoma City", "Oklahoma", "OK", "BCDCEFCABA"},
		{"Omaha", "Nebraska", "NE", "DCAFFFCABA"}, {"Colorado Springs", "Colorado", "CO", "BCDCCECAFD"}, {"Jacksonville", "Florida", "FL", "ACAFEABCAB"},
		{"Las Vegas", "Nevada", "NV", "FCACBDCCCD"}, {"Oakland", "California", "CA", "FCADDBBACD"}, {"St. Louis", "Missouri", "MO", "DCADEEAEBD"}, 
		{"Cleveland", "Ohio", "OH", "DCACFEBABA"}, {"Pittsburgh", "Pennsylvania", "PA", "CDACFDCEDA"}, {"Tucson", "Arizona", "AZ", "BCDCBDCAFC"},
		{"Albuquerque", "New Mexico", "NM", "BCADCECAFC"}, {"Tulsa", "Oklahoma", "OK", "BCADEFCEBA"}, {"Wichita", "Kansas", "KS", "DCACEFDEBA"},
		{"Orlando", "Florida", "FL", "ADACEDBFAA"}, {"Fayetteville", "Arkansas", "AR", "BEEEEECABF"}, {"Austin", "Texas", "TX", "BCACEDDABC"},
		{"Louisville", "Kentucky", "KY", "DCADEEDEBF"}, {"Tampa", "Florida", "FL", "ACAFEBCFAB"}, {"Greenville", "South Carolina", "SC", "AEDDEDBABA"},
		{"Little Rock", "Arkansas", "AR", "BDACEDCABF"}, {"Richmond", "Virginia", "VA", "CDACECCFAD"}, {"San Antonio", "Texas", "TX", "BBADEDCFBC"},
		{"Charleston", "South Carolina", "SC", "ADACEBBABF"}, {"Buffalo", "New York", "NY", "CDACFEDADB"}, {"Hartford", "Connecticut", "CT", "CDAFFDDEDA"},
		{"Newport", "Rhode Island", "CFACFADEAD"}, {"Beacon", "New York", "NY", "CFDFFECADB"}, {"New Haven", "Connecticut", "CT", "CDAEFADEDD"},
		{"Burlington", "Vermont", "VT", "CEACFEDADA"}, {"Greenwich", "Connecticut", "CT", "CEDFFCDDDD"}, {"Newark", "New Jersey", "NJ", "CDADEDCEDB"},
		{"Milwaukee", "Wisconsin", "WI", "DCACFEDEBA"}, {"Ann Arbor", "Michigan", "MI", "DDCCFECEBD"}, {"Salt Lake City", "Utah", "UT", "EDACFFBACD"},
		{"San Diego", "California", "CA", "FBACDAACCC"}, {"Springfield", "Illinois", "IL", "DDADFECEBA"}, {"Savannah", "Georgia", "GA", "ADADEBCCBF"},
		{"Santa Fe", "New Mexico", "NM", "BEADCECCFC"}, {"Wapiti", "Wyoming", "WY", "EFFCCFCACA"}, {"Idaho Falls", "Idaho", "ID", "EEFCDFCAFD"},
		{"Chamberlain", "South Dakota", "SD", "DFEDFFCABA"}, {"Dickinson", "North Dakota", "ND", "DFFEFFCADA"}, {"Hattiesburg", "Mississippi", "MS", "AEDCEDBAAF"},
		{"Tuscaloosa", "Alabama", "AL", "AECEEDDABF"}, {"Bethany Beach", "Delaware", "DE", "CFEFEABDDA"}, {"Worcester", "Massachusetts", "MA", "CDABFDDEDD"},
		{"Portland", "Maine", "ME", "CEADFADADD"}, {"Honolulu", "Hawaii", "HI", "FCACEACDEE"}, {"Phoenix", "Arizona", "AZ", "BBACBDCAFC"},
		{"Huntington", "West Virgina", "WV", "DEADEECABA"}, {"Anchorage", "Alaska", "AK", "EDAFAACAFD"}, {"Washington D.C.", "", "", "CCAAEDBEDD"}};
		String insert;
		for (int i = 0; i < cities.length; i++) {
			insert = "insert into Cities values ('" + cities[i][0] + "', '" + cities[i][1] + "', '" + cities[i][2] + "', '" + cities[i][3] + "')";
			stmt.executeUpdate(insert);
		}
		System.out.println("Cities inserted");
	}
	
	public String[][] getCities() throws SQLException {
		String[][] cities = new String[75][4];
		String select = "select * from Cities";
		ResultSet rs = stmt.executeQuery(select);
		
		for (int i = 0; rs.next(); i++) {
			cities[i][0] = rs.getString("City");
			cities[i][1] = rs.getString("State");
			cities[i][2] = rs.getString("Abbreviation");
			cities[i][3] = rs.getString("Code");
		}
		
		return cities;
	}
	
	public ArrayList<String> getUsernames() throws SQLException {
		ArrayList<String> usernames = new ArrayList<>();
		String selectStatement = "SELECT Username FROM Account_Info";
		ResultSet rs = stmt.executeQuery(selectStatement);
		while (rs.next()){						
			username = rs.getString("Username");
			
			usernames.add(username);
		}
		
		return usernames;
	}
	
	public String getPassword(String username) throws SQLException {
		String selectStatement = "select Password from Account_Info where Username = "
				+ "'" + username + "'";
		ResultSet rs = stmt.executeQuery(selectStatement);
		
		rs.next();
		
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
