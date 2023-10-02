package Secao4.Exercicio_Iniciante_Parte_1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
        Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        mensagem explicativa, conforme exemplos.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um num: ");
        int n1 = sc.nextInt();

        System.out.print("Digite um num: ");
        int n2 = sc.nextInt();

        sc.close();

        System.out.println("SOMA = " + (n1 + n2));
    }
}
