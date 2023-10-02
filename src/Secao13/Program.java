package Secao13;

import Secao13.Entities.Order;
import Secao13.Entities.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        //Usando enums
        Order order = new Order(1080,new Date(), OrderStatus.PEDINNG_PAYMENT);
        System.out.println(order);

        //converter string para enums
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
