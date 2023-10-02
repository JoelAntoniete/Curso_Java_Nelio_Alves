package Secao6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //While

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;

        while(x != 0){
            soma += x;
            x = sc.nextInt();
        }

        System.out.println("Valor total é " + soma);

        //for
        int total= 0;

        System.out.println("Digite o quantidade de somas ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite um valor pra soma: ");
            int valor = sc.nextInt();

            total += valor;
        }

        System.out.println("Valor da soma total: " + total);

    }
}
