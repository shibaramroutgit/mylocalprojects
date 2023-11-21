package javafaq.basicpro;

public class OddEvenNumber {
    public static void main(String[] args)
    {
        // % operator return reminder if 0 then odd else even
        int[] numS = {2,3,4,5,6,7,8,9};
        for (int i=0;i<numS.length-1;i++) {
            if (numS[i] % 2 == 0) {
                System.out.println(numS[i] + "- is Even Number");
            } else {
                System.out.println(numS[i] + "-is Odd Number");
            }
        }
    }
}
