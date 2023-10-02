package Secao7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //introducao a bitwise
        int a = 89;
        int b = 60;

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);

        //o professor mostrou uma aplicacao como mascara, pra saber se o sexto bit é 1 ou 0
        Scanner sc = new Scanner(System.in);

        // 32 em binario 0010 0000
        int bitMask = 32; //foi escolhido 32 pois o 32 tem todos seus numeros como 0 apenas o sexto numero é 1


        //podemos tbem colocar ja como numero binario
        int bit = 0b100000;


        int n = sc.nextInt();
        if((n & bitMask) != 0){
            System.out.println("6th bit é 1");
        }else{
            System.out.println("6th bit é 0");
        }

        //funcoes String

        String original = "abcde FGHIJ ABC abc DEFG   ";
        System.out.println("Original string" + original);
        System.out.println(original.toLowerCase()); //tudo letra minuscula
        System.out.println(original.toUpperCase()); //tudo letra maiuscula
        System.out.println(original.trim()); //retira os espacos do comeco e fim da string
        System.out.println(original.substring(5)); //recorta a string da posicao 5 em diante
        System.out.println(original.substring(5,12)); //recorta a string da posicao entre 5 e 12
        System.out.println(original.replace('a', 'x')); //trocara a letra (a) por (x)
        System.out.println(original.replace("abc", "xy")); //trocara a letra (abc) por (xy)
        System.out.println(original.indexOf("bc")); //mostra o index inicial de (bc)
        System.out.println(original.lastIndexOf("bc")); //mostra o index a ultima ocorrencia  de (bc)

        String[] vect = original.split(" "); // separa com base no separador escolhido
        System.out.println(vect);

        //sintaxe funcoes;
        System.out.println("Digite 3 numeros");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int higher = max(n1,n2,n3);
        showResult(higher);


        sc.close();
    }
    public static int max(int a, int b, int c){
        if(a > b && a > c){
            return a;
        }else if(b > a && b > c){
            return b;
        }else{
            return c;
        }
    }

    public static void showResult(int a){
        System.out.println("O numero maior é " + a);
    }
}
