package Secao6.Exercicio_Iniciante_Parte_3.for_exercise;

import java.util.Scanner;

public class forExercicio2 {
    public static void main(String[] args) {
        /*
        Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
        essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
         */

        Scanner sc = new Scanner(System.in);
        int in = 0;
        int out = 0;

        System.out.println("Digite a quantidade de valore: ");
        int tamanho = sc.nextInt();

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o valor: ");
            int valor = sc.nextInt();

            if(valor < 10 || valor > 20){
                out++;
            }else{
                in++;
            }
        }

        System.out.println("in : " + in);
        System.out.println("out : " + out);
        sc.close();
    }
}
