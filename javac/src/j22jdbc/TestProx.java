package j22jdbc;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestProx
{

        public static void main(String args[])
        {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date d = new Date();

            System.out.println(df.format(d));
        }
}
