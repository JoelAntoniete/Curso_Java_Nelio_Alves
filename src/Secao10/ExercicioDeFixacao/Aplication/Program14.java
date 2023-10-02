package Secao10.ExercicioDeFixacao.Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler dois números inteiros M e N, e depois ler
        uma matriz de M linhas por N colunas contendo números inteiros,
        podendo haver repetições. Em seguida, ler um número inteiro X que
        pertence à matriz. Para cada ocorrência de X, mostrar os valores à
        esquerda, acima, à direita e abaixo de X, quando houver, conforme
        exemplo.

         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?  ");
        int qtd = sc.nextInt();
        int[][] matrix = new int[qtd][qtd];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("Digite um numero:  ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Digite um numero a ser encontrado:  ");
        int valor = sc.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] == valor){
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + matrix[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matrix[i-1][j]);
                    }
                    if (j < matrix[i].length-1) {
                        System.out.println("Right: " + matrix[i][j+1]);
                    }
                    if (i < matrix.length-1) {
                        System.out.println("Down: " + matrix[i+1][j]);
                    }
                }
            }
        }

    }
}
