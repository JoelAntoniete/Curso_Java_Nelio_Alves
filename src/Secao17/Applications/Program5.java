package Secao17.Applications;

import java.io.File;
import java.util.Scanner;

public class Program5 {
    //Informações do caminho do arquivo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);

        System.out.println("getPath: " + path.getPath()); //pega o caminho do arquivo
        System.out.println("getParent: " + path.getParent()); //pega o caminho sem o nome do arqivo
        System.out.println("getName: " + path.getName());//pega apenas o nome
        sc.close();
    }
}
