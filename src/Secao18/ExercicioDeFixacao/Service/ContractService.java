package Secao18.ExercicioDeFixacao.Service;

import Secao18.ExercicioDeFixacao.Entities.Contract;
import Secao18.ExercicioDeFixacao.Entities.Installment;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){
        double value = contract.getTotalValue() / months;

        for(int i = 1; i <= months;i++){
            LocalDate date = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(value, i);
            double fee = onlinePaymentService.paymentFee(interest + value);
            double cota = value + interest + fee;
            contract.getInstallments().add(new Installment(date, cota));
        }


    }
}
