package Secao8.Exercises.Aplications;

import Secao8.Exercises.Entities.Retangle;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        /*Fazer um programa para ler os valores da largura e altura
        de um retângulo. Em seguida, mostrar na tela o valor de
        sua área, perímetro e diagonal. Usar uma classe como
        mostrado no projeto ao lado.*/

        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        Retangle retangle = new Retangle();

        retangle.height = sc.nextDouble();
        retangle.width = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", retangle.area());
        System.out.printf("PERIMETER = %.2f%n", retangle.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", retangle.diagonal());

        sc.close();
    }
}
