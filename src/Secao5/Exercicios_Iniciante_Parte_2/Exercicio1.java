package Secao5.Exercicios_Iniciante_Parte_2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um num inteiro: ");
        int num = sc.nextInt();

        sc.close();

        if(num >=0){
            System.out.println("NAO NEGATIVO");
        }else{
            System.out.println("NEGATIVO");
        }
    }
}
