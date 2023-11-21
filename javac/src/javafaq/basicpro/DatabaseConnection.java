package javafaq.basicpro;

import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) throws SQLException {
        String query = "Select * from EMP where user user name 'shibaram'";
     Connection sqlConnection =  DriverManager.getConnection("db_connect_string", "db_userid", "db_password");
        Statement statement = sqlConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
    }
}
