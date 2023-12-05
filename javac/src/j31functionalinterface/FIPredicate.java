package j31functionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FIPredicate {

    public static void main(String[] args) {
       List <Integer>l1 = new ArrayList<Integer>();
       l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        l1.add(10);
        //Stream<Integer> strlist = l1.stream();
        //System.out.println(l1.stream().count());
        //l1.stream().collect(Collectors.toList());
        //System.out.println( l1.stream().collect(Collectors.toList()));
        //l1.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(l1.stream().filter(x->x%2==0).collect(Collectors.toList()));
        l1.stream().reduce()


    }
}
