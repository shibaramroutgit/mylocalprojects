package javafaq.basicpro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
    public static void main(String[] args) throws ParseException {
        String strDate = "2023/11/21";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/mm/dd");
        Date date = simpleDateFormat.parse(strDate);
        System.out.println(date);

    }
}
