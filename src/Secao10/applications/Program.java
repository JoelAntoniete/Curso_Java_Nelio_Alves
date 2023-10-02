package Secao10.applications;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro N e a altura de N
        pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
        altura média dessas pessoas.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas: ");
        int qtd = sc.nextInt();

        double[] vect = new double[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite a altura: ");
            vect[0] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < qtd; i++) {
            soma += vect[i];
        }

        System.out.println("A media das alturas é: " + soma /qtd);



        sc.close();
    }
}
