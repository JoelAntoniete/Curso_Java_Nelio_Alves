package Secao10.ExercicioDeFixacao.Aplication;

import Secao10.ExercicioDeFixacao.entities.Aluno;
import Secao10.ExercicioDeFixacao.entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        /*
        Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
        que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
        de homens.
         */


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?  ");
        int qtd = sc.nextInt();

        Pessoas[] pessoas = new Pessoas[qtd];
        double maiorAltura = 0;
        double menorAltura = 0;
        double somaAlturasMulheres = 0;
        int numerosDeHomens = 0;


        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf("Altura da %da pessoa:", i+1);
            double altura = sc.nextDouble();
            if(altura > maiorAltura){
                maiorAltura = altura;
            } else if (altura < menorAltura) {
                menorAltura = altura;
            }

            System.out.printf("Genero da %da pessoa: ", i+1);
            char sexo = sc.next().toUpperCase().charAt(0);
            if(sexo == 'F'){
                somaAlturasMulheres += altura;
            }else if(sexo == 'M'){
                numerosDeHomens++;
            }
            pessoas[i] = new Pessoas(altura,sexo);
        }

        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.println("Media das alturas das mulheres = " + somaAlturasMulheres/ pessoas.length);
        System.out.println("Numero de homens = " + numerosDeHomens);



    }
}
