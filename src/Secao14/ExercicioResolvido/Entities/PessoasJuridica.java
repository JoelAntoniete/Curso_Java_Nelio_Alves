package Secao14.ExercicioResolvido.Entities;

public class PessoasJuridica extends Pessoas{
    private int numeroFuncionarios;
    public PessoasJuridica(String name, double rendaAnual, int funcionarios) {
        super(name, rendaAnual);
        this.numeroFuncionarios = funcionarios;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double taxa() {
        double value = 0;
        if(numeroFuncionarios >= 10){
            value += rendaAnual * 0.14;
        }else {
            value += rendaAnual * 0.16;
        }
        return value;
    }

    @Override
    public String toString() {
        return name + ": $ " + String.format("%.2f", taxa());
    }
}
