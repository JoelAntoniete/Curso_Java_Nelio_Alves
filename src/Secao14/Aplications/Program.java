package Secao14.Aplications;

import Secao14.Entities.Account;
import Secao14.Entities.BusinessAccount;
import Secao14.Entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(123,"alex",4000);
        BusinessAccount bacc = new BusinessAccount(456, "maria", 0,500);

        //upcasting
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1452, "bob", 0, 200);
        Account acc3 = new SavingsAccount(1452, "bob", 0, 0.01);

        //downcast
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100);

        //BusinessAccount acc5 = (BusinessAccount) acc3;

        //testar se uma classe é instancia de outra classe
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(500);

        }
    }
}
