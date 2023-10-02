package Secao5.Exercicios_Iniciante_Parte_2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        /*
        Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
         */

        Scanner sc = new Scanner(System.in);
        int hora = 0;

        System.out.println("Digite a hora inicial: ");
        int inicio = sc.nextInt();

        System.out.println("Digite a hora final: ");
        int fim = sc.nextInt();

        sc.close();

        if(inicio < fim){
            hora = inicio - fim;
        }else{
            hora = 24 - inicio + fim;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", hora);
    }
}
