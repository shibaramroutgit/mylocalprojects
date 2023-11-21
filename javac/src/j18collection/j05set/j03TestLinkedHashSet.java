package j18collection.j05set;

import java.util.LinkedHashSet;

public class j03TestLinkedHashSet {

    // No Duplicate
    // Allow null
    // Insert Order Maintain
    public static void main(String [] args)
    {
        LinkedHashSet<String> set = new LinkedHashSet<String>();

        set.add("JAVA");
        set.add("J2EE");
        set.add("STRUTS");
        set.add("JDBC");
        set.add("JSP");
        set.add("JDBC");
        set.add("HIBERNATE");

        System.out.println(set);


    }


}
