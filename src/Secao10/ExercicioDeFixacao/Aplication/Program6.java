package Secao10.ExercicioDeFixacao.Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        /*
        Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
        terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
        o vetor C gerado.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?  ");
        int qtd = sc.nextInt();

        System.out.println("Digite os valores do vetor A: ");
        int[] a= new int[qtd];
        for (int i = 0; i < a.length; i++) {
            int num = sc.nextInt();
            a[i] = num;
        }

        System.out.println("Digite os valores do vetor B: ");
        int[] b= new int[qtd];
        for (int i = 0; i < b.length; i++) {
            int num = sc.nextInt();
            b[i] = num;
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < b.length; i++) {
            System.out.println(a[i] + b[i]);
        }
    }
}
