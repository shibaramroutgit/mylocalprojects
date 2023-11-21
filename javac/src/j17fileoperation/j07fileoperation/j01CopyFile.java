package srout.prox.j17fileoperation.j07fileoperation;

import java.io.*;

public class j01CopyFile {

    public static void main(String [] args) throws IOException {

        File f1 = new File("D:\\MY_PROJECTS\\Java_Repository\\JavaConcepts\\FolderSource\\F2.txt");
        String fpath = "D:\\MY_PROJECTS\\Java_Repository\\JavaConcepts\\FolderSource\\F3.txt";

        FileInputStream fis = new FileInputStream(f1); // Reading from this file
        FileOutputStream fos = new FileOutputStream(fpath); // Writing same data into this file
        int i;
                while((i= fis.read())!=-1)
                {
                    fos.write(i);
                }
        fis.close();
        fos.flush();
        fos.close();




    }
}
