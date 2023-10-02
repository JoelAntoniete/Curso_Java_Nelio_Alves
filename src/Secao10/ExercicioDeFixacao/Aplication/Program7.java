package Secao10.ExercicioDeFixacao.Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
        mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
        os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?  ");
        int qtd = sc.nextInt();

        double[] numeros= new double[qtd];
        double soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            double num = sc.nextInt();
            numeros[i] = num;
            soma += num;
        }
        double media = soma / numeros.length;

        System.out.printf("MEDIA DO VETOR = %.3f%n",media );

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] < media){
                System.out.print(numeros[i] + " ");
            }
        }


    }
}
