package Secao17.Applications;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //leitura de um arquivo ja existente
        File file = new File("C:\\Users\\User\\Documents\\Curso_Java_Nelio_Alves\\Java_Nelio_Alves\\src\\Arquivos\\i.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while(sc.hasNextLine()) {
                System.out.println(sc.hasNextLine());
            }
        }catch(FileNotFoundException e) {
            throw new RuntimeException("Error: " + e.getMessage());
        }finally {
            if(sc != null){
                sc.close();
            }
        }


    }
}
