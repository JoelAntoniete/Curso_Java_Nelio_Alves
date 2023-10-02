package Secao14.Entities;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(int number, String holder, double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }
    public void updateBalance(){
        balance  += balance *  interestRate;
    }

    @Override
    //se colocarmos final no metodo, ele nao permite sobresccrita em uma subclasse
    public final void withdraw(double amount) {
       balance -=amount;
    }
}
