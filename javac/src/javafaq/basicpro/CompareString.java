package javafaq.basicpro;

public class CompareString {
    public static void main(String[] args)
    {
        String s1 = "shibaram";
        String s2 = "shibarem";
        if(s1.length()!= s2.length()) {
            System.out.println("Both String are not equal1");
        }else{
            if(s1.equals(s2))
            {
                System.out.println("Both String are equal2");
            }else {
                System.out.println("Both String are not equal3");
            }
        }
    }
}
