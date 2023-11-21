package javafaq.basicpro;

public class ReplaceStringWithOtherString {
    public static void main(String[]args)
    {
        String addLoc = "Shibaram or Sanjay or Arabinda and Deepak and Subash ";
        String newAddLoc = addLoc.replace("or","-").replace("and","-").toString();
        System.out.println(newAddLoc);
    }
}
