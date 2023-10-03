package Secao17.Applications;

import java.io.File;
import java.util.Scanner;

public class Program4 {
    //Manipulando pastas com File
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);

        //lista de pastas
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println(folder);
        }
        //lista de arquivos
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);
        }

        //criar uma subpasta
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success);
        sc.close();
    }
}
