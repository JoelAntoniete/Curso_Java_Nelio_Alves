package Secao10.applications;

import Secao10.entities.Produtos;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro N e os dados (nome e
        preço) de N Produtos. Armazene os N produtos em um vetor. Em
        seguida, mostrar o preço médio dos produtos.
         */

        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos:  ");
        int qtd = sc.nextInt();

        Produtos[] vec = new Produtos[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite o nome do produto: ");
            sc.nextLine();
            String  name = sc.nextLine();

            System.out.print("Digite o valor: ");
            double valor = sc.nextDouble();

           vec[i] =  new Produtos(name, valor);
        }

        double media = 0;
        for (int i = 0; i < qtd; i++) {
            media += vec[i].getPreco();
        }

        System.out.println("O valor da média é" + media / qtd);


    }
}
