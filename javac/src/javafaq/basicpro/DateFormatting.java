package javafaq.basicpro;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting {
    public static void main(String[] args)
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/mm/dd");
        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));

    }
}
