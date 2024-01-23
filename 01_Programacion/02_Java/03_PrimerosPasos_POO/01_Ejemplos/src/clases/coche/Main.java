package clases.coche;

public class Main {
    public static void main(String[] args) {
        Consumo c1 = new Consumo(200, 30, 80, 1, 5);

        System.out.println(c1.consumoMedio());
    }
}