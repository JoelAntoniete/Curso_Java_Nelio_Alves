package Secao6.Exercicio_Iniciante_Parte_3.for_exercise;

import java.util.Scanner;

public class forExercicio5 {
    public static void main(String[] args) {
        /*
        Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        Lembrando que, por definição, fatorial de 0 é 1.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o fatorial: ");
        int tamanho = sc.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= tamanho; i++) {
                fatorial *= i;
        }

        System.out.printf("O fatorial de %d é %d", tamanho, fatorial);
        sc.close();
    }
}
