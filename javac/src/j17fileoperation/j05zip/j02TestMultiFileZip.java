package srout.prox.j17fileoperation.j05zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class j02TestMultiFileZip {

    public static void main(String [] args) throws IOException {
        ArrayList<File> al = new ArrayList<File>();
        al.add(new File("D:\\MY_PROJECTS\\Java_Repository\\JavaConcepts\\FolderSource\\TetsZip\\ABC.txt"));
        al.add(new File("D:\\MY_PROJECTS\\Java_Repository\\JavaConcepts\\FolderSource\\TetsZip\\DEF.txt"));
        al.add(new File("D:\\MY_PROJECTS\\Java_Repository\\JavaConcepts\\FolderSource\\TetsZip\\GHI.txt"));
        
        
        FileOutputStream fos = new FileOutputStream("D:\\MY_PROJECTS\\Java_Repository\\JavaConcepts\\FolderSource\\MFzip.zip");
        ZipOutputStream zop = new ZipOutputStream(fos);

        for (File obj1 :al)
        {
            FileInputStream fis = new FileInputStream(obj1);
            ZipEntry ze = new ZipEntry(obj1.getName());
            zop.putNextEntry(ze);
            byte[] b1 = new byte[1024];
            while (fis.read(b1)>=0)
            {
                zop.write(b1,0,b1.length);
            }
            zop.closeEntry();
            fis.close();
        }

        zop.close();
        fos.close();

    }
}
