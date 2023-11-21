package javafaq.basicpro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ArrayToArrayList {
    public static void main(String[] args)
    {
        int[] numList = {10,20,30,40,50};
        List<Object>  objList = Arrays.asList(numList);
        for (Object i:objList) {
            System.out.println(i);
        }
    }
}
