package Secao4.Exercicio_Iniciante_Parte_1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        /*
        Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor");
        double valor = sc.nextDouble();

        sc.close();
        double valor_final = 3.14159 * Math.pow(valor,2);

        System.out.printf("A= %.4f%n", valor_final);
    }
}
