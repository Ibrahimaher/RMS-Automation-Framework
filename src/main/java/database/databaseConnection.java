package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseConnection {

        private static final String URL =
                "jdbc:sqlserver://10.10.8.181;databaseName=RmsMainTest2;encrypt=false;trustServerCertificate=true";
        private static final String USER = "sa";
        private static final String PASS = "P@ssw0rd";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL, USER, PASS);
        }
    }

