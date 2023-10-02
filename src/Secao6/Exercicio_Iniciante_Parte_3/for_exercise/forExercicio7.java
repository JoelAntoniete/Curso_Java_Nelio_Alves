package Secao6.Exercicio_Iniciante_Parte_3.for_exercise;

import java.util.Scanner;

public class forExercicio7 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
        começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
        exemplo.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:  ");
        int valor = sc.nextInt();

        for (int i = 1; i <=valor ; i++) {

            int quadrado = (int) Math.pow(i,2);
            int cubo = (int) Math.pow(i,3);

            System.out.println(i + " " + quadrado + " " + cubo);

        }
        sc.close();
    }
}
