package j17fileoperation.j03inputoutputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class j01TestOutputStream {

    // IMP: If file not present, FileOutputStream will create the file instated throw file not fount exception
    public static void main(String [] args) throws IOException {
        File f1 = new File("D:\\MY_PROJECTS\\Java_Repository\\JavaConcepts\\FolderSource\\F2.txt");
        String fpath = "D:\\MY_PROJECTS\\Java_Repository\\JavaConcepts\\FolderSource\\F1.txt";
        String writeData = "Shibaram Rout";
        byte[] b1 = writeData.getBytes();
        FileOutputStream fos = new FileOutputStream(f1);
        fos.write(b1);

        fos.flush();
        fos.close();


    }
}
