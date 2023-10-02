package Secao15.Aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //Introducao a exceção
        method1();



        System.out.println("Fim do programa");

    }
    public static void method1(){
        System.out.println("--------- inicio ----------");
        method2();
        System.out.println("--------- inicio ----------");

    }
    public static void  method2(){
        System.out.println("--------- inicio ----------");
        Scanner sc = new Scanner(System.in);
        try {

            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Position");
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("Input Error");
            e.printStackTrace();
        }
        System.out.println("--------- fim ----------");

    }
}
