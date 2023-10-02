package Secao14.ExercicioResolvido.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class UsedProduct extends  Product{
    private Date manofactureDate;
    SimpleDateFormat smf = new SimpleDateFormat("dd/HH/yyy");

    public UsedProduct(String name, double price, Date manofactureDate) {
        super(name, price);
        this.manofactureDate = manofactureDate;
    }

    public Date getManofactureDate() {
        return manofactureDate;
    }

    public void setManofactureDate(Date manofactureDate) {
        this.manofactureDate = manofactureDate;
    }

    @Override
    public String priceTag() {
        return name + " (used) $ " + price + " (Manufacture date: " + smf.format(manofactureDate) + ")";
    }
}
