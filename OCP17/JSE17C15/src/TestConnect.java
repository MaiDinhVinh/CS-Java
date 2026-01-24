import java.sql.*;
public class TestConnect {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
                ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD())) {
            System.out.println(conn);
        }
    }
}