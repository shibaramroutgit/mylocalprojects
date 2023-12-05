package javafaq;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class faqInfo {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        String a= "silent";
        String b="listyen";
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        if (Arrays.equals(a1,b1))
        {
            System.out.println("Yes");
        }else {
            System.out.println("N0");
        }

    }

}




