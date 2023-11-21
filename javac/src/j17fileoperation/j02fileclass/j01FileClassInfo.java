package j17fileoperation.j02fileclass;

import java.io.File;
import java.io.IOException;

public class j01FileClassInfo {

    // File - class represent a file or directory
    //


    public static void main(String [] args)
    {
        File f1 = new File("D:\\MY_PROJECTS\\Java_Repository\\JavaConcepts\\FolderSource\\TetsZip\\ABC.txt");
        File f2 = new File("D:\\MY_PROJECTS\\Java_Repository\\JavaConcepts\\FolderSource\\TetsZip");

        File f3 = new File("D:\\MY_PROJECTS\\Java_Repository\\JavaConcepts\\FolderSource\\TetsZip\\TestFile.txt");
        if(f3.exists())
        {
            System.out.println("File Present");
        }else
        {
            try {
                f3.createNewFile();
            }catch (IOException e)
            {
                System.out.println(e.getMessage());
            }

        }
        System.out.println("--------------------------------------------");

        File f4 = new File("D:\\MY_PROJECTS\\Java_Repository\\JavaConcepts\\FolderSource\\TestFolder1");
        if(f4.exists())
        {
            System.out.println("Folder Present");
        }else
        {
            f4.mkdir();
        }
        System.out.println("-----------------------0-----------------------");

        System.out.println(f1.getName());
        System.out.println(f2.getName());
        System.out.println("-----------------------1-----------------------");

        System.out.println(f1.getPath());
        System.out.println(f1.getAbsolutePath());
        System.out.println("-----------------------2-----------------------");

        System.out.println(f1.getParent());
        System.out.println(f2.getParent());
        System.out.println("-----------------------3-----------------------");

        System.out.println(f1.exists());
        System.out.println("-----------------------4-----------------------");

        System.out.println(f1.canRead());
        System.out.println("-----------------------5-----------------------");

        System.out.println(f1.canWrite());
        System.out.println("-----------------------6-----------------------");

        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println("-----------------------7-----------------------");

        System.out.println(f1.length());
        System.out.println("-----------------------8-----------------------");


        String [] fileNames = f2.list();
        int filecount = fileNames.length;
        System.out.println(filecount);
        for (String s:fileNames) {
            System.out.println(s);
        }

        System.out.println("-----------------------9-----------------------");

        f4.delete();
        System.out.println("-----------------------9-----------------------");





















    }
}
