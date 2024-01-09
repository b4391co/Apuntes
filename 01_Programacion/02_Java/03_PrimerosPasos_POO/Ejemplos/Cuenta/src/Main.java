public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Pepe", 12);

        System.out.println(cuenta1.getCantidad());
        cuenta1.ingresar(10);
        System.out.println(cuenta1.getCantidad());
    }
}