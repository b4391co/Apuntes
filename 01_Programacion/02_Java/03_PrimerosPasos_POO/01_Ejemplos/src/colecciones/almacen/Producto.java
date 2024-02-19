package colecciones.almacen;

public class Producto {
    private int identificador;
    private String nombre;
    protected double precio;
    private String marca;
    private String localizacion;

    public Producto(int identificador, String nombre, double precio, String marca, String localizacion) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.localizacion = localizacion;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    @Override
    public String toString() {
        return "Producto [identificador=" + identificador + ", nombre=" + nombre + ", precio=" + String.format("%.2f", precio) + ", marca="
                + marca + ", localizacion=" + localizacion + "]";
    }
}