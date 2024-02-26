package excepciones.coches;
import java.util.ArrayList;

public class Main {

    static ArrayList<Vehiculo> v = new ArrayList<>();

    public static void main(String[] args) {
        agregarVehiculos();
        listar();
    }

    public static void listar() {
        v.stream().forEach(System.out::println);
    }
    
    public static void agregarVehiculos() {
        v.add(new Vehiculo("13A7ABC", "negro", "model", 2000));
        v.add(new Vehiculo("137ABC", "negro", "model", 2000));
        v.add(new Vehiculo("1347ABC", "negro", "model", 2000));
        v.add(new Vehiculo("1347ABC", "negro", "model", 2000));
        v.add(new Vehiculo("1347ABC", "negro", "model", 2000));
    }


}