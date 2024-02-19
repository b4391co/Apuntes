package colecciones.almacen;

public class Bebida extends Producto {
    private String envase;

    public Bebida(int identificador, String nombre, double precio, String marca, String localizacion, String envase) {
        super(identificador, nombre, precio, marca, localizacion);
        this.envase = envase;
    }
}
