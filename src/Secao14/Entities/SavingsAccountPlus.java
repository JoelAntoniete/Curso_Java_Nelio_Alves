package Secao14.Entities;

public final class SavingsAccountPlus extends SavingsAccount{
    //se colocamos final no titulo da classe,ela nao permite criarmos subclasses com SavingsAccountPlus
    public SavingsAccountPlus(int number, String holder, double balance, double interestRate) {
        super(number, holder, balance, interestRate);
    }
}
