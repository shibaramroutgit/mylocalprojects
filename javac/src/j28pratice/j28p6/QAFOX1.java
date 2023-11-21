package j28pratice.j28p6;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class QAFOX1 {

   /* static {
        System.out.println("It is from Static bloc - execute 1st");
    }*/

    public static void swapNumByVal(int num1, int num2)
    {
        int n1 = num1;
        int n2 = num2;
        int n3 = num1;
        num1 = num2;
        num2=n3;
        System.out.println(num1);
        System.out.println(num2);


    }
    public static void swapNum(int num1, int num2)
    {
        int n1 = num1;
        int n2 = num2;
        n2 = n1+n2;
        n1 = n2-n1;
        n2= n2-n1;

        System.out.println(n1);
        System.out.println(n2);

    }

    public static String evenOdd(int num)
    {
        if(num%2==0) {
            return num+"-"+"Even Number";
        }else {
            return  num+"-"+"Odd Number";

        }
    }

    public static int maxNumFromArray(int[] nl)
    {
        int max = nl[0];
        for(int i=0;i<=nl.length-1;i++)
        {
            if(max<nl[i])
            {
                max=nl[i];
            }
        }
        return max;
    }

    public static int reverseNum(int num)
    {
        int resNum = 0;
        while (num!=0)
        {
            int pnum=num%10;
            resNum=(resNum*10)+pnum;
            num=num/10;
        }
        return resNum;
    }

    public static String verifyPrime(int num)
    {
        int count=0;
        for (int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count>2) {
            return "Not Prime";
        }else {
            return "Prime";
        }
    }

    public static String verifyArmstrong(int num)
    {

        int sumNum=0;
        while (num!=0)
        {
         int pn=  num%10;
         num = num/10;
         sumNum = sumNum+(pn*pn*pn*pn) ;
        }
        if (num==sumNum) {
            return "Yes";
        }else {
            return "No";
        }

    }

    public static String[] subStringTest(String sr)
    {
        String[] sub = sr.split(" ");
        return sub;
    }
    public static String strReverse(String s1)
    {
        String newStr="";
        char[] charArray = s1.toCharArray();
        for (int i=charArray.length-1;i>=0;i--)
        {
            newStr = newStr+charArray[i];
        }
        return newStr;
    }

    public static String verifyPalindrome(int num)
    {
        int newNum=0;
        int orgNum=num;
        while (num!=0)
        {
            int pn = num%10;
            newNum = (newNum*10)+pn;
            num=num/10;
        }
        if (newNum==orgNum) {
            return "Palindrun";
        }else {
            return "Not Palindram";
        }
    }

    public static boolean comparStr(String s1, String s2)
    {
        if (s1.compareTo(s2)==0)
        {
            return true;
        }else {
            return false;
        }
    }


    public static String replaceStr(String a1, String a2, String a3)
    {
        String newStr = a1.replaceAll(a2,a3);
        return newStr;
    }

    public static String dateFormating(Date d)
    {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        String date= format.format(d);
        return date;
    }

    public static void getDBConnection(String Query)  {
        try {
            Connection sqlConnection = DriverManager.getConnection("db_connect_string", "db_userid", "db_password");
            Statement sqlQuery = sqlConnection.createStatement();
            ResultSet result = sqlQuery.executeQuery(Query);
            while (result.next()) {
                System.out.println(result.getString(1));
            }
        }catch (SQLException sqlException)
        {
            System.out.println(sqlException.getErrorCode());
        }

    }

    public static int convertStrToInt(String s)
    {
        int num = Integer.parseInt(s);
        return num;
    }
    public static String convertIntToStr(int n)
    {
        Integer i = n;
        return i.toString();
    }

    public static void stringToDate(String s)
    {
        try {
            Date d = new SimpleDateFormat("yyyy/MM/dd").parse(s);
            System.out.println(d);
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void sortNumber(int[] a)
    {
        Arrays.sort(a);
        for (int n:a) {
            System.out.println(n);
        }
    }


    public static void convertListToArray(List<String> l1)
    {
        Object[] as =  l1.toArray();
        for (Object o:as) {
            System.out.println(o);
        }
    }

    public static void convertArrayToList(String[] sa)
    {
        List<String> la = Arrays.asList(sa);

        for (Object o:sa) {
            System.out.println(o);
        }
    }

    public static void FibonacciTest(int n)
    {
        int firstNum=0;
        int secondNum=1;
        int nextNum;
        for(int i=1;i<=n;i++)
        {
            System.out.println(secondNum);
            nextNum=firstNum+secondNum;
            firstNum=secondNum;
            secondNum=nextNum;
        }
    }
    
    ////////////////////////////////////////////////////////////////////
    public static void main(String[] args)
    {
        // Write a Java program to print the input from scanner?
        /*Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int age = s.nextInt();
        System.out.println(name);
        System.out.println(age);*/

        //Write a Java program to swap two numbers?
        /*swapNumByVal(10,30);*/
        /*swapNum(10,30);*/


        //Write a Java program to find the largest number in an array?
        /*int[] nums = {1,20,12,40,60};
        Arrays.sort(nums);
        System.out.println(nums[nums.length-1]);*/

        /*int[] nums = {1,20,12,40,60};
        int maxval = maxNumFromArray(nums);
        System.out.println(maxval);*/

        //Write a Java program to find odd and even numbers ?
        /*String val = evenOdd(8);
        System.out.println(val);*/

        //Write a Java program to print the entered number in reverse?
        /*int resVal = reverseNum(468);
        System.out.println(resVal);*/

        //Write a Java program for printing the prime numbers?
        /*String val = verifyPrime(18);
        System.out.println(val);*/

       /* String val = verifyArmstrong(1634);
        System.out.println(val);*/

        /*String ss = "Shibaram Rout Banglore India";
       String[] ssA =  subStringTest(ss);
        for (String sv:ssA) {
            System.out.println(sv);
        }*/

        //Write a Java program to print the given string in reverse?
        /*String name="Shibaram";
        String newName = strReverse(name);
        System.out.println(newName);*/

        //Write a Java program to check whether the given number is palindrome?
        /*int x = 141;
        String val = verifyPalindrome(x);
        System.out.println(val);*/

        //Write a Java program to compare two strings?
       /* String s1 = "Shibaram";
        String s2 = "shibaram";
        boolean b1 = comparStr(s1,s2);
        System.out.println(b1);*/

        //Write a Java program to demonstrate how to replace a string with another string?
        /*String ss = replaceStr("Shibaram Rout India","India", "UK");
        System.out.println(ss);*/

        //Write a Java program to demonstrate a Static block?
        /*System.out.println("Static Main Method Call execute 2nd");*/

        //Write a Java program to print date in given format?
        /*Date d = new Date();
        String formatDate = dateFormating(d);
        System.out.println(formatDate);*/

        //Write a Java program to demonstrate connecting to a Database?
        /*getDBConnection("Select * from USERTBL");*/

        //Write a Java program to convert string to integer?
        /*int x = convertStrToInt("102");
        System.out.println(x*2);*/

        //Write a Java program to convert integer to string?
        /*String str1 =  convertIntToStr(102);
        System.out.println(str1+"SR");*/

        //Write a Java program to convert string to date?
        /*stringToDate("01/01/2020");*/

        //Write a Java program for sorting of numbers?
        /*int [] num ={10,50,90,30,70};
        sortNumber(num);*/

        //How to convert Array to ArrayList and ArrayList to Array?
        /*ArrayList<String> al = new ArrayList<String>();
        al.add("Shibaram");
        al.add("Deepak");
        al.add("Dasarathi");
        convertListToArray(al);*/

        /*String[] s1 = {"Shibaram","Deepak","Dasarathi"};
        convertArrayToList(s1);*/

        //Write a Java program for printing the Fibonacci series from 1 to 10?
       /* FibonacciTest(10);*/


        //Check whether a string is anagram of another string?


    }
}

