package interfaces.empleados;

public class Main {
    public static void main(String[] args) {
        Comercial c1 = new Comercial("Pepe I", 37, 1000, 300);
        Repartidor r1 = new Repartidor("Pepe II", 26, 900, 3);

        c1.plus();
        r1.plus();

        System.out.println(c1);
        System.out.println(r1);
    }
}