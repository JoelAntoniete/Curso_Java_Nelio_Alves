package Secao4.Exercicio_Iniciante_Parte_1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

         */
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Codigo do produto 1");
        int cod1 = sc.nextInt();
        System.out.println("Quantidade do produto 1");
        int qnt1 = sc.nextInt();
        System.out.println("Valor do produto 1");
        double valor1 = sc.nextDouble();

        System.out.println("Codigo do produto 2");
        int cod2 = sc.nextInt();
        System.out.println("Quantidade do produto 2");
        int qnt2 = sc.nextInt();
        System.out.println("Valor do produto 2");
        double valor2 = sc.nextDouble();

        sc.close();

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", (qnt1 * valor1) + (qnt2 * valor2));

    }
}
