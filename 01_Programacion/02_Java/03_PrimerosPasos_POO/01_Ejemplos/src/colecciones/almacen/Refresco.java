package colecciones.almacen;

public class Refresco extends Bebida{
    private int porcAzucar;
    private boolean promocion;

    private final double DESCUENTO_PROMOCION = 0.15;
    private final double DESCUENTO_LATA = 0.05;
    private final double AUMENTO_AZUCAR = 0.1;

    public Refresco(int identificador, String nombre, double precio, String marca, String localizacion, String envase, int porcAzucar, boolean promocion) {
        super(identificador, nombre, precio, marca, localizacion, envase);
        this.precio -= (promocion) ? precio * DESCUENTO_PROMOCION : 0;
        this.precio -= (envase.equals("lata")) ? precio * DESCUENTO_LATA : 0;
        this.precio += (porcAzucar > 10) ? precio * AUMENTO_AZUCAR : 0;
        this.porcAzucar = porcAzucar;
        this.promocion = promocion;
    }

    @Override
    public String toString() {
        return super.toString() + " - Refresco [porcAzucar=" + porcAzucar + ", promocion=" + promocion + "]";
    }
    
}