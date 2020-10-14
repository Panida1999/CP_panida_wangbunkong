package Lab9;
import java.io.File;
import java.io.IOException;
public class ExCreateFile {
    public static void main(String[] args) {
        File myfile = new File("exFile.txt");
        try {
            if (myfile.createNewFile()) {
                System.out.println("Creatad File is successful.");
            } else {
                System.out.println("Can not create file.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        //canRead()
        if (myfile.canRead()) {
            System.out.println("Can read this file.");
        }else {
            System.out.println("Can not read this file.");
        }
        //canWrite()
        if (myfile.canWrite()) {
            System.out.println("Can write this file.");
        }else {
            System.out.println("Can not write this file.");
        }
        //exists
        if (myfile.exists()) {
            System.out.println("This file is exists.");
        }else {
            System.out.println("This file is not exists.");
        }
        //getName()
        System.out.println("File name is "+myfile.getName());
        //getPath()
        System.out.println("Path file is "+myfile.getPath());
        //ren


    }
}