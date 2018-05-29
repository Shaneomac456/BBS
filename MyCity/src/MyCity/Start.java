package MyCity;

import java.sql.Statement;
import java.sql.Connection;

public class Start {

	public static void main(String[] args) throws Exception {
		MyCityDBConnector dbc = MyCityDBConnector.getInstance();
		Connection conn = dbc.getConnection();
		Statement stmt = conn.createStatement();
		AccountInfoDB.createAccountDBTable(stmt);
		AccountInfoDB.createCityDBTable(stmt);
		AccountInfoDB.createResultsDBTable(stmt);
		AccountInfoDB.insertCities(stmt);
	}
}
