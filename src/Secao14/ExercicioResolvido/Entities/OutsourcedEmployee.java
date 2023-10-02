package Secao14.ExercicioResolvido.Entities;

public class OutsourcedEmployee extends  Employee{

    private Double additional;
    public OutsourcedEmployee(String name, int hours, double valuePerHour, double additional) {
        super(name, hours, valuePerHour);
        this.additional = additional;
    }

    public Double getAdditional() {
        return additional;
    }

    public void setAdditional(Double additional) {
        this.additional = additional;
    }

    @Override
    public double payment() {
        return super.payment() + additional * 1.1;
    }
}
