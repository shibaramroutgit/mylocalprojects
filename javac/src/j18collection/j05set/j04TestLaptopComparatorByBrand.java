package j18collection.j05set;

import java.util.Comparator;

public class j04TestLaptopComparatorByBrand implements Comparator <j04TestLaptop>{
    @Override
    public int compare(j04TestLaptop o1, j04TestLaptop o2) {
        return o1.brandname.compareTo(o2.brandname);
    }
}
