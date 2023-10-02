package Secao10.ExercicioDeFixacao.Aplication;

import Secao10.ExercicioDeFixacao.entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
        devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
        da pessoa mais velha.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?  ");
        int qtd = sc.nextInt();

        Pessoas[] pessoas = new Pessoas[qtd];
        int maior = 0;
        String nomePessoa = "";

        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf("Dados da %da pessoa: ", i+1);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            if(idade > maior){
                maior = idade;
                nomePessoa = nome;
            }
            pessoas[i] = new Pessoas(nome,idade);
        }
        System.out.printf("PESSOA MAIS VELHA: " + nomePessoa);
    }
}
