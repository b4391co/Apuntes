package banco;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Pepe", 15);
        Titular t1 = new Titular();
        Titular t2 = new Titular("Pepe", LocalDate.of(1990, 11, 20), "87654321B" , 'H', "Casa");
        Titular t3 = new Titular("Pepe", LocalDate.of(2020, 11, 20), "87654321B" , 'H', "Casa");

        System.out.println(t2.esMayorDeEdad());
        System.out.println(t3.esMayorDeEdad());

        //System.out.println(cuenta1.getCantidad());
        //cuenta1.ingresar(1000);
        //System.out.println(cuenta1.getCantidad());
    }
}