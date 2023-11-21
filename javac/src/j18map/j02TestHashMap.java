package j18map;

import java.util.*;

public class j02TestHashMap {




    public static void main(String [] args)
    {
        HashMap<String,Double> hm1 = new HashMap<String,Double>();
        hm1.put("Shiba",87.55);
        hm1.put("Rama",95.65);
        hm1.put("Rout",28.40);
        hm1.put("Aska",87.22);
        hm1.put("Odisha",87.55);
        hm1.put(null,null);
        hm1.put(null,null);
        hm1.put("Berhampur",null);
        System.out.println("Size of Map: "+hm1.size());
        System.out.println("---------------1---------------------");
        // Get All Values
        Collection<Double> c1 = hm1.values(); // return a collection (Interface) object
        Iterator ix = c1.iterator();
        while(ix.hasNext())
        {
            System.out.println(ix.next());
        }
        System.out.println("-----------------2-------------------");
        // Get Keys
        Set s1 =hm1.keySet(); // return set collection of key
        Iterator iz=s1.iterator();
        while(iz.hasNext())
        {
            System.out.println(iz.next());
        }
        System.out.println("-----------------3------------------");


        // Get all Entry Set (key-value) pair

        for (Map.Entry<String,Double> e1:hm1.entrySet())
        {
            System.out.println(e1.getKey()+"-"+e1.getValue());
        }
        System.out.println("-----------------4------------------");
        Set s2= hm1.entrySet();

        Iterator <Map.Entry<String, Double>> ie= hm1.entrySet().iterator();
        while (ie.hasNext())
        {
           // System.out.println(ie.next().getKey());
            System.out.println(ie.next().getValue());

        }
        System.out.println("-----------------5------------------");
    }
}
