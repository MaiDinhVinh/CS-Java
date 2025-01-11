/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class16_javafx_i18n_l10n;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class DbService {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String CONN_STRING
            = "jdbc:mysql://localhost/1808g";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);

    }
}
