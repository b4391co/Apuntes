package colecciones.almacen;

public class AguaMineral extends Bebida{
    private String origen;

    private final double AUMENTO_CRISTAL = 0.1;
    private final double DESCUENTO_AGUARON = 0.3;

    public AguaMineral(int identificador, String nombre, double precio, String marca, String localizacion, String envase, String origen) {
        super(identificador, nombre, precio, marca, localizacion, envase);
        this.precio += (envase.contains("cristal")) ? precio * AUMENTO_CRISTAL : 0;
        this.precio -= (marca.equalsIgnoreCase("aguaron")) ? precio * DESCUENTO_AGUARON : 0;
        this.origen = origen;
    }

}