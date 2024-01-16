package electrodomesticos;

public class Main {
    public static void main(String[] args) {
        Electrodomestico[] eArray = new Electrodomestico[10];
        eArray[0] = new Electrodomestico(50, "rojo", 'A', 50);
        eArray[1] = new Electrodomestico(150, "blanco", 'F', 10);
        eArray[2] = new Electrodomestico(70, "azul", 'D', 30);
    }
}