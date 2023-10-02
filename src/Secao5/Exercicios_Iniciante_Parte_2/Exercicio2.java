package Secao5.Exercicios_Iniciante_Parte_2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um num inteiro: ");
        int num = sc.nextInt();

        sc.close();

        if(num % 2 == 0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
    }
}
