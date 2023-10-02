package Secao5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite que horas sao: ");
        int hora = sc.nextInt();

        if(hora < 12){
            System.out.println("Bom dia!");
        }else if(hora >= 12 && hora <= 18){
            System.out.println("Boa tarde");
        }else {
            System.out.println("Boa noite");
        }

        //switch

        System.out.println("Digite o dia da semana: ");
        int dia = sc.nextInt();

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Valor errado");
        }

        //condicao ternaria
        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println("O preco do desconto é " + desconto);

    }
}
