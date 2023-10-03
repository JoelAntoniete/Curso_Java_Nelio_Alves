package Secao15.Aplication;


import Secao15.Model.Entities.Account;
import Secao15.Model.Esceptions.AccontException;
import com.sun.jdi.Location;

import java.util.Scanner;

public class Program2 {
    /*
    Fazer um programa para ler os dados de uma conta bancária e depois realizar um
    saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
    ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de
    saque da conta. Implemente a conta bancária conforme projeto abaixo:
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        String holder = sc.next();
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double limit = sc.nextDouble();

        Account acc = new Account(number, holder, balance,limit);

        System.out.println("Enter amount for withdraw: ");
        double withsdraw = sc.nextDouble();
        try {
            acc.witgdraw(withsdraw);
            System.out.println("New balance: " + acc.getBalance());
        } catch (AccontException e) {
            System.out.println(e);
        }


    }
}
