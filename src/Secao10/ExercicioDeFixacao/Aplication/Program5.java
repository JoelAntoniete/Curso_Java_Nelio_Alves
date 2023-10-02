package Secao10.ExercicioDeFixacao.Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        /*
        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
        o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
        considerando a primeira posição como 0 (zero).
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

        int maior = 0;
        int index = 0;
        for (int i = 1; i < numeros.length; i++) {
            if(numeros[i] > numeros[i-1]){
                maior = numeros[i];
                index = i;
            }
        }

        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + index);

    }
}
