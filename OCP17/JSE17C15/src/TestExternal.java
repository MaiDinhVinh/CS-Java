import java.sql.*;
public class TestExternal {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL())){
            System.out.println(conn); //what will happen ?
        }
    }
}