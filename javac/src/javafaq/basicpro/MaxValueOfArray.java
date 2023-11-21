package javafaq.basicpro;

import java.util.Arrays;

public class MaxValueOfArray {
    public static void main(String[] args)
    {
        int[] numList = {10,50,60,30,90,200,70};
        Arrays.sort(numList);
        //max
        System.out.println(numList[numList.length-1]);
        //min
        System.out.println(numList[0]);
    }
}
