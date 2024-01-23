package herencia.electrodomesticos;

public class Lavavajillas extends Electrodomestico{
    private int numServicios;
    private final int CARGA_DEFAULT = 12;

    public Lavavajillas() {
        this.numServicios = CARGA_DEFAULT;
    }

    public Lavavajillas(double precioBase, double peso) {
        super(precioBase, peso);
        this.numServicios = CARGA_DEFAULT;
    }

    public Lavavajillas(double precioBase, String Color, char consumoEnergetico, double peso, int numServicios) {
        super(precioBase, Color, consumoEnergetico, peso);
        this.numServicios = numServicios;
    }

    public int getNumServicios() {
        return this.numServicios;
    }

    public void setNumServicios(int numServicios) {
        this.numServicios = numServicios;
    }

    public Double precioFinal() {
        return (this.numServicios >= CARGA_DEFAULT) ? super.precioFinal() + 60 : super.precioFinal();
    }

}