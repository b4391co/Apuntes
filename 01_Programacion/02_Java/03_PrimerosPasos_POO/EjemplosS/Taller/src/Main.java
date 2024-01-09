import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> Vehiculos = new ArrayList<>();
        Util util = new Util();

        Coche coche1 = new Coche("Dacia", 4, 4, "gasolina", 8, "1234 ABC");
        Coche coche2 = new Coche("Fiat", 2, 4,"diesel",6,"5432 AAB");
        Moto moto1 = new Moto("Yamaha", 2, "gasolina", 7, "9999 BBB");
        Bicicleta bici1 = new Bicicleta("BH", 2, "electrico", 8);

        Vehiculos.add(coche1);
        Vehiculos.add(coche2);
        Vehiculos.add(moto1);
        Vehiculos.add(bici1);

        for(Vehiculo vehiculo: Vehiculos){
            System.out.println(vehiculo.cobrar(vehiculo.reparar(vehiculo.calcularHoras())));
        }
    }
}
