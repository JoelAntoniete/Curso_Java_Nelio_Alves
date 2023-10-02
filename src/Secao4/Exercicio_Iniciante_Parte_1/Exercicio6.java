package Secao4.Exercicio_Iniciante_Parte_1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        /*
        Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.
         */

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Valor de A");
        double a = sc.nextDouble();
        System.out.println("Valor de B");
        double b = sc.nextDouble();
        System.out.println("Valor de C");
        double c = sc.nextDouble();

        System.out.printf("TRIANGULO: %.3f%n", (a * c) / 2);
        System.out.printf("CIRCULO: %.3f%n", 3.14159 * Math.pow(c,2));
        System.out.printf("TRAPEZIO: %.3f%n", (a + b) * c / 2);
        System.out.printf("QUADRADO:  %.3f%n", Math.pow(b,2));
        System.out.printf("RETANGULO: %.3f%n", a * b);


    }
}
