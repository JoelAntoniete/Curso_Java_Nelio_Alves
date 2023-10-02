package Secao6.Exercicio_Iniciante_Parte_3.for_exercise;

import java.util.Scanner;

public class forExercicio6 {
    public static void main(String[] args) {
        /*
        Ler um número inteiro N e calcular todos os seus divisores.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:  ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
