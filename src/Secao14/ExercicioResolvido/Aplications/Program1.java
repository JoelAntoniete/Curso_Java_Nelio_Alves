package Secao14.ExercicioResolvido.Aplications;

import Secao14.ExercicioResolvido.Entities.ImportedProduct;
import Secao14.ExercicioResolvido.Entities.Product;
import Secao14.ExercicioResolvido.Entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.SimpleFormatter;

public class Program1 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int qtd = sc.nextInt();
        SimpleDateFormat smf = new SimpleDateFormat("dd/HH/yyyy");

        List<Product> list = new ArrayList<>();

        for (int i = 0; i < qtd; i++) {
            System.out.printf("Product #%d data:", i+1);
            System.out.print("Common, used or imported (c/u/i)? ");
            char x = sc.next().charAt(0);
            if(x == 'i'){
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Customs fee: ");
                double customFee = sc.nextDouble();

                Product product = new ImportedProduct(name, price, customFee);
                list.add(product);
            } else if (x == 'c') {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                double price = sc.nextDouble();

                Product product = new Product(name, price);
                list.add(product);
            } else if (x == 'u') {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = smf.parse(sc.next());

                Product product = new UsedProduct(name,price,date);
                list.add(product);
            }
        }

        System.out.println("PRICE TAGS:");
        for (Product p: list) {
            System.out.println(p.priceTag());
        }
    }
}
