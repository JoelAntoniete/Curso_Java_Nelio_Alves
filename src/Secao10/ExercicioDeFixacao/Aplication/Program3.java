package Secao10.ExercicioDeFixacao.Aplication;

import Secao10.ExercicioDeFixacao.entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
        tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
        bem como os nomes dessas pessoas caso houver.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade: ");
        int qtd = sc.nextInt();

        Pessoas[] pessoas = new Pessoas[qtd];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf("Dados da %da pessoa", i+1);
            System.out.println();

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoas(nome,idade,altura);
        }

        double soma = 0;
        int menores = 0;

        System.out.println("Pessoas menores de 16 anos");
        for (int i = 0; i < pessoas.length; i++) {
            soma += pessoas[i].getAltura();
            if(pessoas[i].getIdade() <= 16){
                menores++;
                System.out.println(" " + pessoas[i].getNome());
            }
        }


        System.out.println("Porcentagem de Pessoas com menos de 16 anos: " + (menores * 100) / pessoas.length);
        System.out.printf("Altura média: %.2f%n", soma / pessoas.length);

    }
}
