package Secao6.Exercicio_Iniciante_Parte_3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        /*
        Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        exemplo.
         */

        Scanner sc = new Scanner(System.in);

        int gasolina = 0;
        int alcool = 0;
        int disel = 0;

        System.out.println("Digite seu comando");
        int comando = sc.nextInt();

        while(comando != 4){
            switch(comando){
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    disel++;
                    break;
                default:
                    System.out.println("Comando invalido");
            }
            System.out.println("Digite seu comando");
            comando = sc.nextInt();

        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Disel: " + disel);

        sc.close();
    }
}
