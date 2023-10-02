package Secao4.Exercicio_Iniciante_Parte_1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A ");
        int A = sc.nextInt();
        System.out.println("Digite o valor de B ");
        int B = sc.nextInt();
        System.out.println("Digite o valor de C ");
        int C = sc.nextInt();
        System.out.println("Digite o valor de D ");
        int D = sc.nextInt();

        System.out.println("DIFERENCA = " + ((A*B) - (C*D)));
        sc.close();

    }
}
