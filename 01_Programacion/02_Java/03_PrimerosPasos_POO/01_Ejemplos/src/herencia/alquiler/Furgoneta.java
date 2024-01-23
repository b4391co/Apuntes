package herencia.alquiler;

public class Furgoneta extends Vehiculo{
    private double carga;
    private double volumen;

    public Furgoneta(String matricula, String marca, String modelo, String color, double tarifa, double carga,
            double volumen) {
        super(matricula, marca, modelo, color, tarifa);
        this.carga = carga;
        this.volumen = volumen;
    }

    public double getCarga() {
        return carga;
    }

    public double getVolumen() {
        return volumen;
    }
    
}