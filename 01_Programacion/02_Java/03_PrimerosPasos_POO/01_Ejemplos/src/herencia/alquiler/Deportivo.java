package herencia.alquiler;

public class Deportivo extends Vehiculo{
    private int cilidrada;

    public Deportivo(String matricula, String marca, String modelo, String color, double tarifa, int cilidrada) {
        super(matricula, marca, modelo, color, tarifa);
        this.cilidrada = cilidrada;
    }

    public int getCilidrada() {
        return cilidrada;
    }
    
}