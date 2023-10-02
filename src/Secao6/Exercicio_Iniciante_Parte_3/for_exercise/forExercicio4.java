package Secao6.Exercicio_Iniciante_Parte_3.for_exercise;

import java.util.Locale;
import java.util.Scanner;

public class forExercicio4 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
        segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho: ");
        int tamanho = sc.nextInt();

        for (int i = 0; i < tamanho; i++) {

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            if(b == 0){
                System.out.println("divisao impossivel");
            }else {
                System.out.printf("%.1f%n",a / b);
            }
        }
        sc.close();

    }
}
