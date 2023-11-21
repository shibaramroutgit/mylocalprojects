package javafaq.basicpro;

import java.util.Arrays;

public class SortNumberArray {
    public static void main(String[] args){
        int[] numList = {10,4,3,8,9,5,1,2,7,6};
        Arrays.sort(numList);
        //ASC
        for(int i=0;i<=numList.length-1;i++)
        {
            System.out.println(numList[i]);
        }
        //DEC
        for (int i=numList.length-1;i>=0;i--)
        {
            System.out.println(numList[i]);
        }
    }
}
