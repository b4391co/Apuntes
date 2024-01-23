package herencia.alquiler;

public class Turismo extends Vehiculo{
    private int numPuertas;
    private boolean automatico;

    public Turismo(String matricula, String marca, String modelo, String color, double tarifa, int numPuertas, boolean automatico) {
        super(matricula, marca, modelo, color, tarifa);
        this.numPuertas = numPuertas;
        this.automatico = automatico;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public boolean isAutomatico() {
        return automatico;
    }


}