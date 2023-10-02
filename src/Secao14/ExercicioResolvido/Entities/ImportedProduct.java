package Secao14.ExercicioResolvido.Entities;

public class ImportedProduct extends  Product{
    private double customFee;


    public ImportedProduct(String name, double price, double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(double customFee) {
        this.customFee = customFee;
    }

    public double totalPrice(){
        return price += customFee;
    }

    @Override
    public String priceTag() {
        return name + " $ "+ totalPrice() + "(Customs fee: $ " + customFee + ")";
    }
}
