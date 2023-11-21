package j18collection.j05set;

import java.util.TreeSet;

public class j02TestTreeSet {

    // It is used when we want to sort the object in a user define order by comparator
    // In general Set interface does not hold the order , we can not access by index
    // Duplicate not allow is its default nature
    // TreeSet implements SortedSet Interface , SortedSet interface extends Set Interface
    // IMP: The column we use to do comparator , if that column has duplicate then it remove while process because
    // Set not allow duplicate
    public static void main(String [] args)
    {
        //TreeSet<j03TestLaptop> obj = new TreeSet<j03TestLaptop>(new j04TestLaptopComparatorByBrand());
        TreeSet<j04TestLaptop> obj = new TreeSet<j04TestLaptop>(new j04TestLaptopComparatorByPrice());
        obj.add(new j04TestLaptop(10000,"HP"));
        obj.add(new j04TestLaptop(20000,"Dell"));
        obj.add(new j04TestLaptop(30000,"Apple"));
        obj.add(new j04TestLaptop(10000,"MI"));
        obj.add(new j04TestLaptop(40000,"HP"));
        obj.add(new j04TestLaptop(20000,"Acc"));
        for (j04TestLaptop lp:obj) {
            System.out.println(lp.price+"-"+lp.brandname);
        }

    }
}
