package Secao4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ola Mundo!");

        //Primeira declaracao de variaveis
        int n = 5+6;
        System.out.println(n);

        double d = 5.4556 * 12.55;
        System.out.println(d);

        //printar num formatado, com duas casas decimais
        System.out.printf("%.2f%n", d);
        System.out.printf("%.4f%n", d); //ele arredonda o num

        //usaremos o Locale pra formatar em formato americano
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", d);

        //concatenação
        System.out.println("Resultado = " + d + " Metros");
        System.out.printf("Resultado = %.2f Metros%n", d);
        System.out.printf("Resultado = %.2f Metros%n",d);

        //formatação com mais variaveis
        String nome = "Maria";
        int idade = 31;
        double renda = 4500.90;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",nome,idade,renda);

        //entrada de dados
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome1 = sc.next();


        System.out.println("Digite sua idade");
        int idad = sc.nextInt();


        System.out.println("Digite seu salario");
        double salary = sc.nextDouble();

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",nome1,idad,salary);

        //primeira litra de uma palavra
        System.out.println("digite uma palavra");
        char x = sc.next().charAt(0);
        System.out.println(x);

        //Coletar uma frase inteira
        System.out.println("Digite uma frase");
        String frase = sc.nextLine();
        System.out.println(frase);

        sc.close();

        //funcoes matematicas

        double raizQuadrada = Math.sqrt(16);
        double potencia = Math.pow(5,2);
        double valorAbsoluto = Math.abs(-12);
        double valorAbsoluto2 = Math.abs(12);
        System.out.println(raizQuadrada);
        System.out.println(potencia);
        System.out.println(valorAbsoluto);
        System.out.println(valorAbsoluto2);




    }
}
