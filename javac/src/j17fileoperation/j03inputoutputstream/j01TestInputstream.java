package j17fileoperation.j03inputoutputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class j01TestInputstream {

    public static void main(String [] args) throws IOException {
        File f1 = new File("D:\\MY_PROJECTS\\Java_Repository\\JavaConcepts\\FolderSource\\F1.txt");
        String fpath = "D:\\MY_PROJECTS\\Java_Repository\\JavaConcepts\\FolderSource\\F1.txt";
        FileInputStream fis = new FileInputStream(f1); // I can use f1 or fpath
        int i=fis.read(); // As it red 1 byte at a time so it red a and store the asic value
        System.out.println((char)i); // type cast to char
        // it read only 1 byte , if you want to read then do loop till the byte end. once it end if we do red it sent -1
        int x;
        while ((x=fis.read())!=-1)
        {
            System.out.println((char)x);
        }
        fis.close();


    }
}
