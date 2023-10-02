package Secao10.ExercicioDeFixacao.Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        /*

         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?  ");
        int qtd = sc.nextInt();
        int negativos=0;

        int[][] matrix = new int[qtd][qtd];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("Digite um numero:  ");
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] < 0){
                    negativos++;
                }
            }
        }
        System.out.println("Main diagonal: ");

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][i]);
        }

        System.out.println("Negative numbers = " + negativos);
    }
}
