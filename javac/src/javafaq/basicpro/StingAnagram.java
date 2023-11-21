package javafaq.basicpro;

import java.util.Arrays;

public class StingAnagram {
    public static void main(String[] arg)
    {
        String str1 = "listen";
        String str2 = "silent";
        char[] cStr1 = str1.toCharArray();
        char[] cStr2 = str2.toCharArray();
        Arrays.sort(cStr1);
        Arrays.sort(cStr2);
        if (Arrays.equals(cStr1,cStr2))
        {
            System.out.println("Sting Anagram");
        }else {
            System.out.println("Sting Not Anagram");
        }

    }
}

