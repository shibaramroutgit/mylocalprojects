package org.pro.databasex;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBManager {

   public static Connection sqlconnection;

   @BeforeClass
    public void setConnectionSQL()
    {

        String DBHost = "jdbc:postgresql://localhost:5432/dvdrental";
        String DBName = "postgres";
        String DBPassword = "admin";
        try {
            Class.forName("org.postgresql.Driver");
            sqlconnection = DriverManager.getConnection(DBHost, DBName, DBPassword);
            System.out.println("DB Connected");
            //sqlconnection.close();
            //sqlQueryDataSystem.out.println("DB Closed");
        } catch (Exception e) {
            e.getMessage();
            }
    }

    @Test
    public List<Actor> getSQLQueryData(String query)
    {
        ArrayList<Actor> listData = new ArrayList<Actor>();
        try {
            Statement queryStatement = sqlconnection.createStatement();
            ResultSet result = queryStatement.executeQuery(query);
            while (result.next())
            {
                /*String currentVal = result.getString(1) +" - " +
                result.getString(2) +" - " +
                result.getString(3) +" - " +
                result.getString(4);
                listData.add(currentVal);*/
                Actor actor = new Actor(result.getString(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4));
                listData.add(actor);

            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }



        return listData;
    }

    @Test
    public void getData()
    {
        setConnectionSQL();
        getSQLQueryData("select username from UserTable where uid=123");
    }

}
class Actor
{
    String id;
    String fName;
    String lName;
    String date;
    public Actor(String id,String fName, String lName, String date)
    {
        this.id=id;
        this.fName=fName;
        this.lName=lName;
        this.date=date;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id='" + id + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}

