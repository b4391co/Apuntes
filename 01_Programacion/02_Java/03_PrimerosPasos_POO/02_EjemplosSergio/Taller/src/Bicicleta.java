public class Bicicleta extends Vehiculo {

    public Bicicleta(String marca, int ruedas, String motor, int estado_motor) {
        super(marca, ruedas, motor, estado_motor);
    }
    public double calcularHoras(){
        return ((10 - getEstado_motor())/3) * 1;
    }
}