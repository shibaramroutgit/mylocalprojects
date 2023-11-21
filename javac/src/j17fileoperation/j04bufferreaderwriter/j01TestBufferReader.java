package j17fileoperation.j04bufferreaderwriter;

import java.io.*;

public class j01TestBufferReader {

    public static void main(String [] args) throws IOException {
        File f1 = new File("D:\\MY_PROJECTS\\Java_Repository\\JavaConcepts\\FolderSource\\F2.txt");
        String fpath = "D:\\MY_PROJECTS\\Java_Repository\\JavaConcepts\\FolderSource\\F2.txt";
        FileReader fd = new FileReader(f1);
        BufferedReader bf1 = new BufferedReader(fd);
        System.out.println(bf1.read()); // read a single character
        System.out.println(bf1.readLine()); // read a single line at a time
        System.out.println("-------------------------------");
        String s="";
        while ((s=bf1.readLine())!=null)
        {
            System.out.println(s);
        }

        /*int c;
        while ((c=bf1.read())!=-1)
        {
            System.out.println((char)c);
        }*/


    }
}
