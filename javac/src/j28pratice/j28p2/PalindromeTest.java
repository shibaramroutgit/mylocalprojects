package j28pratice.j28p2;

public class PalindromeTest {
    public static void main(String[] args)
    {
        String name="ABA";
        String newName="";
        /*char[] charsName = name.toCharArray();
        System.out.println(charsName.length);
        for(int i=charsName.length-1;i>=0;i--)
        {
            newName+=charsName[i];

        }*/
        StringBuilder sb = new StringBuilder(name);
        newName=sb.reverse().toString();
        if(name.equals(newName))
        {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
