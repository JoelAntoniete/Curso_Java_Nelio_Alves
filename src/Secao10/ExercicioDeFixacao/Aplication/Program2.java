package Secao10.ExercicioDeFixacao.Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        /*
        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade: ");
        int qtd = sc.nextInt();

        double[] vet = new double[qtd];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um valor:  ");

            double value = sc.nextDouble();
            vet[i] = value;
        }

        double soma = 0;

        System.out.print("VALORES = ");
        for (int i = 0; i < vet.length; i++) {
            soma += vet[i];
            System.out.print(vet[i] + " ");
        }
        System.out.println();
        System.out.println("SOMA= "+ soma);
        System.out.printf("MEDIA= %.2f%n", soma/ vet.length);
        sc.close();
    }
}
