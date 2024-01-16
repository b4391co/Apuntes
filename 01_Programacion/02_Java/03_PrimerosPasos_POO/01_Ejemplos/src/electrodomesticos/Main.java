package electrodomesticos;

public class Main {
    public static void main(String[] args) {
        Electrodomestico e1 = new Electrodomestico(50, "NeGro", 'b', 50);

        System.out.println(e1.getColor());
        System.out.println(e1.getConsumoEnergetico());
        System.out.println(e1.getPrecioBase());
        System.out.println();
        e1.precioFinal();
    }
}