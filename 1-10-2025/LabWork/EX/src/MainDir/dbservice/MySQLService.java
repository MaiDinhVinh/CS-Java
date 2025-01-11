package MainDir.dbservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLService {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456789";
    private static final String CONN_STRING = "jdbc:mysql://localhost/LabCrud2";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
    }
}
