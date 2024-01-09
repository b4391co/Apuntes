package Banco;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Pepe", 15);

        System.out.println(cuenta1.getCantidad());
        cuenta1.ingresar(1000);
        System.out.println(cuenta1.getCantidad());
    }
}