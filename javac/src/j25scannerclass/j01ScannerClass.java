package j25scannerclass;

import java.util.Scanner;

public class j01ScannerClass {

    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a First ");
        String i = s1.nextLine();
        System.out.println("Enter a Last");
        String j = s1.nextLine();
        String k = i+j;
        System.out.println(k);
    }
}
