package javafaq.basicpro;

import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args)
    {
        String name = "SHIBARAM";
        StringBuffer sb = new StringBuffer(name);
        String newName1 = sb.reverse().toString();
        System.out.println(newName1);
        //or
        String city="MUMBAI";
        String resCity="";
        char[] cName = city.toCharArray();
        for (int i=cName.length-1;i>=0;i--)
        {
            resCity=resCity+cName[i];
        }
        System.out.println(resCity);
    }
}
