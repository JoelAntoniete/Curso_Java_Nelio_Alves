package Secao17.Applications;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {
    //FileWriter e BufferedWriter
    public static void main(String[] args) {
        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
        // se colocarmos true no fileWrite ele continua escrevendo a cada execulcao
        String path = "C:\\Users\\User\\Documents\\Curso_Java_Nelio_Alves\\Java_Nelio_Alves\\src\\Arquivos\\out.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
