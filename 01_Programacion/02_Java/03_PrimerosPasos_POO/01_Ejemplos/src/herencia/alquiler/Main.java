package herencia.alquiler;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n");
        Cliente c1 = new Cliente("Pepe", "12345A");
        Vehiculo v1 = new Vehiculo("1234 ABC", "Audi", "A1", "negro", 20);

        Alquiler a1 = new Alquiler(c1, v1, LocalDate.now(), 20);

        a1.getCliente();

        System.out.println(a1.getCliente().getNombre());
    }
}