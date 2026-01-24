import java.sql.*;

public class MyFirstDatabaseConnection {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
                ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD()); //why ?
             PreparedStatement ps = conn.prepareStatement(
                     "SELECT name FROM exhibits");
             ResultSet rs = ps.executeQuery()) {
            while (rs.next())
                System.out.println(rs.getString(1));
        }
    }
}