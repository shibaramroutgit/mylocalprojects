package srout.prox.j17fileoperation.j05zip;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class j01TestSingleFileZip {

    public static void main(String [] args)
    {
        try {
            //Step 1 Create a File Class Object to represent a file
            File f = new File("D:\\MY_PROJECTS\\Java_Repository\\JavaConcepts\\FolderSource\\TetsZip\\ABC.txt");
            //Step 2 FileInoutStream to read file
            FileInputStream fis = new FileInputStream(f);
            // Step 3 When we convert the reading file data into a zip file
            FileOutputStream fos = new FileOutputStream("D:\\MY_PROJECTS\\Java_Repository\\JavaConcepts\\FolderSource\\TetsZip\\Testx.zip");
            ZipOutputStream zop = new ZipOutputStream(fos);
            ZipEntry ze = new ZipEntry(f.getName());
            zop.putNextEntry(ze);
            byte [] bytes = new byte[1024];
            while (fis.read(bytes)>=0)
            {
                zop.write(bytes,0,bytes.length);
            }
            zop.closeEntry();
            fis.close();
            zop.close();
            fos.close();

        }catch (IOException i)
        {
            System.out.println(i.getMessage());
        }finally {

        }

    }
}
