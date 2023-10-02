package Secao10.ExercicioDeFixacao.Aplication;

import Secao10.ExercicioDeFixacao.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
        N funcionários. Não deve haver repetição de id.
        Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
        Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
        mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
        conforme exemplos.
        Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
        ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
        aumento por porcentagem dada
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?  ");
        int qtd = sc.nextInt();
        List<Employee> funcionario = new ArrayList<>();

        for (int i = 0; i < qtd; i++) {
            System.out.printf("Emplyoee #%d", i+1);
            System.out.print("ID:  ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            funcionario.add(new Employee(id,name,salary));

        }

        System.out.println("Enter the employee id that will have salary increase :  ");
        int id = sc.nextInt();
        System.out.println("Enter the percentage:  ");
        double porcentagem = sc.nextDouble();
        Employee emp = funcionario.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if(emp == null){
            System.out.println("Id invalido");
        }else{
            emp.porcentagem(porcentagem);
        }

        for (Employee e: funcionario) {
            System.out.println(e);
        }
    }
}
