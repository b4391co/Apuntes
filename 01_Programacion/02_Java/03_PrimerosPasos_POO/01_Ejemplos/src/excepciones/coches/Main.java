package excepciones.coches;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("1347ABC", "negro", "model", 2000);
        System.out.println(v1.getMatricula());
        System.out.println(v1.getColor());
    }
}