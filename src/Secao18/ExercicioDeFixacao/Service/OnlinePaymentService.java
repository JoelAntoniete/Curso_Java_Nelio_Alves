package Secao18.ExercicioDeFixacao.Service;

public interface OnlinePaymentService {
    public double paymentFee(double amount);
    public double interest(double amount, int months);
}
