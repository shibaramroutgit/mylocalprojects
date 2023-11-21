package srout.prox.j17fileoperation.j07fileoperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class j02TestCount {
   static  BufferedReader bf1=null;
    public static int lineCount(BufferedReader bf1) throws IOException {
        int lineCount=0;
        String l;
        while ((l=bf1.readLine())!=null)
        {
            lineCount++;
        }
        return lineCount;
    }


    public static int wordCount(BufferedReader bf1) throws IOException {
        int wCount=0;
        String s;
        while ((s=bf1.readLine())!=null)
        {
                String[] wc = s.split(" ");
                wCount=wCount+wc.length;
        }
        return wCount;
    }

    public static int charCount(BufferedReader bf1) throws IOException {
        int chCount=0;
        int c;
        while ((c=bf1.read())!=-1)
        {
            chCount++;
        }
        return chCount;
    }
    public static void main(String [] args) throws IOException
    {
        File f1 = new File("D:\\MY_PROJECTS\\Java_Repository\\JavaConcepts\\FolderSource\\F2.txt");
        FileReader fd = new FileReader(f1);
        BufferedReader bf1 = new BufferedReader(fd);
        // Line Count
       /* int x = lineCount(bf1);
       System.out.println("Line Count-"+x);*/

       //Word Count
        /*int y = wordCount(bf1);
        System.out.println("Word Count-"+y);*/

        // Char Count
        int z = charCount(bf1);
        System.out.println("Word Count-"+z);
        bf1.close();
    }
}
