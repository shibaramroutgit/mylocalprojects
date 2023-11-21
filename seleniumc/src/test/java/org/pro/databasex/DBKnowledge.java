package org.pro.databasex;

public class DBKnowledge {
    /**
     * JDBC (Java Database Connectivity) is a SQL level API that allows you to execute SQL statements.
     * It is responsible for the connectivity between the Java Programming language and a wide range of databases
     *
     * Primary Classes
     * 1 Driver
     * 2 Driver Manager
     * 3 Connection
     * 4 Statement
     * 5 ResultSet
     * 6 SQLException
     *
     * Setup Connection
     *      1 Create variable for Host, UserName, Password
     *      # "jdbc:Database Name://localhost:port Number/DB Name";
     *      2 Load the Driver of JDBC
     *      # Class.forName("org.postgresql.Driver");
     *      3 Create DB connection
     *      # Connection DBCon = DriverManager.getConnection(DBHost, DBName, DBPassword);
     *      4 Execute Query
     *      # Statement QStatement = DBConn.createStatement();
     *      # ResultSet ResultData = queryStatement.executeQuery(query);
     *      5 Process the ResultData and get String Column Data
     *      # ArrayList<String> listData = new ArrayList<String>();
     *      # while (result.next())
     *             {
     *                 listData.add(result.getString(1));
     *             }
     *      #
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     */
}
