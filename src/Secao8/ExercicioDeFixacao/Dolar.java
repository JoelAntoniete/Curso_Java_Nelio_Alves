package Secao8.ExercicioDeFixacao;

public class Dolar {
    public static double IOF = 0.06;

    public static double currencyConverter(double value, double qtd){
        return value * qtd * (1.0 + IOF) ;
    }
}
