package javafaq.basicpro;

public class SubStringOfString {
    public static void main(String[] args)
    {
        String addLoc = "India Karnataka Bangalore Whitefield Apartment DLF";
        String[] subAddLoc = addLoc.split(" ");
        for (String s:subAddLoc) {
            System.out.println(s);
        }
    }
}
