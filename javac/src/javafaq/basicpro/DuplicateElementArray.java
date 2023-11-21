package javafaq.basicpro;

public class DuplicateElementArray {
    public static void main(String[] args)
    {
        //char[] name = {'s','h','i','b','a','r','a','m','r','o','u','t'};
        String strName = "shibaramrout";
        char[] name = strName.toCharArray();
        for (int i=0;i<name.length-1;i++)
        {
            for(int j=i+1;j<=name.length-1;j++)
            {
                if(name[i]==name[j])
                {
                    System.out.println(name[i]);
                }
            }
        }
    }
}
