package Secao17.Applications;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program1 {
    public static void main(String[] args) {
        //leitura de arquivo usando fileReader e BufferdReader
        String path = "C:\\Users\\User\\Documents\\Curso_Java_Nelio_Alves\\Java_Nelio_Alves\\src\\Arquivos\\i.txt";

        FileReader fr = null;
        BufferedReader bf = null;

        try{
            fr = new FileReader(path);
            bf = new BufferedReader(fr);

            String line = bf.readLine();
            while(line != null){
                System.out.println(line);
                line = bf.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {

                try {
                    if(bf != null){
                        bf.close();
                    }
                    if(fr != null){
                        fr.close();
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

        }
    }
}
