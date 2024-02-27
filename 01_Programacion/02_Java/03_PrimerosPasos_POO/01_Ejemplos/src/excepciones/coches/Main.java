package excepciones.coches;

import java.util.ArrayList;

public class Main {

    static ArrayList<Vehiculo> v = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println();
        agregarVehiculos();
        listar();
    }

    public static void listar() {
        v.stream().filter(v -> v.getMatricula() != null).forEach(System.out::println);
    }

    public static void agregarVehiculos() {
        try {
            v.add(new Vehiculo("1347ABC", "negro", "model", 2000));
        } catch (ExcepcionesVehiculo e) {
            e.getMessage();
        }
        try {
            v.add(new Vehiculo("137ABC", "negro", "model", 2000));
        } catch (ExcepcionesVehiculo e) {
            e.getMessage();
        }
        try {
            v.add(new Vehiculo("1347ABC", "negro", "model", 2000));
        } catch (ExcepcionesVehiculo e) {
            e.getMessage();
        }
    }

}