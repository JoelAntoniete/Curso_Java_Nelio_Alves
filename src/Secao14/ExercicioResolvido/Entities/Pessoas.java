package Secao14.ExercicioResolvido.Entities;

public abstract class Pessoas {
    protected String name;
    protected double rendaAnual;

    public Pessoas(String name, double rendaAnual) {
        this.name = name;
        this.rendaAnual = rendaAnual;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }
    public abstract double taxa();

}
