package Secao6.Exercicio_Iniciante_Parte_3;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        /*
        Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
        cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
        menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite valor de X: ");
        int x = sc.nextInt();

        System.out.println("Digite valor de Y: ");
        int y = sc.nextInt();

        while(x != 0 || y != 0){
            if (x > 0.0 && y > 0.0) {
                System.out.println("primeiro");
            }
            else if (x < 0.0 && y > 0.0) {
                System.out.println("segundo");
            }
            else if (x < 0.0 && y < 0.0) {
                System.out.println("terceiro");
            }
            else {
                System.out.println("quarto");
            }

            System.out.println("Digite valor de X: ");
            x = sc.nextInt();

            System.out.println("Digite valor de Y: ");
            y = sc.nextInt();
        }
        sc.close();
    }
}
