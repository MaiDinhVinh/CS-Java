import java.sql.*;
import java.util.Arrays;
import java.util.HashMap;

public class Main{

    //for snippet 15

    public static void register(Connection conn) throws SQLException {
        var sql = "INSERT INTO names VALUES(6, 1, 'Edith')";
        try (var ps = conn.prepareStatement(sql)) {
            ps.executeUpdate();
        }
    }

    //for snippet 16

    public static void register(Connection conn, int key,
                                int type, String name) throws SQLException {

        String sql = "INSERT INTO names VALUES(?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, key);
            ps.setString(3, name);
            ps.setInt(2, type);
            ps.executeUpdate();
        }
    }

    //for snippet 21

    public static void register(Connection conn, int firstKey,
                                int type, String... names) throws SQLException {
        var sql = "INSERT INTO names VALUES(?, ?, ?)";
        var nextIndex = firstKey;
        try (var ps = conn.prepareStatement(sql)) {
            ps.setInt(2, type);
            for(var name: names) {
                ps.setInt(1, nextIndex);
                ps.setString(3, name);
                ps.addBatch();
                nextIndex++;
            }
            int[] result = ps.executeBatch();
            System.out.println(Arrays.toString(result));
        }
    }

    //for snippet 35 - Questions: why this method is bad ?

    public void bad() throws SQLException {
        var url = "jdbc:hsqldb:zoo";
        var sql = "SELECT not_a_column FROM names";
        var conn = DriverManager.getConnection(url);
        var ps = conn.prepareStatement(sql);
        var rs = ps.executeQuery();

        try (conn; ps; rs) {
            while (rs.next())
                System.out.println(rs.getString(1));
        }
    }

    public static void main(String[] args) {
        //snippet 1 - check the db.sql file and shows the zoo database

        //snippet 2 - check the db.sql file and check the zoo database

        //snippet 3 - check the db.sql file and check the zoo database

        //snippet 4 - check the db.sql file and check the zoo database

        //snippet 5 - check the db.sql file and check the zoo database

        //snippet 6 - check MyFirstDatabaseConnection class and ZooDb enum

        //snippet 7 - check TestConnect class

        //snippet 8 - check TestExternal class

        //snippet 9

//        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//                ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//             PreparedStatement ps = conn.prepareStatement(
//                     "SELECT * FROM exhibits")) {
//        }catch (SQLException e){
//            e.printStackTrace();
//        }

        //snippet 10

//        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//                ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//             var ps = conn.prepareStatement()) {
//        }catch (SQLException e){
//            e.printStackTrace();
//        }

        //snippet 11

//        var insertSql = "INSERT INTO exhibits VALUES(10, 'Deer', 3)";
//        var updateSql = "UPDATE exhibits SET name = '' " +
//                "WHERE name = 'None'";
//        var deleteSql = "DELETE FROM exhibits WHERE id = 10";
//
//        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//                ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//             var ps = conn.prepareStatement(insertSql)) {
//            int result = ps.executeUpdate();
//            System.out.println(result);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//                ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//             var ps = conn.prepareStatement(updateSql)) {
//            int result = ps.executeUpdate();
//            System.out.println(result);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//                ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//             var ps = conn.prepareStatement(deleteSql)) {
//            int result = ps.executeUpdate();
//            System.out.println(result);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 12

//        var sql = "SELECT * FROM exhibits";
//        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//                ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//                var ps = conn.prepareStatement(sql);
//             ResultSet rs = ps.executeQuery() ) {
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 13

//        var sql = "SELECT * FROM exhibits";
//        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//                ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//             var ps = conn.prepareStatement(sql);) {
//            boolean isResultSet = ps.execute();
//            if (isResultSet) {
//                try (ResultSet rs = ps.getResultSet()) {
//                    System.out.println("ran a query");
//                }
//            } else {
//                int result = ps.getUpdateCount();
//                System.out.println("ran an update");
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 14

//        var sql = "SELECT * FROM names";
//        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//                ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//             var ps = conn.prepareStatement(sql)) {
//            var result = ps.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        //snippet 15 - check register method above

        //snippet 16 - check register method above

        //snippet 17

//        var sql = "INSERT INTO names VALUES(?, ?, ?)";
//        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//                ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//             var ps = conn.prepareStatement(sql)) {
//            ps.setInt(1, 100);
//            ps.setInt(2, 20);
//            ps.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        //snippet 18

//        var sql = "INSERT INTO names VALUES(?, ?)";
//        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//                ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//             var ps = conn.prepareStatement(sql)) {
//            ps.setInt(1, 100);
//            ps.setInt(2, 20);
//            ps.setString(3, "hello");
//            ps.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        //snippet 19

//        String sql = "INSERT INTO names VALUES(?, ?, ?)";
//        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//                ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//             PreparedStatement ps = conn.prepareStatement(sql)) {
//            ps.setObject(1, 200);
//            ps.setObject(2, 21);
//            ps.setObject(3, "hello2");
//            ps.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        //snippet 20

//        var sql = "INSERT INTO names VALUES(?, ?, ?)";
//        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//                ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//             var ps = conn.prepareStatement(sql)) {
//            ps.setInt(1, 30);
//            ps.setInt(2, 1);
//            ps.setString(3, "Ester");
//            ps.executeUpdate();
//            ps.setInt(1, 31);
//            ps.setString(3, "Elias");
//            ps.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        //snippet 21 - check register method above too

//        Connection conn = null;
//        try {
//            conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//                    ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//            register(conn, 100, 1, "Elias", "Ester");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        //snippet 22

//        String sql = "SELECT id, name FROM exhibits";
//        var idToNameMap = new HashMap<Integer, String>();
//
//        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//        ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//             var ps = conn.prepareStatement(sql);
//             ResultSet rs = ps.executeQuery()) {
//
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                idToNameMap.put(id, name);
//            }
//            System.out.println(idToNameMap);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        //snippet 23

//        String sql = "SELECT id, name FROM exhibits";
//        var idToNameMap = new HashMap<Integer, String>();
//
//        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//        ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//             var ps = conn.prepareStatement(sql);
//             ResultSet rs = ps.executeQuery()) {
//
//            while (rs.next()) {
//                int id = rs.getInt(1);
//                String name = rs.getString(2);
//                idToNameMap.put(id, name);
//            }
//            System.out.println(idToNameMap);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        //snippet 24

//        var sql = "SELECT count(id) FROM exhibits";
//        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//                ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//                var ps = conn.prepareStatement(sql);
//             var rs = ps.executeQuery()) {
//            if (rs.next()) {
//                int count = rs.getInt(1);
//                System.out.println(count);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        //snippet 25

//        var sql = "SELECT count(id) FROM exhibits";
//        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//                ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//             var ps = conn.prepareStatement(sql);
//             var rs = ps.executeQuery()) {
//            if (rs.next()) {
//                int count = rs.getInt("count");
//                System.out.println(count);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        //snippet 26

//        var sql = "SELECT * FROM exhibits where name='Not in table'";
//        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//                ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//                var ps = conn.prepareStatement(sql);
//             var rs = ps.executeQuery()) {
//            rs.next();
//            rs.getInt(1);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        //snippet 27

//        var sql = "SELECT count(id) FROM exhibits";
//        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//                ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//                var ps = conn.prepareStatement(sql);
//             var rs = ps.executeQuery()) {
//            rs.getInt(1);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        //snippet 28

//        var sql = "SELECT id, name FROM exhibits";
//        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//                ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//             var ps = conn.prepareStatement(sql);
//             var rs = ps.executeQuery()) {
//
//            while (rs.next()) {
//                Object idField = rs.getObject("id");
//                Object nameField = rs.getObject("name");
//                if (idField instanceof Integer id)
//                    System.out.println(id);
//                if (nameField instanceof String name)
//                    System.out.println(name);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        //snippet 29

//        var sql = "SELECT id FROM exhibits WHERE name = ?";
//
//        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//                ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//             var ps = conn.prepareStatement(sql)) {
//            ps.setString(1, "Zebra");
//
//            try (var rs = ps.executeQuery()) {
//                while (rs.next()) {
//                    int id = rs.getInt("id");
//                    System.out.println(id);
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        //snippet 30

//        String sql = "{call read_e_names()}";
//        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//                ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//                CallableStatement cs = conn.prepareCall(sql);
//             ResultSet rs = cs.executeQuery()) {
//
//            while (rs.next()) {
//                System.out.println(rs.getString(3));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        //snippet 31

//        var sql = "{call read_names_by_letter(?)}";
//        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//                ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//                var cs = conn.prepareCall(sql)) {
//            cs.setString("prefix", "Z");
//
//            try (var rs = cs.executeQuery()) {
//                while (rs.next()) {
//                    System.out.println(rs.getString(3));
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        //snippet 32

//        var sql = "{?= call magic_number(?) }";
//        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//                ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//                var cs = conn.prepareCall(sql)) {
//            cs.registerOutParameter(1, Types.INTEGER);
//            cs.execute();
//            System.out.println(cs.getInt("num"));
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        //snippet 33

//        var sql = "{call double_number(?)}";
//        try (Connection conn = DriverManager.getConnection(ZooDb.ZOO_DB.getURL(),
//                ZooDb.ZOO_DB.getUSERNAME(), ZooDb.ZOO_DB.getPASSWORD());
//                var cs = conn.prepareCall(sql)) {
//            cs.setInt(1, 8);
//            cs.registerOutParameter(1, Types.INTEGER);
//            cs.execute();
//            System.out.println(cs.getInt("num"));
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        //snippet 34 - check Main2 class

        //snippet 35 - check bad method above

        //snippet 36

//        var sql = "SELECT not_a_column FROM names";
//        var url = "jdbc:hsqldb:zoo";
//        try (var conn = DriverManager.getConnection(url);
//             var ps = conn.prepareStatement(sql);
//             var rs = ps.executeQuery()) {
//            while (rs.next())
//                System.out.println(rs.getString(1));
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//            System.out.println(e.getSQLState());
//            System.out.println(e.getErrorCode());
//        }
    }
}