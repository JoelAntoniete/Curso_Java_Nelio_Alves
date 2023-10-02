package Secao9.ExercicioDeFixacao;

public class Conta {
    private int count;
    private String name;
    private double balance;

    public Conta(int count, String name, double balance) {
        this.count = count;
        this.name = name;
        this.balance = balance;
    }

    public Conta(int count, String name) {
        this.count = count;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value){
        this.balance += value;
    }

    public void withdraw(double value){
        this.balance -= (value + 5.00);
    }

    @Override
    public String toString() {
        return "Account "+ count + ",  Holder: "
                + name + ", Balance: $ " + balance;
    }
}
