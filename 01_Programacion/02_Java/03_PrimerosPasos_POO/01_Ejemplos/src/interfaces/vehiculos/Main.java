package interfaces.vehiculos;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Turismo();
        Vehiculo v2 = new Turismo();
        Vehiculo v3 = new Turismo();
        Vehiculo v4 = new Turismo();

        v1.getVelocidad();
        v1.acelerar(130);
        v1.getVelocidad();
        v1.frenar(10);
        v1.getVelocidad();
    }    
}