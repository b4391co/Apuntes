package colecciones.almacen;

public class Alimentacion extends Producto {
    private String categoria;
    private boolean gluten;

    public Alimentacion(int identificador, String nombre, double precio, String marca, String localizacion,
            String categoria, boolean gluten) {
        super(identificador, nombre, precio, marca, localizacion);
        this.categoria = categoria;
        this.gluten = gluten;
    }
}