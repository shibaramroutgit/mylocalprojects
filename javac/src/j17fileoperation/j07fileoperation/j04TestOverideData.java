package srout.prox.j17fileoperation.j07fileoperation;

import java.io.*;

public class j04TestOverideData {

    BufferedReader bf1=null;
    BufferedWriter bw1 = null;
    public static void overrideFileF3ToF4(BufferedReader br1,BufferedWriter bw1 ) throws IOException {
        String s = "";
        while ((s = br1.readLine())!=null)
        {
            bw1.write(s +"\n");

        }
        br1.close();
        bw1.close();

    }

    public static void main(String [] args) throws IOException {
        File f1 = new File("D:\\MY_PROJECTS\\Java_Repository\\JavaConcepts\\FolderSource\\F3.txt");
        File f2 = new File("D:\\MY_PROJECTS\\Java_Repository\\JavaConcepts\\FolderSource\\F4.txt");
        FileReader fr = new FileReader(f1);
        FileWriter fw = new FileWriter(f2,false);
        BufferedReader br1 = new BufferedReader(fr);
        BufferedWriter bw1 = new BufferedWriter(fw);
        overrideFileF3ToF4(br1, bw1);


    }
}
