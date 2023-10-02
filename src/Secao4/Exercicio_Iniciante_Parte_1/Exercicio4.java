package Secao4.Exercicio_Iniciante_Parte_1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        /*
        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        decimais.
         */

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("num de funcionarios = ");
        int funcionarios = sc.nextInt();
        System.out.print("num de horas = ");
        int horas = sc.nextInt();
        System.out.print("Valor das horas = ");
        double valorHoras = sc.nextDouble();

        sc.close();

        System.out.println("NUMBER = "+ funcionarios);
        System.out.printf("SALARY = U$ %.2f%n",horas * valorHoras);

    }
}
