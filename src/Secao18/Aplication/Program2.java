package Secao18.Aplication;

public class Program2 {
    public static void main(String[] args) {


        //Problema do diamante
        devices.ConcretePrinter p = new devices.ConcretePrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        System.out.println();
        devices.ConcreteScanner s = new devices.ConcreteScanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());

        System.out.println();
        devices.ComboDevice c = new devices.ComboDevice("2081");
        c.processDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan result: " + c.scan());
    }
}
