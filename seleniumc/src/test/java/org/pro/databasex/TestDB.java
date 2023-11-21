package org.pro.databasex;

import java.util.List;

public class TestDB {

    public static void main(String [] args)
    {
        DBManager dbm = new DBManager();
        dbm.setConnectionSQL();
        List<Actor> sqlQueryData = dbm.getSQLQueryData("SELECT * FROM public.actor where actor_id<10");
        for (Actor data:sqlQueryData) {
            System.out.println(data);

        }

    }
}
