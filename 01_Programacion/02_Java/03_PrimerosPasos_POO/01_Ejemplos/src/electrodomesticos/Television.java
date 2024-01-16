package electrodomesticos;

public class Television extends Electrodomestico{
    private int resolucion;
    private boolean sintonizadorTv;

    private final int RESOLICION_DEFAULT = 32;
    private final boolean SINTONIZADOR_DEFAULT = false;

    public Television() {
        this.resolucion = RESOLICION_DEFAULT;
        this.sintonizadorTv = SINTONIZADOR_DEFAULT;
    }
    
    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = RESOLICION_DEFAULT;
        this.sintonizadorTv = SINTONIZADOR_DEFAULT;
    }
    
    public Television(double precioBase, String Color, char consumoEnergetico, double peso, int resolucion,
            boolean sintonizadorTv) {
        super(precioBase, Color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTv = sintonizadorTv;
    }

    public int getResolucion() {
        return this.resolucion;
    }

    public boolean isSintonizadorTv() {
        return this.sintonizadorTv;
    }

    public Double precioFinal() {
        Double precioFinal = super.precioFinal();
        precioFinal *= (this.resolucion > 40) ? 1.3 : 1;
        precioFinal += this.sintonizadorTv ? 50 : 0;
        return precioFinal;
    }
}