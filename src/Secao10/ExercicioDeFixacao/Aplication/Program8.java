package Secao10.ExercicioDeFixacao.Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
        aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
        digitado, mostrar a mensagem "NENHUM NUMERO PAR"
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?  ");
        int qtd = sc.nextInt();

        int[] numeros= new int[qtd];
        int somaPares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            int num = sc.nextInt();
            if(num % 2 == 0){
                numeros[i] = num;
                somaPares += numeros[i];
            }
        }

        if(numeros.length == 0){
            System.out.println("NENHUM NUMERO PAR ");
        }else {
            System.out.printf("MEDIA DOS PARES = %.1f%n", (double) somaPares/ numeros.length);
        }
    }
}
