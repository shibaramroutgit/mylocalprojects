package javafaq.basicpro;

import java.util.Arrays;

public class LargestNumberOnArray {

    public static void main(String[] args)
    {
        int[] numS = {10,30,80,50,40,90,60};
        Arrays.sort(numS);
        System.out.println(numS[numS.length-1]);
        //or
        int max=numS[0];
        for (int i=0;i<=numS.length-1;i++)
        {
            if(max<numS[i])
            {
                max=numS[i];
            }
        }
        System.out.println(max);
        // We can do same logic for lowest by numS[0] after Arrays.sort90
        // We can do same logic for lowest by change condition if (max>numS[i])

    }
}
