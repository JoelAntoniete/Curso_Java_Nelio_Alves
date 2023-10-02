package Secao10.ExercicioDeFixacao.Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        /*
        Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
        tela todos os números pares, e também a quantidade de números pares
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?  ");
        int qtd = sc.nextInt();

        int[] numeros= new int[qtd];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            int num = sc.nextInt();
            numeros[i] = num;
        }

        int pares =0;
        System.out.println("NUMEROS PARES: ");

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 == 0){
                pares++;
                System.out.print(numeros[i] + " ");
            }
        }

        System.out.println();
        System.out.println("QUANTIDADE DE PARES =  " + pares);

        sc.close();
    }
}
