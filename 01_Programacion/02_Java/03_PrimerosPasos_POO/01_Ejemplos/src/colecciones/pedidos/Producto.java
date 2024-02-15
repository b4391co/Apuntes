package colecciones.pedidos;

public class Producto {
    private String nombre;
    private int id;


    public Producto(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", id=" + id + "]";
    }
    
}