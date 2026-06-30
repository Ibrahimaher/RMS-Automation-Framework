package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseHelper {

    public static String getUsername(String username) {

        String query = "SELECT UserName FROM ApplicationUser WHERE UserName = '" + username + "'";

        try (
                Connection con = databaseConnection.getConnection();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query)
        ) {

            if (rs.next()) {
                return rs.getString("UserName");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
