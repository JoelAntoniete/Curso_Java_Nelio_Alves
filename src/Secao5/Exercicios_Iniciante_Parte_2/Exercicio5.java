package Secao5.Exercicios_Iniciante_Parte_2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        /*
        Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        seguir, calcule e mostre o valor da conta a pagar.
         */

        Scanner sc = new Scanner(System.in);
        double conta = 0;

        System.out.println("Digite um num do produto: ");
        int produto = sc.nextInt();

        System.out.println("Digite a quantidade: ");
        double qtd = sc.nextDouble();

        sc.close();

        if(produto == 1){
            conta = 4 * qtd;
        } else if (produto == 2) {
            conta = 4.50 * qtd;
        } else if (produto == 3) {
            conta = 5 * qtd;
        } else if (produto == 4) {
            conta = 2 * qtd;
        } else if(produto == 5){
            conta = 1.5 * qtd;
        }else{
            System.out.println("Valor invalido");
        }

        System.out.printf("Total: R$ %.2f%n", conta);


    }
}
