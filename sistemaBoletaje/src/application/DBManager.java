package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	
	Connection connection;
	

	public DBManager() throws SQLException {
		connect();
	}
	
	private void connect() throws SQLException {
        // TODO: program this method
        try {
            String url = "jdbc:mysql://localhost/bdBoletaje";
            connection = DriverManager.getConnection(url,
                    "root", "clvprinc");
            System.out.println("Conexión exitosa a dbBoletaje ");

        } catch (SQLException ex) {
            connection = null;
            ex.printStackTrace();
            System.out.println("SQLException:␣" + ex.getMessage());
            System.out.println("SQLState:␣" + ex.getSQLState());
            System.out.println("VendorError:␣" + ex.getErrorCode());
        }
    }

}
