package Secao10.ExercicioDeFixacao.Aplication;

import Secao10.ExercicioDeFixacao.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
        no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
        os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
        igual a 6.0 (seis).
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?  ");
        int qtd = sc.nextInt();

        Aluno[] alunos = new Aluno[qtd];


        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Primeiro semestre: ");
            double primeiro = sc.nextDouble();

            System.out.print("Segundo semestre: ");
            double segundo = sc.nextDouble();

            double media = (primeiro + segundo) / 2;
            alunos[i] = new Aluno(nome, media);
        }

        System.out.println("Alunos aprovados:  ");
        for (int i = 0; i < alunos.length; i++) {
            if(alunos[i].getMediaNota() >= 6.0){
                System.out.println(alunos[i].getNome());
            }
        }
    }
}
