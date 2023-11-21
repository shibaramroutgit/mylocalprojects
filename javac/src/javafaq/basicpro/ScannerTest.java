package javafaq.basicpro;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Val1");
        int v1=obj.nextInt();
        System.out.println("Enter Val2");
        int v2 = obj.nextInt();
        int total = v1+v2;
        String name = obj.nextLine();
        System.out.println("Pro by-"+name+"-"+"sum of 2 val="+total);

    }
}
