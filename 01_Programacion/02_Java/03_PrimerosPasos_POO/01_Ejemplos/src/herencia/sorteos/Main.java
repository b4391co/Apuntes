package herencia.sorteos;

public class Main {
    public static void main(String[] args) {
        Sorteo d1 = new Dado();
        Sorteo m1 = new Moneda();

        d1.lanzar();
        m1.lanzar();
    }
}