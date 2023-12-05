package j30date;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateProx
{

        public static void main(String[]args)
        {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date d = new Date();

            System.out.println(df.format(d));
        }
}
