package Secao14.ExercicioResolvido.Aplications;

import Secao14.ExercicioResolvido.Entities.Employee;
import Secao14.ExercicioResolvido.Entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees:  ");
        int qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            System.out.printf("Employee #%d data:", i+1);
            System.out.print("Outsourced (y/n)?  ");
            char value = sc.next().charAt(0);
            if(value == 'n'){
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();

                Employee emp = new Employee(name, hours,valuePerHour);
                list.add(emp);
            }else if(value == 'y'){
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                System.out.print("Additional charge: ");
                double additional = sc.nextDouble();

                Employee emp =new OutsourcedEmployee(name, hours,valuePerHour,additional);
                list.add(emp);
            }else{
                System.out.println("Opção invalida!");
            }
        }
        for (Employee e: list) {
            System.out.println(e);
        }

    }
}
