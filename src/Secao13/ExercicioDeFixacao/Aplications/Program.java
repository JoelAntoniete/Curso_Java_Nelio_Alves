package Secao13.ExercicioDeFixacao.Aplications;

import Secao13.ExercicioDeFixacao.Entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<OrderItem> orderItems = new ArrayList<>();


        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY):  ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name,email,birthDate);

        System.out.println("Enter order data:\n");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), orderStatus, client);

        System.out.print("How many items to this order?");
        int qtd = sc.nextInt();
        for (int i = 0; i < qtd; i++) {
            System.out.printf("Enter #%d item data:\n", i+1);
            System.out.print("Product name:  ");
            String nameProduct = sc.next();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(nameProduct, productPrice);

            OrderItem orderItem = new OrderItem(quantity,productPrice,product);
            order.addItem(orderItem);


        }
        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        sc.close();
    }
}
