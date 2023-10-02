package Secao14.ExercicioResolvido.Entities;

public class PessoaFisica extends Pessoas{
    private double gastosComSaude;
    public PessoaFisica(String name, double rendaAnual, double gastos) {
        super(name, rendaAnual);
        this.gastosComSaude = gastos;
    }

    public double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public double taxa() {
        double value = 0;
        if(rendaAnual >= 20000){
            value = (rendaAnual * 0.25);
        }else{
            value = (rendaAnual * 0.15);
        }
        if(gastosComSaude > 0){
            value -= gastosComSaude* 0.5;
        }
        return value;
    }

    @Override
    public String toString() {
        return name + ": $ " + String.format("%.2f", taxa());
    }
}
