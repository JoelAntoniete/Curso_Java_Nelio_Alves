package Secao10.ExercicioDeFixacao.Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
        Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade: ");
        int qtd = sc.nextInt();

        int[] vet = new int[qtd];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um valor:  ");

            int value = sc.nextInt();
            vet[i] = value;
        }

        for (int i = 0; i < vet.length; i++) {
            if(vet[i] < 0){
                System.out.println(vet[i]);
            }
        }
    }
}
