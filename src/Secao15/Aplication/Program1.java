package Secao15.Aplication;

import Secao15.Model.Entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room number: ");
        int number = sc.nextInt();
        System.out.println("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.println("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if(!checkOut.after(checkIn)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        }else{
            Reservation reservation = new Reservation(number, checkIn,checkOut);
            System.out.println(reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation:");

            System.out.println("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());
            reservation.updateDates(checkIn,checkOut);

            Date now = new Date();
            if (checkIn.before(checkOut) || checkOut.before(checkIn)){
                System.out.println("Error in reservation: Reservation dates for update must be future dates");
            }else if(!checkOut.after(checkIn)){
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            }else{
                reservation.updateDates(checkIn,checkOut);
                System.out.println("Reservation: " + reservation);
            }
        }
    }
}