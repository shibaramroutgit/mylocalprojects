package javafaq.basicpro;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("Shibaram");
        strList.add("Sanjay");
        strList.add("Arabinda");
        strList.add("Deepak");
        Object[] aList = strList.toArray();
        for (Object o : aList) {
            System.out.println(o);
        }
    }
}
