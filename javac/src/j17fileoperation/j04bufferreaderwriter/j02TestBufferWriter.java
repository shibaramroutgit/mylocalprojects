package j17fileoperation.j04bufferreaderwriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class j02TestBufferWriter {

    public static void main(String [] args) throws IOException
    {
        File f1 = new File("D:\\MY_PROJECTS\\Java_Repository\\JavaConcepts\\FolderSource\\F3.txt");
        String fpath = "D:\\MY_PROJECTS\\Java_Repository\\JavaConcepts\\FolderSource\\F3.txt";

        FileWriter fw = new FileWriter(f1);
        BufferedWriter bfw = new BufferedWriter(fw);
        String  s1 = "D:\\MY_PROJECTS\\Java_Repository\\JavaConcepts\\FolderSource\\F3.txt";
        bfw.write(s1);
        bfw.close();

    }
}
