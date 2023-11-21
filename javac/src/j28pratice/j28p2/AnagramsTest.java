package j28pratice.j28p2;

import java.util.Arrays;

public class AnagramsTest {

    public static void main(String[] args)
    {
        String s1 = "Race";
        String s2 = "Caree";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length()==s2.length())
        {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if (Arrays.equals(c1,c2))
            {
                System.out.println("Anagrams");
            }else {
                System.out.println("Not Anagrams");
            }


        }else {
            System.out.println("Not Anagrams");
        }
    }
}
